package Stack;

public class Task {
    int top;
    char[] arr;
    int size;

    public Task (int size) {
        this.size = size;
        arr = new char[size];
        top = -1;
    }

    public void push (char value) {
        if (top == size - 1) {
            System.out.print("StackOverflow! ");
        } else {
            arr[++top] = value;
        }
    }

    public void reverse () {
        if (top == -1) {
            System.out.print("StackUnderflow! ");
        } else {
            System.out.println(arr[top--]);
            reverse();
        }
    }

//    public int peek () {
//        if (top == -1) {
//            System.out.print("Stack is empty! ");
//            return -1;
//        } else {
//            return arr[top];
//        }
//    }
}
