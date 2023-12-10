public class MissingNumberArray {
    public static void main(String[] args)
    {
        int array[]={1,2,3,5};
        int rangesum=0;
        int arraysum=0;
        int MissingNumber=0;
        for(int i=1;i<=5;i++)
        {
            rangesum=rangesum+i;
        }
        System.out.println("The range of sum is "+rangesum);
        for(int i=0;i<array.length;i++)
        {
            arraysum=arraysum+array[i];

        }
        System.out.println("The array sum is "+arraysum);
        MissingNumber=rangesum-arraysum;
        System.out.println("The Missing Number in array is "+MissingNumber);
        
    }
    
}
