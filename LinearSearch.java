import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Number of Elements in Array");
        int num=obj.nextInt();
        int[] array=new int[num];
        boolean status=false;
        for(int i=0;i<num;i++)
        {
          System.out.println("Enter "+(i+1)+" element");
          array[i]=obj.nextInt();
        }
       System.out.println("Enter the element to be searched");
       int key=obj.nextInt();
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==key)
            {
                System.out.println("Element is found at index "+i);
                status=true;
                break;
            }
           
        }
        if(status==false)
        {
            System.out.println("Element not found in the Array");
        }

    }
    
}
