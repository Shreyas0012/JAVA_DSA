public class insertion_infront {
    static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        Node s=new Node(69);
        Node e=new Node(79);
         Node x=new Node(89);
         s.next=e;
         e.next=x;
         Node newnode=new Node(99);
         newnode.next=s;
         Node temp=newnode;
         while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
         }
        
    }
}
