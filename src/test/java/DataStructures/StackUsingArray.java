package DataStructures;

public class StackUsingArray {

    int size = 0;
    int arr[];
    int top = -1;

    StackUsingArray(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = 0;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (size - 1 == top);
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        } else {
            System.out.println(" Stack is empty");
            return top;
        }
    }

    public void push(int n) {

        if (!isFull()) {
            top++;
            arr[top] = n;
            System.out.println("pushed element " + arr[top]);
        } else {
            System.out.println(" stack is full");
        }
    }

    public int pop() {

        if (!isEmpty()) {
            int y = arr[top];
            top--;
            System.out.println(" popped element is " + y);
            return y;

        } else {
            System.out.println(" stack is empty ");
            return top;
        }
    }

    public static void main(String args[]) {
        StackUsingArray obj = new StackUsingArray(5);
        obj.push(50);
        obj.push(100);
        obj.push(150);
        obj.push(2450);

        System.out.println("**************");

        System.out.println("peek element is " + obj.peek());
        System.out.println("**************");
        obj.isEmpty();

         obj.isFull();


        obj.pop();
        System.out.println("peek element is " + obj.peek());



    }

}
