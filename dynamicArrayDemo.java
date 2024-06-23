public class dynamicArrayDemo {
    int initialCapacity=16;
    int size;
    int capacity;
    int arr[];
    dynamicArrayDemo()
    {
        int size=0;
       arr=new int[initialCapacity];
       capacity=initialCapacity;

    }
    public void add(int val)
    {
        arr[size]=val;
        size++;
    }
    public void display()
    {
        System.out.println("\nThe elements in the list are");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]+"");
        }
    }
}
