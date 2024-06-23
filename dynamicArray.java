import java.util.*;
public class dynamicArray {
    
    public static void main(String[] args)
    {
        int val,pos;
        dynamicArrayDemo obj=new dynamicArrayDemo();
        Scanner object=new Scanner(System.in);
        while(true)
        {
            System.out.println("\n---------List Menu-----");
            System.out.println("\n1.Insert at the Beginning\n");
              System.out.println("\n2.Display\n");
                System.out.println("\n3.Insert at the specified position\n");
                  System.out.println("\n4.Delete\n");
                   System.out.println("\n 5.Exit\n");
                    System.out.println("\nEnter your choice\n");
                   int choice=object.nextInt();
                   switch(choice)
                   {
                    case 1:
                    System.out.println("Enter the data");
                    val=object.nextInt();
                    obj.add(val);
                    break;
                    case 2:
                    obj.display();
                    break;
                   }
                

        }

    }
    
}

