# CMUadtAssignment3 : main is in asm3.java
# assignment instruction
 Infix to Postfix conversion with Linked-list-based stack
                                    (making stack with linked-list)

        Infix to post-fix conversion with Java (use your owned stack class with linked list implemented). Your 
        program needs to have Node and Stack class. 
            Program Requirements:
            > read input from file (input1.txt) from command line argument. Input 2 will not be 
            provided. (2 points)
            > check if incoming expression is a valid infix expression (4 points)
            > convert to postfix using stack with linked-list based data structure (4 points)

# Expected program output:

        Expression 1: 
            Infix exp:$a-b/(c+d-e)*(f^g*h+i)$ 
            Postfix exp: abcd+e-/fg^h*i+*-

        Expression 2: 
            Infix exp:$1+2+3^4$ 
            Postfix exp: $12+34^+$

# Program instruction
# Example program output:

            /////!!!! STARTING THE PROGRAM

            line > 1
            infix : $a-b/(c+d-e)*(f^g*h+i)$
            validation : valid
            postfix : abcd+e-/fg^h*i+*-

            line > 2
            infix : $1+2+3^4$
            validation : valid
            postfix : 12+34^+

            line > 3
            infix : $a-b/(c+d-e)*(f^g*h+ia)$
            validation : invalid

            line > 4
            infix : asadaf+++--
            validation : invalid

            /////!!!! END PROGRAM ?(TERMINATED SUCCESSFULLY)

# Instructions

        > Use asm3 file for main to run the program
        > Use input1.txt to input data to the program to process
        > Terminal run with argument, argument 0 is the input file's path
        > example :
            > javac .\asm3.java .\node.java .\Stacks.java
            > java .\asm3.java "input1.txt"
