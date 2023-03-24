public class Stacks { //linkedlist
    // var init
    private node head;
    private node tail;
    // head
    public void setHead(node head){
        this.head = head;
    }
    public node getHead() {
        return this.head;
    }
    // tail
    public void setTail(node tail){
        this.tail = tail;
    }
    public node getTail(){
        return this.tail;
    }
    //
    //constructor
    Stacks(){
        setHead(null);
        setTail(null);
    }
/// methods    
    // checking methods
    public boolean isEmpty(){
        if(getHead() == null)
            return true;
        return false;
    } 
// add, delete
    public void push(char data){
        node temp = new node(data);
        if(isEmpty()){ //creating first node of the stack
            setHead(temp);
            setTail(temp);
        }else{ // the rest
            temp.setNext(head);
            setHead(temp);
        }
    }
    public void peek(){
        if(head.data != '(')
        System.out.print(head.data);
    }
    public void pop(){
        if(!isEmpty()){
            peek();
            setHead(head.getNext());
        }
    }
    public void pop(boolean c){
        if(c)peek();
        if(!isEmpty()){
            setHead(head.getNext());
        }
    }
    public void clear(Boolean c){ // delete all
        // set true to output
        if(c){
            while(!isEmpty()){
                pop();
            }
        // set false to no output
        }else{
            setHead(null);
            setTail(null);
        }
    }

// print list (everything)
    public void traversal() { // going through all nodes
        //create a temp node pointing to head
        node temp = new node();
        temp = getHead();
        if(!isEmpty()) { // not empty
        //   displaying the content and move to the 
        //   next node untill the temp becomes null
            System.out.print("\nThe list contains: ");
            while(temp != null) {
                System.out.println("\n//next node//");
                pop();
                temp = temp.getNext();
            }
            System.out.println();
        } else {//  empty
            System.out.println("The list is empty.");
        }
    }
}
