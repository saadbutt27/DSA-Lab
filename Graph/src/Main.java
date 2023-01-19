import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Graph");
        Graph g = new Graph(4);
        g.addVertex('A');
        g.addVertex('B');
        g.addVertex('C');
        g.addVertex('D');
        g.addEdge('A', 'B');
        g.addEdge('A', 'C');;
        g.addEdge('B', 'D');
//        g.printEdges();

    }
}