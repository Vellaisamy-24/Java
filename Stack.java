public class Stack {
    int top = 0;
    int[] array = new int[5];

    public static void main(String[] args) {
        Stack obj = new Stack();

        System.out.println(obj.push(10));
        System.out.println(obj.push(20));
        System.out.println(obj.pop());
        obj.peek();
    }

    public int push(int data) {
        if (top < array.length) {
            array[top] = data;
            top++;
            return data;
        } else {
            System.out.println("Stack overflow. Cannot push " + data + ". Stack is full.");
            return -1; // Return a sentinel value indicating an error
        }
    }

    public int pop() {
        if (top > 0) {
            top--;
            int data = array[top];
            array[top] = 0;
            return data;
        } else {
            System.out.println("Stack underflow. Cannot pop. Stack is empty.");
            return -1; // Return a sentinel value indicating an error
        }
    }

    public int peek() {
        if (top > 0) {
            int data = array[top - 1];
            System.out.println("Peeked: " + data);
            return data;
        } else {
            System.out.println("Stack is empty.");
            return -1; // Return a sentinel value indicating an error
        }
    }
}
