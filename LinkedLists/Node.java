package LinkedLists;

public class Node {

    int data;
    Node next;

    Node(int data){
        this.data = data;
    }

    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        Node h1 = n1;
        h1.next = n2;
        n2.next = n3;
        n3.next = null;

        System.out.println(n1.data + " " + n1.next);
        System.out.println(n1.data + " " + n2.next);
        System.out.println(n1.data + " " + n3.next);
        
    }
    
}
