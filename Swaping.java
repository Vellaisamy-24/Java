public class Swaping {
    public static void main(String[] args)
    {
        int a=306,b=10,c;
        System.out.println("The value of a and b before swap "+" "+a+" "+b);
        /*
         c=a;
        a=b;
        b=c;
         */

         /*
        a=a+b;
        b=a-b;
        a=a-b;
          */
       /* 
           a=a*b;
          b=a/b;
          a=a/b;
       */
      a=a^b;    //decimal is converted into binary and in bitwise XOR if two values are equal then 1  i.e  a=1,b=1 then c=1
      b=a^b;
      a=a^b;
         
      
         System.out.println("The value of a and b after swap "+" "+a+" "+b);

    
    }
    
}
