package DS;

public class LengthSLL {
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
            System.out.println(current.data);
            current=current.next;

        }
    }
    public void count()
    {
        int count=0;
        Node current=head;
        while(current!=null)
        {
            count++;
            current=current.next;
        }
        System.out.println("Length is "+count);
    }
    public static void main(String[] args)
    {
        System.out.println("Length of SLL is");
        LengthSLL obj=new LengthSLL();
        //obj.head=obj.new Node(2); if the inner class is not static 
        obj.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        Node four=new Node(4);
        obj.head.next=second;
        second.next=third;
        third.next=four;

        System.out.println("The Linked List is");
        obj.display();
        obj.count();
    
     
    }
    
}

/*

In this code, you're trying to assign a value to the head variable of the LengthSLL class with obj.head=new Node(2);. However, there's an issue because Node is an inner class and cannot be directly referenced in a static context (such as the main method) without an instance of the outer class (LengthSLL).

To fix this, you can either make the Node class static or create an instance of the LengthSLL class before accessing its head variable. Here's how you can do it:
 
 */