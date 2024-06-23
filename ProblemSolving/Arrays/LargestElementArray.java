package ProblemSolving.Arrays;

public class LargestElementArray {
    public static void main(String[] args)
    {
        int array[]={7,9,5,1,14};
        int largest=array[0];
        System.out.println(array.length);
        for(int i=1;i<array.length;i++)
        {
            if(largest<array[i])
            {
                largest=array[i];
            }
        
        }
        System.out.println("The Largest Element in Array is"+largest);

    }
    
}
