package ProblemSolving.Arrays;

public class ArrayRotation {
    public static void main(String[] args)
    {
        int[] array={1,2,3,4,5,6};
        int arrayLength=array.length;
        int rotate=2;
        int[] array2=new int[arrayLength];
        
for (int i=2;i<array2.length;i++)
{
    array2[i-rotate]=array[i];
}

System.out.println("Second Array");
for(int i=0;i<array2.length;i++)
{
    System.out.println(array2[i]);
}



        
    }
    
}
