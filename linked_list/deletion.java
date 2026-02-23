public class deletion{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
     
    public static void main(String[] args) {
        Node a=new Node(10);
        Node v=new Node(5);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
       
        a.next=v;
        v.next=b;
        b.next=c;
        c.next=d;
        Node temp=a;
       while(temp!=null && temp.next.data!=30){
           temp=temp.next;
       }
       if(temp!=null){
        temp.next=temp.next.next;
       }
       temp=a;
       while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
       }
    }
}