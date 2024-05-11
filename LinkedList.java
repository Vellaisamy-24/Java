package DS;



public class LinkedList {
    private Node head;
    private static class Node{
        private int data;
        private Node next;
           public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
    }
 
    public void display()
    {
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data + "->");
            current=current.next;
        }
        System.out.println("null");

    }
    public static void main(String args[])
    {
        LinkedList obj=new LinkedList();
        obj.head=new Node(10);
        Node second= new Node(2);
        Node third=new Node(3);
        Node fourth=new Node(4);
        obj.head.next=second;
        second.next=third;
        third.next=fourth;
        obj.display();
        


    }
    
}
