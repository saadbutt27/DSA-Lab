public class Main {
    public static void main(String[] args) {
        System.out.println("Graph");
        Graph g = new Graph(5);
        g.addVertex('A');
        g.addVertex('B');
        g.addVertex('C');
        g.addVertex('D');
        g.addVertex('E');

        g.addEdge('A', 'B');
        g.addEdge('A', 'D');
        g.addEdge('B', 'C');
        g.addEdge('B', 'D');
        g.addEdge('B', 'E');
        g.addEdge('C', 'D');
        g.addEdge('D', 'E');

        g.printEdges();

        System.out.println("BFS");
        g.BFS();
        System.out.println("DFS");
        g.DFS();
    }
}