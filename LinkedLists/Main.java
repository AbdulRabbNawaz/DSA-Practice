package LinkedLists;

class Node {

    int data;
    Node next;

    Node(int data){
        this.data = data;
    } 
}

public class Main{

    public void traverse(Node head){

        Node current = head;

        while(current != null){

            System.out.println("data" + " " + current.data);
            current = current.next;
        }

        System.out.println("null");

    }

    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        Node h1 = n1;
        h1.next = n2;
        n2.next = n3;
        n3.next = null;

        // System.out.println(n1.data + " " + n1.next);
        // System.out.println(n1.data + " " + n2.next);
        // System.out.println(n1.data + " " + n3.next);

        Main head = new Main();

        head.traverse(h1);

    }
}
