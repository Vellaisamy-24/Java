public class EvenOddInArray {
    public static void main(String[] args)
    {
        int array[]={1,2,3,4,5};
        //USING FOR LOOP
        /*
        for(int i=0;i<array.length;i++)
        {
            if(array[i]%2==0)
            {
                System.out.println(array[i]+" is Even");
            }
            else{
                System.out.println(array[i]+" is Odd");
            }
        }
         */

         //USING FOREACH LOOP
         /* 
         for(int value:array)
        {
            if(value%2==0)
            {
                  System.out.println(value+" is Even");
            }
            else{
                    System.out.println(value+" is Odd");
            }
        }
         */
        //USING WHILE LOOP
        int count=0;
  while(count<array.length)
  {
    if(array[count]%2==0)
    {
         System.out.println(array[count]+" is Even");
         
    }
    else{
        System.out.println(array[count]+" is Odd");
    }
count++;
  }
       
    }
    
}
