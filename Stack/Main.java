package Stack;

public class Main {

    public static void main(String[] args) {
        String name = "Saad";
        Task s = new Task(name.length());
        System.out.println(name);
        for (int i=0; i<name.length(); i++) {
            s.push(name.charAt(i));
        }
        s.reverse();



    }
}
