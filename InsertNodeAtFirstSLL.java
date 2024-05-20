package DS;

public class InsertNodeAtFirstSLL {
    public Node head;
    public static class Node{
        public int data;
        public Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=next;
        }
    }
    public void display()
    {
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data+"->");
            current=current.next;
            
        }
        System.out.print("null");
    }
    public void InsertAtBeginning(int data)
    {
        Node second=new Node(data);
        second.next=head;
        head=second;

    }
    public static void main(String[] args)
    {
        System.out.println("InserNodeAtFirstSLL");
        InsertNodeAtFirstSLL obj=new InsertNodeAtFirstSLL();
        obj.head=new Node(1);
        Node second=new Node(2);
        obj.head.next=second;
        
        

        obj.InsertAtBeginning(0);
        obj.display();
    }
    
}




//Algorithm
// ListNode newNode=new ListNode();
// newNode.next=head;
// head=newNode
