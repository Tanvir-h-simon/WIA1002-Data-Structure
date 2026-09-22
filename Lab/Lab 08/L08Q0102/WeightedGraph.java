import java.util.ArrayList;

class Edge {
    int dest;
    int weight;

    Edge(int dest, int weight) {
        this.dest = dest;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "(" + dest + ", w=" + weight + ")";
    }
}

public class WeightedGraph {
    int vertices;
    private ArrayList<ArrayList<Edge>> adjList;

    public WeightedGraph(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>()); // Initialize
        }
    }

    public boolean addDirectedEdge(int u, int v, int weight) {
        adjList.get(u).add(new Edge(v, weight));
        return true;
    }

    public boolean addUndirectedEdge(int u, int v, int weight) {
        adjList.get(u).add(new Edge(v, weight));
        adjList.get(v).add(new Edge(u, weight));
        return true;
    }

    public boolean removeEdge(int u, int v) {
        ArrayList<Edge> edges = adjList.get(u);

        for (int i = 0; i < edges.size(); i++) {
            if (edges.get(i).dest == v) {
                edges.remove(i);
                return true;
            }
        }
        return false; // Edge not found
    }

    public void display() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + ": ");
            for (Edge edge : adjList.get(i)) {
                System.out.print(edge + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int vertices = 5;

        // WeightedGraph graph1 = new WeightedGraph(vertices);
        //
        // graph1.addDirectedEdge(0, 1, 10);
        // graph1.addDirectedEdge(0, 2, 20);
        // graph1.addDirectedEdge(1, 2, 30);
        // graph1.addDirectedEdge(2, 3, 40);
        // graph1.addDirectedEdge(3, 4, 50);
        //
        // System.out.println("Directed graph: ");
        // graph1.display();

        WeightedGraph graph2 = new WeightedGraph(vertices);

        graph2.addUndirectedEdge(0, 1, 10);
        graph2.addUndirectedEdge(0, 2, 20);
        graph2.addUndirectedEdge(1, 2, 30);
        graph2.addUndirectedEdge(2, 3, 40);
        graph2.addUndirectedEdge(3, 4, 50);


        System.out.println("Undirected graph:");
        graph2.display();

        System.out.println("\nRemoving edge 2 -> 3:");
        if (graph2.removeEdge(2, 3)) {
            System.out.println("Edge removed successfully.");
        } else {
            System.out.println("Edge not found.");
        }

        System.out.println("\nGraph after removing edge:");
        graph2.display();
    }
}