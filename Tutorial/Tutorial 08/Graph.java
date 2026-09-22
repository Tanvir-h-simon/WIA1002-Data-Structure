import java.util.ArrayList;

public class Graph {

    public static void main(String[] args) {
        // Vertices
        String[] vertices = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};

        int n = vertices.length;

        int[][] adjMatrix = new int[n][n];

        addEdge(adjMatrix, 0, 2); // A -> C
        addEdge(adjMatrix, 0, 3); // A -> D
        addEdge(adjMatrix, 1, 3); // B -> D
        addEdge(adjMatrix, 2, 4); // C -> E
        addEdge(adjMatrix, 2, 5); // C -> F
        addEdge(adjMatrix, 3, 4); // D -> E
        addEdge(adjMatrix, 4, 6); // E -> G
        addEdge(adjMatrix, 5, 7); // F -> H
        addEdge(adjMatrix, 6, 7); // G -> H
        addEdge(adjMatrix, 7, 8); // H -> I


        System.out.println("Adjacency Matrix:");

        System.out.print("  ");
        for (String vertex : vertices) {
            System.out.print(vertex + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(vertices[i] + " ");

            for (int j = 0; j < n; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("\nAdjacency List:");

        ArrayList<ArrayList<String>> adjList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        addEdge(adjList, 0, "C");
        addEdge(adjList, 0, "D");
        addEdge(adjList, 1, "D");
        addEdge(adjList, 2, "E");
        addEdge(adjList, 2, "F");
        addEdge(adjList, 3, "E");
        addEdge(adjList, 4, "G");
        addEdge(adjList, 5, "H");
        addEdge(adjList, 6, "H");
        addEdge(adjList, 7, "I");

        for (int i = 0; i < n; i++) {
            System.out.println(vertices[i] + " -> " + adjList.get(i));
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
