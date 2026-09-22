import java.util.ArrayList;

public class Graph {
    int vertices;
    private ArrayList<ArrayList<Integer>> adjList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public boolean addEdge(int u, int v) {
        adjList.get(u).add(v);
        return true;
    }

    public boolean addUndirectedEdge(int u, int v) {
        adjList.get(u).add(v); // u -> v
        adjList.get(v).add(u); // v -> u
        return true;
    }

    public boolean removeEdge(int u, int v) {
        ArrayList<Integer> edges = adjList.get(u);

        for (int i = 0; i < edges.size(); i++) {
            if (edges.get(i) == v) {
                edges.remove(i);
                return true;
            }
        }
        return false; // Edge not found
    }

    public void display() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + ": ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}