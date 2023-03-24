public class node {
    // var
    char data; //data
    node next; // pointer
    node prev; // previous node
    public node(){
        this.data = '\0'; // null char
        this.next = null; // no other node yet
        this.prev = null; // no other node yet
    }
    public node(char data){
        this.data = data;
    }
    public void setData(char data){
        this.data = data;
    }
    public char getData(){
        return this.data;
    }
    public void setNext(node next){
        this.next = next;
    }
    public node getNext(){
        return this.next;
    }
    public void setPrev(node prev){
        this.prev = prev;
    }
    public node getPrev(){
        return this.prev;
    }
    public String toString(){
        return "    node's data : " + data;
    }
}