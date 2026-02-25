public class middle_in_list {

    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static node middle(node head) {
        node fast = head;
        node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow;
            fast = fast.next;
        }
        System.out.println("Middle element is: " + slow.data);
        return slow;
    }

    public static void main(String[] args) {

        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);
        node e = new node(50);
        a.next=b;
        b.next = c;
        c.next = d;
        d.next =e;

        middle(a);
    }
}