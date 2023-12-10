import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number to check prime or not");
        int num=obj.nextInt();
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println(num +" is Prime Number");
        }
        else{
             System.out.println(num+" is Not Prime Number");
        }
    }
    
}
//The number should be greater than 1
//The Prime number has only two factors 1 and itself
