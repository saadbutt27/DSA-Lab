public class Main {

    public static void main(String[] args) {
        // Double ended queue -> input restricted, output restricted

        LinkedQueue lq = new LinkedQueue();
        lq.enqueue(24);
        lq.enqueue(34);
        lq.enqueue(44);
        lq.enqueue(54);
        lq.enqueue(64);

        System.out.println(lq.peek().data);

        lq.dequeue();

        System.out.println(lq.peek().data);

    }
}
