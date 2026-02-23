public class reverselist {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Reverse function
    static Node reverse(Node head) {

        Node prev = null;
        Node current = head;

        while (current != null) {

            Node next = current.next;   // 1️⃣ Save next node

            current.next = prev;        // 2️⃣ Reverse pointer

            prev = current;             // 3️⃣ Move prev forward

            current = next;             // 4️⃣ Move current forward
        }

        return prev;   // prev becomes new head
    }

    // Print function
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // Create list: 10 → 30 → 50
        Node head = new Node(10);
        Node second = new Node(30);
        Node third = new Node(50);

        head.next = second;
        second.next = third;

        System.out.println("Original List:");
        printList(head);

        head = reverse(head);

        System.out.println("Reversed List:");
        printList(head);
    }
}