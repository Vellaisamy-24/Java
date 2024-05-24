package DS;
public class StackLL {
    public Node top;
    public int length;
    public static class Node {
        public int data;
        public Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void push(int data)
    {
        
        Node newNode=new Node(data);
        newNode.next=top;
        top=newNode;
        length++;
        //System.out.println(length);


    }
    public void pop()
    {
        if(!isEmpty())
        {
 int popValue=top.data;
        System.out.println("Removed top value is "+popValue);
        top=top.next;
        length--;
        }
        else{
            System.out.println("Stack is Empty");
            
        }
       
    }
    public void peek()

    {
        if(!isEmpty())
        {
System.out.println("Top value is "+top.data); 
        }
        else{
            System.out.println("stack is empty");
          
        }
       
      

    }
public StackLL()
{
    top=null;
    length=0;
}
public int length()
{
    return length;
}
public boolean isEmpty()
{
    return length==0;//true
}

    public static void main(String[] args)
    {
        System.out.println("Stack using Linked List");
        StackLL object=new StackLL();
        object.push(5);
        object.push(10);
        object.push(15);
        object.push(20);
        object.pop();
        System.out.println("Length is "+object.length());
        object.peek();
    }
    
}


//Algo
//push
// ListNode newNode=new ListNode(2);
// newNode.next=top;
// top=newNode;

//pop
// top=top.next;