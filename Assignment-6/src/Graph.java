public class Graph {
    //This is an Adjacency Matrix implementation
    boolean[][] graph;
    
    public Graph (int numVertices) {
        graph = new boolean[numVertices][numVertices];
    }

    public void addEdge(int i, int j) {
        // YOUR CODE HERE
    }

    public void removeEdge(int i, int j) {
        // YOUR CODE HERE
    }

    public boolean hasEdge(int i, int j) {
        // YOUR CODE HERE
    }

    public List outEdges(int i) {
        // YOUR CODE HERE
    }

    public List inEdges(int i) {
        // YOUR CODE HERE
    }

    boolean reachable(int source, int destination) {
        // YOUR CODE HERE
        // Should true if destination can be reached from source,
        // or false otherwise
    }
}
