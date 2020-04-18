public class Graph {
    //This is an Adjacency Matrix implementation

    //Testing github again
    boolean[][] graph;
    int numVertices;
    
    public Graph (int n) {
        numVertices = n;
        graph = new boolean[numVertices][numVertices];

        //TEST
        System.out.println();
        System.out.println("Created Graph with " + numVertices + " vertices.");
        System.out.println();
        //TEST

    }

    public void addEdge(int i, int j) {
        graph[i][j] = true;
    }

    public void removeEdge(int i, int j) {
        graph[i][j] = false;
    }

    public boolean hasEdge(int i, int j) {
        return graph[i][j];
    }

    public List outEdges(int i) {
        //Loop through column "i" until end, add 'a' to list
        //Column "i": source vertex, "a" target vertex
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
        //Column "j": target vertex, "a" source vertex
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
        //Implementing Depth First Search

        //1. boolean array to keep track of where we've been
        boolean[] track = new boolean[numVertices];
        for(int i=0; i<numVertices; i=i+1){
            track[i]=false;
        }

        //2. Depth First Search: successors to top of frontier stack


    }
}
