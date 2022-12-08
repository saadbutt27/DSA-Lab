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
        if (top == size-1) {
            System.out.print("StackOverflow! ");
        } else {
            arr[++top] = value;
        }
    }

    public void reverse () {
        if (top == -1) {
            return;
        } else {
            System.out.print(arr[top--]);
            reverse();
        }
    }

    public char pop () {
        if (top == -1) {
            System.out.print("StackUnderflow! ");
            return '1';
        } else {
            return arr[top--];
        }
    }

}
