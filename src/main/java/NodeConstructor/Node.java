package NodeConstructor;

public class Node {
    int data;
    Node next;

    //constructor with integer parameter
    public Node(int data){
        this.data = data;
        this.next = null;
    }

    //Constructor with Node parameter
    public Node(Node other){
        this.data = other.data;
        this.next = new Node(other.next.data);
    }

    public void printlist(){
        Node current = this;
        while(current != null){
            System.out.println(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
}
