//program to find fibonacci of particular number
public class FibonacciRecursion {
    public static void main(String[] args)
    {
        int ans=fibo(6);
        System.out.println(ans);
    }
    static int fibo(int n)
    {
        if(n<2)
        {
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }        
   
}

// STEPS TO FIND FIBONACCI VALUES
// FORMUlA=>fib(n)=fib(n-1)+fib(n-2)
// fib(0)=0
// fib(1)=1
// fib(2)=fib(1)+fib(0)=>1+0=1
// fib(3)=fib(2)+fib(1)=>1+1=2
// fib(4)=fib(3)+fib(2)=>2+1=3
// fib(5)=fib(4)+fib(3)=>3+2=5
// fib(6)=fib(5)+fib(4)=>5+3=8








//Recursion Relation=Any Recursion Function that can be return in formula
// Recursion Relation for Fibonacci Seris=fibo(n)=fibo(n-1)+fibo(n-2)
// STEPS 
//  ** Identify If you can break down problems into smaller problems
//  ** Write the Recurrence relation if needed 
//  ** Draw the Recursive Tree
//  ** About Tree
//     1)See the flow of functions, how they are getting in stack
//     2)Identify flows of left tree calls and right tree calls
//     3)Draw the Tree and pointers again and again using pen & paper
//     4)Use Debugger too see the flow
// ** See how the values are returned at the each step. See the where the function call will come out of


// VARIABLES:
// * Arugments
// * Return Type
// * Body of function

// Type of Recurrence Relation
//  * Linear Recurrence Relation (EG:Fibonacci)
//  * Divide and Conquer Recurrence Relation   (EG:Binary Search)

