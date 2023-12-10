import java.util.Scanner;
public class CountEvenOrOdd {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the digit to find the count of odd and even ");
        int num=obj.nextInt();;
        int even=0,odd=0;
        while(num!=0)
        {
             int rem=num%10;
            if(rem%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
            num=num/10;
        }
        System.out.println("Even Numbers Count "+even);
        System.out.println("Odd Numbers Count "+odd);
    }
    
}
