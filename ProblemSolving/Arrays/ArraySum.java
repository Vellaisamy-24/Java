package ProblemSolving.Arrays;

public class ArraySum {
    public static void main(String[] args)
    {
        int array[]={2,4,6,7,9};
        int sum=0;
        
        for(int i=0;i<array.length;i++)
        {
 sum=sum+array[i];
        }
        System.out.println("The Array Sum is"+sum);
    }
    
}
