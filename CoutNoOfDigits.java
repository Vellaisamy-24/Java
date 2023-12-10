import java.util.Scanner;
public class CoutNoOfDigits {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Digit to find a Count");
        int num=obj.nextInt();
        int count=0;
        while(num!=0)
        {
            num=num/10;
            count++;
        }
        System.out.println("The Count is "+count);
    }
    
}
