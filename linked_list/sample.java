
public class sample{

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);

        a.next = b;
        b.next = c;

        Node temp = a;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
} 
    

