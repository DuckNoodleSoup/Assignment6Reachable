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

    boolean[] visited = new boolean[numVertices];

    public boolean reachable(int source, int destination) {















        /*
        //true if source to destination reachable, false otherwise
        //Implementing Depth First Search

        //1. Set up: Boolean Array to keep track of where we've been
        boolean[] track = new boolean[numVertices];
        for (int i = 0; i < numVertices; i = i + 1) {
            track[i] = false;
        }
        //and create stack
        Stack frontier = new Stack();

        //2. Depth First Search
        int current = source;
        boolean found = false;
        boolean done = false;

        while (!done) {

            List successors = outEdges(current); //Successors

            //TEST
            System.out.println("Pushing Successors of: " + current);
            //TEST

            //Push all successors to the top of the stack
            if (!track[current]) {
                //TEST
                System.out.println("Pushing b/c not yet visited. ");
                for (int b = 0; b < 17; b = b + 1) {
                    if (successors.table[b] != null) {
                        ListNode c = successors.table[b];
                        //Add everything to frontier
                        frontier.push(c.storage);
                        while (c.next != null) {
                            frontier.push(c.storage);
                            c = c.next;
                        }
                    }
                }
            }


            //if empty stack
            if (frontier.isEmpty()) {

                //TEST
                System.out.println("No more frontier paths, not reachable");
                //TEST

                return false;
            }

            //We've seen current, now change
            track[current] = true;

            //current gets the next in the frontier
            current = frontier.pop();

            //TEST
            System.out.println("Changing current to: " + current);
            //TEST

            if (current == destination) {
                found = true;
                done = true;
            }
            //If everything's visited, stop loop.
            done = visitedEverything(track);
        }
    return found;
    }

    //Helper Method for Reachable: did we visit everything?
    public boolean visitedEverything(boolean[] track){
        int length = track.length;
        for(int i=0; i<length; i=i+1){
            if(track[i]==false){
                return false;
            }
        }
        return true;


        */
    }
}
