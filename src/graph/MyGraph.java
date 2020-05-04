package graph;

public class MyGraph {
    private int[][] adjacencyMatrix;
    private  int maxNodes;

    public MyGraph(int maxNodes) {
        this.maxNodes = maxNodes;

    }

    //add a new edge
    public void addEdge(int n1, int n2) {
        if(n1 < maxNodes && n2 < maxNodes) {
            adjacencyMatrix[n1][n2] = 1;
            adjacencyMatrix[n2][n1] = 1;
        }
    }
}

