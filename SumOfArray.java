public class SumOfArray {
    public static void main(String[] args)
    {
        int array[]={1,6};
          int sum=0;
        
                                     //USING FOR LOOP
          /*
        for(int i=0;i<array.length;i++)
        {
            sum=sum+array[i];
        }
        System.out.println("The sum of array is "+sum);
         */

                                 //USING WHILE LOOP
        /*
           int count=0;
        while(count<array.length)
        {
            sum=sum+array[count];
            count++;
        }
       System.out.println("The sum of array is "+sum);
         */

         //USING FOREACH LOOP
        for(int value:array)
        {
            sum=sum+value;
        }
       System.out.println("The sum of array is "+sum);
    }
    
}
