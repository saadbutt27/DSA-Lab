public class Recursion {
    int i=0;
    public void a(int c) {
        if (i < 2){
            print(i);
            i++;
            a(c);
            print(i);
        }
    }

    public void print(int c){
        System.out.println(c);
    }
}