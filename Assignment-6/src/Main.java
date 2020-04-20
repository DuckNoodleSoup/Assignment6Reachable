public class Main {
    public static void main(String[] args) {

        // First test the basic graph functionality
        System.out.println("Running graphTest ...");
        graphTest();

        // Then run 100 randomlyAddUntilReachable() tests and print the individual and average results
        int numTests = 100;
        int[] results = new int[numTests];
        for (int i = 0; i < numTests; i++)
            results[i] = randomlyAddUntilReachable();
        System.out.print("Test results: ");
        for (int i = 0; i < numTests; i++)
            System.out.print(results[i] + " ");
        System.out.println();
        int total = 0;
        for (int i = 0; i < numTests; i++)
            total += results[i];
        System.out.println("Average: " + total / (double) numTests);

    }

    static void graphTest() {
        System.out.println("Testing graph functionality:");
        System.out.print("Creating a graph with 10 vertices. ");
        Graph g = new Graph(10);
        System.out.println("Adding some edges.");
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(3, 6);
        g.addEdge(6, 8);
        g.addEdge(2, 8);
        g.addEdge(8, 2);
        System.out.println("Checking for some edges:");
        System.out.println("g.hasEdge(0, 1) => " + g.hasEdge(0, 1));
        System.out.println("g.hasEdge(0, 3) => " + g.hasEdge(0, 3));
        System.out.println("g.hasEdge(6, 8) => " + g.hasEdge(6, 8));
        System.out.println("Removing an edge.");
        g.removeEdge(6, 8);
        System.out.println("Checking for some edges:");
        System.out.println("g.hasEdge(0, 1) => " + g.hasEdge(0, 1));
        System.out.println("g.hasEdge(0, 3) => " + g.hasEdge(0, 3));
        System.out.println("g.hasEdge(6, 8) => " + g.hasEdge(6, 8));
        System.out.println("Checking in-edges and out-edges:");
        System.out.print("g.inEdges(2).print() => ");
        g.inEdges(2).print();
        System.out.print("g.outEdges(2).print() => ");
        g.outEdges(2).print();
        System.out.println("Checking reachablility:");
        System.out.println("g.reachable(0, 6) => " + g.reachable(0, 6));
        System.out.println("g.reachable(2, 6) => " + g.reachable(2, 6));

        Graph g2 = new Graph(11);
        System.out.println("More Edges");
        g2.addEdge(0, 1);
        g2.addEdge(0, 2);
        g2.addEdge(0, 3);
        g2.addEdge(1, 4);
        g2.addEdge(1, 5);
        g2.addEdge(1, 6);
        g2.addEdge(2, 7);
        g2.addEdge(2, 9);
        g2.addEdge(9, 10);

        System.out.println("g.reachable(1, 10) => " + g2.reachable(1, 10));
        System.out.println("g.reachable(0, 10) => " + g2.reachable(0, 10));


    }

    static int randomlyAddUntilReachable() {
        int vertices = 100;
        Graph g = new Graph(vertices);
        int edges = 0;
        while (!g.reachable(0, 1)) {
            int source = (int) (Math.random() * vertices);
            int destination = (int) (Math.random() * vertices);
            if (!g.hasEdge(source, destination)) {
                g.addEdge(source, destination);
                edges++;
            }
        }
        return edges;
    }
}
