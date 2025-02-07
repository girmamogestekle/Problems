package interview.problems.com;

public class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public void display() {
        System.out.println("This my current Node Value is: " + data);
    }

}
