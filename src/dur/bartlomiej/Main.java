package dur.bartlomiej;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Graph g1 = new Graph(4L);
        g1.addEdge(0L, 1L);
        g1.addEdge(0L, 2L);
        g1.addEdge(1L, 2L);
        g1.addEdge(2L, 3L);
        g1.printEulerPath();

        Graph g2 = new Graph(3L);
        g2.addEdge(0L, 1L);
        g2.addEdge(1L, 2L);
        g2.addEdge(2L, 0L);
        g2.printEulerPath();

        Graph g3 = new Graph(5L);
        g3.addEdge(1L, 0L);
        g3.addEdge(0L, 2L);
        g3.addEdge(2L, 1L);
        g3.addEdge(0L, 3L);
        g3.addEdge(3L, 4L);
        g3.addEdge(3L, 2L);
        g3.addEdge(3L, 1L);
        g3.addEdge(2L, 4L);
        g3.printEulerPath();

    }
}
