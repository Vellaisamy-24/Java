public class reverseOfNumber {
    public static void main(String[] args)
    {
        int num=123,rev,rem=0;
      
        while(num!=0)
        {
            rev=num%10;
            rem=rem*10+rev;
            num=num/10;
        }
        System.out.println("The rever of the number is"+" "+rem);

    }
    
}
