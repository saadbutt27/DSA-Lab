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
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());

        // Stack through singly linked list
        System.out.println("Stack through singly linked list");
        StackList stl = new StackList(5);
        stl.push(6);
        stl.push(5);
        stl.push(4);
        stl.push(3);
        stl.push(2);
        stl.push(1);
        System.out.println(stl.peek());
        System.out.println(stl.pop());
        System.out.println(stl.pop());
        System.out.println(stl.peek());
        System.out.println(stl.pop());
        System.out.println(stl.pop());
        System.out.println(stl.pop());

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


    }
}