import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

    public void BFS() {
        Queue<Vertex> q = new LinkedList<>();
        int index = 0;
        q.add(VList[0]);
        VList[0].isVisited = true;
        while(q.size() != 0){
            System.out.print(q.peek().name + " <--> ");
            for(int i=0; i<VList.length; i++) {
                if(q.peek().name == VList[i].name){
                    index = i;
                    break;
                }
            }
            for(int i=0; i<VList.length; i++) {
                if(adjMatrix[index][i] == 1 && !VList[i].isVisited){
                    q.add(VList[i]);
                    VList[i].isVisited = true;
                }
            }
            q.remove();
        }
        for (int i=0; i<VList.length; i++) {
            VList[i].isVisited = false;
        }
        System.out.println();
    }

    public void DFS() {
        Stack<Vertex> stack = new Stack<>();
        int index = 0;
        stack.push(VList[0]);
        VList[0].isVisited = true;
        System.out.print(stack.peek().name + " <--> ");
        while (stack.size() != 0) {
            for (int i = 0; i < VList.length; i++) {
                if (stack.peek().name == VList[i].name) {
                    index = i;
                }
            }
            boolean child = false;
            for (int i = 0; i < VList.length; i++) {
                if (adjMatrix[index][i] == 1 && !VList[i].isVisited) {
                    stack.push(VList[i]);
                    VList[i].isVisited = true;
                    System.out.print(stack.peek().name + " <--> ");
                    child = true;
                    break;
                }
            }
            if (!child) {
                stack.pop();
            }
        }
        for (int i=0; i<VList.length; i++) {
            VList[i].isVisited = false;
        }
        System.out.println();
    }

}
