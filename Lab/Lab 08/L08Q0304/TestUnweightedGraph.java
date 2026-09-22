public class TestUnweightedGraph {
    public static void main(String[] args) {
        int vertices = 5;

        // Graph graph1 = new Graph(vertices);
        //
        // graph1.addEdge(0, 1);
        // graph1.addEdge(0, 2);
        // graph1.addEdge(1, 2);
        // graph1.addEdge(2, 3);
        // graph1.addEdge(3, 4);
        //
        // System.out.println("Directed graph: ");
        // graph1.display();

        Graph graph2 = new Graph(vertices);

        graph2.addUndirectedEdge(0, 1);
        graph2.addUndirectedEdge(0, 2);
        graph2.addUndirectedEdge(1, 2);
        graph2.addUndirectedEdge(2, 3);
        graph2.addUndirectedEdge(3, 4);

        System.out.println("\nUndirected graph:");
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