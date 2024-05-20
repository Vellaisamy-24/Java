package DS;

public class InsertNodeAtGivenPostionSLL {
    public Node head;
    public static class Node{
        public int data;
        public Node next;
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
                System.out.print(current.data+"=>");
                current=current.next;
            }
System.out.print("null");
        }
    public void InsertAtPosition(int pos,int data)
    {
        
        Node newNode=new Node(data);
        if(pos==1)
        
        {
            newNode.next=head;
            head=newNode;
        }
        else{
            Node previous=head;
            int count=1;
            while(count<pos-1)
            {
                previous=previous.next;
                count++;
            }
            Node current=previous.next;
            newNode.next=current;
        previous.next=newNode;


        }
    }
    public void InsertLast(int data)
    {
        Node newNode=new Node(data);
        Node current=head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=newNode;
    }
    public static void main(String[] args)
    {
        int pos;
        System.out.println("InsertNodeAtGivePosition");
        InsertNodeAtGivenPostionSLL object=new InsertNodeAtGivenPostionSLL();
        object.InsertAtPosition(1,1);
        object.InsertAtPosition(2,2);
        object.InsertLast(3);
        object.InsertLast(4);
        object.InsertAtPosition(1, 0);
        object.display();
        
    }
    
}
