package DS;

import org.w3c.dom.Node;

public class single {
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
            System.out.print(current.data);
            current=current.next;
        }
        System.out.print("null");

    }
    public void count()
    {
        Node current=head;
        int count=0;
        while (current!=null) {
            count++;
           
        
            current=current.next;

            
        }
         System.out.println(count);
    }
    public static void main(String[] args)
    {
        System.out.println("Java");
        single obj=new single();
        obj.head=new Node(1) ;
       
      
     Node second=new Node(2);
     Node third=new Node(3);
     obj.head.next=second;
     second.next=third;
    //  System.out.print(obj.head.next);
    obj.display();
    obj.count();
            
        
    }
    
}
