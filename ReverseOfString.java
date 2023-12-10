import java.util.Scanner;
public class ReverseOfString {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string to reverse");
        String name=input.nextLine();
        String rev="";
        /* 
          for(int i=name.length()-1;i>=0;i--)
        {
            rev=rev+name.charAt(i);
        }
        System.out.println("The Reverse of the String is "+rev);
        */


        /* 
        CONVERTING THE STRING TO CHARACTER AND STORES IN ARRAY 
         char array[]=name.toCharArray();
        for(int i=name.length()-1;i>=0;i--)
        {
            rev=rev+array[i];
        }
          System.out.println("The Reverse of the String is "+rev);
        */


        //USING STRINGBUFFER CLASS
     StringBuffer obj=new StringBuffer(name);
       System.out.println("The Reverse of the String is "+obj.reverse());
     
    }
    
}
