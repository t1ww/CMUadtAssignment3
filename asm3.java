import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * @author Narongchai Rongthong
 * 652115013
 * written on 18/03/2023
 * https://github.com/t1ww
 */

public class asm3 {
    public static void main(String[] args) throws FileNotFoundException {
////Starting the program
        System.out.println("\n/////!!!! STARTING THE PROGRAM \n");
//
        Scanner scan = new Scanner(new File("input1.txt"));
        if(args.length != 0){
            scan = new Scanner(new File(args[0]));
        }


        Stacks stk;
        // one loop of while should process and done conversion with output
        int w = 1;
        while(scan.hasNextLine()){
        System.out.println("line > " + w++);
            String dataLine = scan.nextLine();
            String d = dataLine;
            System.out.println("infix : " + dataLine);
/////// validation
            /// we make another loop to do validation of the infix expression
            stk = new Stacks();
            Stacks stkp = new Stacks();
            System.out.print("validation : ");
            String valid = "valid";
            for(char c : d.toCharArray()){ // iteration get each char to c
                switch(c){
                    // case operands add to stack if stack is empty
                    default :
                        if(stk.isEmpty()){
                            stk.push(c);
                        }else{
                            //pop 3 times
                            for (int i = 0; i < 2; i++) {
                                if(stk.isEmpty()){
                                    valid = "invalid";
                                }
                                stk.pop(false);
                            }
                            //turn it into a result
                            stk.push('r');//using placeholder
                        }
                    break;
                    // case operator
                    case '+' :
                    case '-' :
                    case '*' :
                    case '/' :
                    case '^' :
                        stk.push(c);
                    break;
                    // parenthesis
                    case '(' :
                        stkp.push(c);
                    break;
                    case ')' :
                        stkp.pop(false);
                    break;
                    // unrelevant (we just ignore it)
                    case '$' :
                    break;
                }
            }
            System.out.print(valid);

/////// conversion
if(valid == "valid") { //conversion
            d = dataLine;
            System.out.print("\npostfix : ");
            /// we make another loop to do conversion and then print out result after this loop is done
            stk = new Stacks();
            for(char c : d.toCharArray()){ // iteration get each char to c
                switch(c){
                    // case operands, just output it
                    default :
                        System.out.print(c);
                    break;
                    // case operator
                    case '+' :
                    case '-' :
                    case '*' :
                    case '/' :
                    case '^' :
                        // if stack is empty || precedence of the scanned operator is greater than in the stack
                        if(stk.isEmpty() || precedenceLevel(c) > precedenceLevel(stk.getHead().data)){
                            stk.push(c);
                        }else{
                            while(precedenceLevel(c) <= precedenceLevel(stk.getHead().data)){
                                stk.pop();
                                if(stk.isEmpty())break;
                            }
                            stk.push(c);
                        }
                    break;
                    case '(' :
                        stk.push(c);
                    break;
                    case ')' :
                        while(stk.getHead().getData() != '('){
                            stk.pop();
                        }
                        stk.pop();
                    break;
                    case '$' :
                    break;
                }
            }
            // clear the rest of the stack
            stk.clear(true); // set true to output
            
        }
            // new line for next dataline
            System.out.println("\n");
            //
}

////end program
        scan.close();
        System.out.println("/////!!!! END PROGRAM ?(TERMINATED SUCCESSFULLY)\n");
    }
    
// comparing precedence
public static int precedenceLevel(char op) {
        switch (op) {
            case '+':
            case '-':
                return 0;
            case '*':
            case '/':
                return 1;
            case '^':
                return 2;
            default:
                return -1;
        }
    }
}
