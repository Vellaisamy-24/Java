import java.util.Arrays;

public class EqualityOfArray {
    public static void main(String[] args)
    {
        int array1[]={1,2,3,4,5};
        int array2[]={1,2,3,5};
        //USING ARRAY.EQUALS() METHOD IT RETURNS TRUE WHEN THE ARRAY IS EQUAL
        /* 
         boolean status=Arrays.equals(array1,array2);
        if(status==true)
        {
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
        */
        
        boolean status=false;
        if(array1.length==array2.length)
        {
            for(int i=0;i<array1.length;i++)
            {
                if(array1[i]!=array2[i])
                {
                    status=false;
                }
                else{
                    status=true;
                }
            }
        }
        else{
            System.out.println("No of elements differ in array");
        }
        if(status==true)
        {
            System.out.println("Array Equal");
        }
        else{
            System.out.println("Array not equal");
        }
      
    }

    }
    
    

