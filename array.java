import java.util.*;
public class array {
    int size=0;
    int initialCapacity=16;
    int arr[];
    int Capacity;
    array()
    {
        int size;
        arr=new int[initialCapacity];
        Capacity=initialCapacity;
    }
   public void add(int val)
    {
       arr[size]=val;
       size++;
    }
    public void display()
    {
        System.out.println("\nThe elements in the arrays are");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" \t");
        }
    }
    public void deleteAtPos(int pos)
    {
        for(int i=pos+1;i<size;i++)
        {
            arr[i-1]=arr[i];
        }
        size--;
       

    }
    public static void main(String[] args)
    {
        int choice,val,pos;
        Scanner object=new Scanner(System.in);
        array arrayes =new array();
        while(true)
        {
            System.out.println("\n1.Add");
            System.out.println("\n2.Display");
            System.out.println("\n3.Exit");
             System.out.println("Enter Your choice");
             choice=object.nextInt();
             switch(choice)
             {
                case 1:
                System.out.println("\nEnter the value");
                val=object.nextInt();
                arrayes.add(val);
                break;
                case 2:
                arrayes.display();
                break;
                case 3:
                System.out.println("\nEnter the position to delete");
                pos=object.nextInt();
                arrayes.deleteAtPos(pos);
                 arrayes.display();
                break;
                case 4:
                System.exit(0);
                default:
                System.out.println("\nInvalid Choice");

             }
        }
            

    }
    
}
