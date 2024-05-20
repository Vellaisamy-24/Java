package DS;

public class InsertNodeAtLast {
    public Node head;
    public static class Node{
        public int data;
        public Node next;
       public Node (int data)
        {
this.data=data;
this.next=next;
        }
    }
    public void InsertAtLast(int data)
    {
        Node newNode=new Node(data);
    
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node current=head;
        while (current.next!=null) {
            current=current.next;
            
        }
        current.next=newNode;
    }
    public void display()
    {
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data+"=>");
            current=current.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args)
    {
        System.out.println("InsertNodeAtLast");
        InsertNodeAtLast object=new InsertNodeAtLast();
        object.InsertAtLast(9);
        object.InsertAtLast(10);
        object.InsertAtLast(11);
        object.InsertAtLast(12);
        object.display();
        

    }
    
}
