public class reverselist {
   static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
    }
}
    static node reverse(node head){
        node prev=null;
        node current=head;
        while(current!=null){
            node next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
    static void print(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" → ");
            temp=temp.next;
        }

    }
    public static void main(String[] args) {
        node head=new node(10);
        node second=new node(30);
        node third=new node(50);
        node fourth=new node(70);
        node fifth=new node(90);
        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        System.out.println("Original List:");
        print(head);
        head=reverse(head);
        System.out.println("\nReversed List:");
        print(head);
    }
}