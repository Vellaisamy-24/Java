import java.util.Scanner;
public class CoutNoOfDigits {
    public static void main(String[] args)
    {
      Scanner object=new Scanner(System.in);
      System.out.println("Enter the Digits to count");
      int digit=object.nextInt();
      int count=0;
      while(digit!=0)
      {
        digit=digit/10;
        count++;
        
      }
      System.out.println("The num of digits is"+count);
    }
    
}
