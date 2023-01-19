import java.util.Arrays;

public class Graph {
    // undirected and unweighted graph
    // make directed and unweighted graph
    // make undirected and weighted graph
    // make directed and weighted graph
    // make method to find neighbour of a vertex
    // make method to find if there is a path between two vertices
    Vertex [] VList;
    int numOfVertices;
    int [][] adjMatrix;

    public Graph(int size) {
        VList = new Vertex[size];
        adjMatrix = new int[size][size];
        numOfVertices = -1;
    }



    public boolean addVertex(char name) {
        if (numOfVertices == VList.length-1) {
            return false;
        }
        Vertex v = new Vertex(name);
        numOfVertices++;
        VList[numOfVertices] = v;
        return true;
    }

    public void addEdge(char v1, char v2) {
        int a = 0;
        int b = 0;
        for (int i=0; i<VList.length; i++) {
            if(VList[i].name == v1) {
                a = i;
            }
            if(VList[i].name == v2) {
                b = i;
            }
        }
        adjMatrix[a][b] = 1;
        adjMatrix[b][a] = 1;
    }

    public void printEdges() {
        for (int i=0; i<adjMatrix.length; i++) {
            for (int j=0; j<adjMatrix.length; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
