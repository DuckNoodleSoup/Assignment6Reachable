public class Graph {
    //This is an Adjacency Matrix implementation

    //Testing github again
    boolean[][] graph;
    int numVertices;
    
    public Graph (int n) {
        numVertices = n;
        graph = new boolean[numVertices][numVertices];

    }

    public void addEdge(int i, int j) {
        graph[i][j] = true;
        graph[j][i] = true;
    }

    public void removeEdge(int i, int j) {
        graph[i][j] = false;
        graph[j][i] = false;
    }

    public boolean hasEdge(int i, int j) {
        return graph[i][j];
    }

    public List outEdges(int i) {
        List out = new List(numVertices);
        for(int a=0; a<numVertices; a=a+1){
            
        }
    }

    public List inEdges(int i) {

    }

    boolean reachable(int source, int destination) {
        // YOUR CODE HERE
        // Should true if destination can be reached from source,
        // or false otherwise
    }
}
