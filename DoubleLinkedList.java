package DS;

public class DoubleLinkedList {
    public Node head;
    public Node tail;
    public int data;
    public static class Node{
        public int data;
        public Node next,previous;
        
        public Node(int data)
        {
            this.data=data;
        }
    }
    public int Forward()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"=>");
            temp=temp.next;
        }
        System.out.println("null");
        return 0;
    }
    public int ReverseTraverse()
    {
        Node temp=tail;
        while(temp!=null)
        {
            System.out.print(temp.data+"=>");
            temp=temp.previous;
        }
        System.out.print("null");
         return 0;
    }
    public static void main(String[] args)
    {
        System.out.println("Double linked list");
        DoubleLinkedList object=new DoubleLinkedList();
        object.head=new Node(1);
        Node first=new Node(2);
        Node second=new Node(3);
        Node third=new Node(4);
        Node four=new Node(5);
        
        object.tail=new Node(6);
        object.head.next=first;
        first.next=second;
        second.next=third;
        third.next=four;
        four.next=object.tail;
        object.Forward();
        object.tail.previous=four;
        four.previous=third;
        third.previous=second;
        second.previous=first;
        first.previous=object.head;
object.ReverseTraverse();

    }
    
}
