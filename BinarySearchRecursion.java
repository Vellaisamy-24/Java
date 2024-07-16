public class BinarySearchRecursion {
    public static void main(String[] args)
    {
        int[] arr={1,3,5,6,98,100};
        int target=100;
     System.out.println(Search(arr, target, 0, arr.length-1));
    }
    static int Search(int arr[],int target,int start, int end)

    {
        if(start>end)          //0>5
        {
            return -1;
        }
        int m=(start+end)/2;   //2
        if(arr[m]==target)
        {
            return m;

        }
        if(target<arr[m])                    
        {
            return Search(arr, target, start, m-1);
        }
        return Search(arr, target, m+1, end);

    }
    
}
