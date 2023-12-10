import java.util.Scanner;
import java.util.Scanner;
public class CountSumOfDigit {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the digit to find a sum");
        int num=input.nextInt();
        int sum=0;
        while(num!=0)
        {
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("The sum of the Digits is "+sum);
    }
    
}
