import java.util.Scanner;
public class Factorial {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
         int num;
        int fact=1;
        System.out.println("Enter the number to find Factorial");
            num=obj.nextInt();
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("The Factorial of "+num+" is "+fact);
      
        /*  for(int i=num;i>0;i--)
        {
            fact=fact*i;
        }
              System.out.println("The Factorial of "+num+" is "+fact);
           */
          
          /*
            int i=1;
          while( i<=num)
          {
            fact=fact*i;
            i++;

          }
              System.out.println("The Factorial of "+num+" is "+fact);
           */
         
    }
    
}
