import java.util.ArrayList;

public class Graph {

    public static void main(String[] args) {
        // Vertices
        String[] vertices = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};

        int n = vertices.length;

        // Adjacency Matrix
        int[][] matrix = new int[n][n];

        addEdge(matrix, 0, 2); // A -> C
        addEdge(matrix, 0, 3); // A -> D
        addEdge(matrix, 1, 3); // B -> D
        addEdge(matrix, 2, 4); // C -> E
        addEdge(matrix, 2, 5); // C -> F
        addEdge(matrix, 3, 4); // D -> E
        addEdge(matrix, 4, 6); // E -> G
        addEdge(matrix, 5, 7); // F -> H
        addEdge(matrix, 6, 7); // G -> H
        addEdge(matrix, 7, 8); // H -> I


        System.out.println("Adjacency Matrix:");

        System.out.print("  ");
        for (String vertex : vertices) {
            System.out.print(vertex + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(vertices[i] + " ");

            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("\nAdjacency List:");

        ArrayList<ArrayList<String>> adjacencyList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        addEdge(adjacencyList, 0, "C");
        addEdge(adjacencyList, 0, "D");
        addEdge(adjacencyList, 1, "D");
        addEdge(adjacencyList, 2, "E");
        addEdge(adjacencyList, 2, "F");
        addEdge(adjacencyList, 3, "E");
        addEdge(adjacencyList, 4, "G");
        addEdge(adjacencyList, 5, "H");
        addEdge(adjacencyList, 6, "H");
        addEdge(adjacencyList, 7, "I");

        for (int i = 0; i < n; i++) {
            System.out.println(vertices[i] + " -> " + adjacencyList.get(i));
        }
    }

    // For adjacency matrix
    public static void addEdge(int[][] matrix, int u, int v) { // u = scr, v = dest
        matrix[u][v] = 1; // 1 = Edge, 0 = No edge
    }

    // For adjacency list
    public static void addEdge(ArrayList<ArrayList<String>> list, int u, String v) {
        list.get(u).add(v);
    }
}