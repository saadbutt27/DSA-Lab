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
        System.out.println();

        System.out.println("Priority Queue");
        PriorityQueue pq = new PriorityQueue();
        pq.enqueue(31,3);
        pq.enqueue(25,4);
        pq.enqueue(54,2);
        System.out.println(pq.peek().data);
        pq.enqueue(12,1);
        pq.enqueue(62,6);
        pq.enqueue(46,5);
        System.out.println(pq.peek().data);

    }
}
