public class AdditionRecursion {
    public static void main(String[] args)
    {
        print(0);
    }
    static void print(int n)
    {
        if(n==5)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);          //the last function call in recursion is called Tail Recursion
    }
    
}


// Each function call in Recursion takes separate memory in stack
//The function that call itself is called Recursion
//USES
// ** It helps in solving bigger/comples probles in simple way
// ** We can conver recursion solution into iteration and vice versa
// ** Space complexity is not constant because of recursive calls
// ** It helps to breaking down large problem into smaller problems  
