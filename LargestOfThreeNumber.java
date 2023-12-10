public class LargestOfThreeNumber {
    public static void main(String[] args)
    {
        int a=5,b=52,c=333,l1,l2;
        //NORMAL METHOD
        /* 
          if(a>b & a>c)
        {
         System.out.println("a="+a+" is big");
        }
        else if(b>a & b>c)
        {
        System.out.println("b="+b+" is big");
        }
        else
        {
            System.out.println("c="+c+" is big");
        }
        */


        //USING TERNARY OPERATOR
        /* 
        l1=(a>b)?a:b;
      l2=(l1>c)?l1:c;
     System.out.println(l2+" is big");
        */
  int largest=c>(a>b?a:b)?c:(a>b?a:b);
  System.out.println(largest+" is big");

    }
    
}
