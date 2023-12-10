public class MaxNumArray {
    public static void main(String[] args)
    {
        int array[]={1,2,55,2354};
        int max=array[0];
        for( int i=1;i<array.length;i++)
        {
            if(array[i]>max)
            {
                max=array[i];
            }
            
        }
        System.out.println("Maximum element is "+max);
    }
    
}
