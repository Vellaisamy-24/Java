
import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the String to Check palindrome or not");
         String name=input.nextLine();
        String rev="";

        //Normal Method
        /*
         for(int i=name.length()-1;i>=0;i--)
        {
            rev=rev+name.charAt(i);
        }
        System.out.println("The Reverse of the String is "+rev);
        if(rev.equals(name))
        {
            System.out.println("The given string is palindrome");
        }
        else{
            System.out.println("The given string is not a palindrome");
        }
         */


        //USING STRINGBUFFER CLASS
      /* 
       StringBuffer input=new StringBuffer(name);
        StringBuffer reverse=input.reverse();
        String reverted=reverse.toString();
     if(reverted.equals(name))
        {
            System.out.println("The given string is palindrome");
        }
        else{
            System.out.println("The given string is not a palindrome");
        }
      */
      
     //USING STRINGBUILDER CLASS
     StringBuilder obj=new StringBuilder();
     obj.append(name);
     StringBuilder reverse=obj.reverse();
    System.out.println("The Reverse of the String is "+reverse);
      String reverted=reverse.toString();     // when we are comparing the string with other string in StringBuilder and stringBuffer class we need to converted it to string after finding the reverse of the string
      if(name.equals(reverted))
      {
        System.out.println("The given string is palindrome");
      }
      else{
        System.out.println("The given string is not palindrome");
      }
}
}