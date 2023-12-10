public class MinNumArray {
    public static void main(String[] args)
    {
        int array[]={14,2,5,6,1};
        int min=array[0];
        for(int i=1;i<array.length;i++)
        {
            if(array[i]<min)
            {
                min=array[i];
            }
        }
        System.out.println("The Minimum Element is "+min);
    }
}
