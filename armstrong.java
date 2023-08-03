public class armstrong {
    public static void main(String[] args)
    {
        int num=153,rev=0,rem;
        int temp=num;
        while(num!=0)
        {
            rem=num%10;
            rev=rev+rem*rem*rem;
            num=num/10;
        }
        if(temp==rev)
        {
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
    
}
