import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number to find fibonacci");
        int num=input.nextInt();
        int a=0,b=1,sum;
        System.out.print(a+" "+b);
        for(int i=2;i<num;i++)
        {
            sum=a+b;
            System.out.print(" "+sum+" ");
            a=b;
            b=sum;
        }
    }
    
}
