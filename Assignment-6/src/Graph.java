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
        //Loop through column "i" until end, add 'a' to list
        List out = new List(numVertices);
        for(int a=0; a<numVertices; a=a+1){
            if(graph[i][a]){
                out.add(a);
            }
        }
        return out;
    }

    public List inEdges(int j) {
        //Loop through column "j" until end, add 'a' to list
        List in = new List(numVertices);
        for(int a=0; a<numVertices; a=a+1){
            if(graph[a][j]){
                in.add(a);
            }
        }
        return in;
    }

    boolean reachable(int source, int destination) {
        //true if source to destination reachable, false otherwise
        

    }
}
