import java.util.Scanner;
public class reverseOfNumber {
    public static void main(String[] args)
    {
        int rev,rem=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the digit to reverse");
         int num=input.nextInt();
      /* 
      //NORMAL METHOD 
        while(num!=0)
        {
            rev=num%10;
            rem=rem*10+rev;
            num=num/10;
        }
        System.out.println("The rever of the number is"+" "+rem);
      */
       

      /* 
      // USING STRINGBUFFER INBUILD CLASS
                    StringBuffer obj=new StringBuffer(String.valueOf(num));
                    StringBuffer reverse=obj.reverse();
                    System.out.println("The rever of the number is"+" "+reverse);
      */
       

      //USING STRINGBUILDER INBUILT CLASS
      StringBuilder obj=new StringBuilder();
      obj.append(num);
      StringBuilder reverse=obj.reverse();
      System.out.println(reverse);



    }
    
}
