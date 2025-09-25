package OOPS2.Createclass.NodeConstructor;
//Create a Node class with following requirements
//
//        Two data members
//        i. data : int
//ii. next : Node
//A constructor which takes an integer parameter. This constructor should set data property and leave the next set to null.
//A constructor which takes a Node parameter. This constructor should make a deep copy of the passed node.
public class NodeMain {
    public static void main(String[] args) {
       Node head = new Node(1);
       head.next = new Node(2);
       head.next.next = new Node(3);

       head.printlist();

       //make a deep copy
        Node copiehead = new Node(head);
        copiehead.printlist();

        // Modify original list to check deep copy
        head.next.data = 99;

        System.out.println("After modifying original list:");
        System.out.println("Original list:");
        head.printlist();
        System.out.println("Copied list (should be unaffected):");
        copiehead.printlist();
    }
}
