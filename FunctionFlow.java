// package DS;
class FunctionFlow{
    public static void main(String[] args) {
    // System.out.println("hleow");
    print();

    }

    static void print()
    {
        System.out.println("print function");
        print1();
    }
    static void print1()
    {
        System.out.println("Print1 function");
        print2();
    }
    static void print2()
    {
        System.out.println("print2 function");
        print3();
    }
    static void print3()
    {
        System.out.println("print3 function");
    }
}


// 1.Basically here the first function inside main method is called (print())
// and it is executed and call print1() and so on....
// 2.Each function takes separate memory in 
// 3.The function will remain in static until it is executed including its sub function
// 4.Here main method is the first method to enter stack and it is the last method to leave the stack

