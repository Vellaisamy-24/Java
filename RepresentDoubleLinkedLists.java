package DS;

public class RepresentDoubleLinkedLists {
    private Node head;
    private Node tail;
    private int length;
    private class Node{
        public int data;
        public Node next;
         public Node previous;
        public Node(int data)
        {
            this.data=data;

        }
    }
    public  RepresentDoubleLinkedLists()
    {
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    public Boolean isEmpty()
    {
        return length==0;
    }
    public int length()
    {
        return length;
    }
    public static void main(String[] args)
    {
                      

    }
    
}
