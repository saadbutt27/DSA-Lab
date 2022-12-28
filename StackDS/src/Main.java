public class Main {
    public static void main(String[] args) {
        // Stack through array
        System.out.println("Stack through array");
        Stack st = new Stack(5);
        st.push(5);
        st.push(3);
        st.push(8);
        st.push(10);
        st.push(7);
        System.out.print(st.peek() + " ");
        System.out.print(st.pop() + " ");
        System.out.print(st.pop() + " ");
        System.out.print(st.peek() + " ");
        System.out.print(st.pop() + " ");
        System.out.print(st.pop() + " ");
        System.out.print(st.pop() + " ");

        System.out.println();

        // Stack through singly linked list
        System.out.println("Stack through singly linked list");
        StackList stl = new StackList(5);
        stl.push(6);
        stl.push(5);
        stl.push(4);
        stl.push(3);
        stl.push(2);
        stl.push(1);
        System.out.print(stl.peek() + " ");
        System.out.print(stl.pop() + " ");
        System.out.print(stl.pop() + " ");
        System.out.print(stl.peek() + " ");
        System.out.print(stl.pop() + " ");
        System.out.print(stl.pop() + " ");
        System.out.print(stl.pop() + " ");

        System.out.println();

        // Class Task
        System.out.println("Class Task");
        String name = "Saad";
        Task s = new Task(name.length());
        System.out.println(name);
        for (int i=0; i<name.length(); i++) {
            s.push(name.charAt(i));
        }
//        s.reverse();
        for (int i=0; i<name.length(); i++) {
            System.out.print(s.pop());
        }
        System.out.println();

        String infix = "2^8";
        System.out.println("Infix Expression " + infix);
        String postfix = infixToPostfix(infix);
        System.out.println("Postfix Expression " + postfix);
        System.out.println("Evaluated Answer " + evaluatePostfix(postfix));

    }
    public static String infixToPostfix(String infix) {
        String postfix = "";
        Task s = new Task(infix.length());
        for (int i=0; i<infix.length(); i++) {
            if ((infix.charAt(i) >= 48 && infix.charAt(i) <= 57) || (infix.charAt(i) >= 65 && infix.charAt(i) <= 90) || (infix.charAt(i) >= 97 && infix.charAt(i) <= 122)) {
                postfix += infix.charAt(i);
            } else if (infix.charAt(i) == '(') {
                s.push(infix.charAt(i));
            } else if (infix.charAt(i) == ')') {
                while (s.peek() != '(') {
                    postfix += s.pop();
                }
                s.pop();
            } else {
                while (!s.isEmpty() && precedenceCheck(infix.charAt(i)) <= precedenceCheck(s.peek())) {
                    postfix += s.pop();
                }
                s.push(infix.charAt(i));
            }
        }
        while (!s.isEmpty()) {
            if (s.peek() == ')' || s.peek() == '(') {
                return "Incorrect Expression";
            } else {
                postfix += s.pop();
            }
        }

        return postfix;
    }

    public static int evaluatePostfix(String postfix) {
        int result;
        int a,b;
        Stack s = new Stack(postfix.length());

        for (int i=0; i<postfix.length(); i++) {
            if (postfix.charAt(i) >= 48 && postfix.charAt(i) <= 57) {
                s.push(postfix.charAt(i) - '0');
            } else if (postfix.charAt(i) == '+') {
                a = s.pop();
                b = s.pop();
                result = b+a;
                s.push(result);
            } else if (postfix.charAt(i) == '-') {
                a = s.pop();
                b = s.pop();
                result = b-a;
                s.push(result);
            } else if (postfix.charAt(i) == '*') {
                a = s.pop();
                b = s.pop();
                result = b*a;
                s.push(result);
            } else if (postfix.charAt(i) == '/') {
                a = s.pop();
                b = s.pop();
                result = b/a;
                s.push(result);
            } else if (postfix.charAt(i) == '^') {
                a = s.pop();
                b = s.pop();
                result = power(b,a);
                s.push(result);
            }
        }

        return s.pop();
    }

    public static int power(int base,int exp) {
        int sum = 1;
        for(int i=0; i<exp; i++) {
            sum *= base;
        }
        return sum;
    }

    public static int precedenceCheck(char c) {
        if (c == '+' | c == '-') {
            return 1;
        }
        if (c == '*' || c == '/') {
            return 2;
        }
        if (c == '^') {

            return 3;
        }
        return 0;
    }

}

