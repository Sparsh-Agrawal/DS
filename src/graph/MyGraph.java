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

    //check if there is edge
    public  boolean isEdge(int n1, int n2) {
        boolean res = false;
        if(n1 < maxNodes && n2 < maxNodes) {
            if(adjacencyMatrix[n1][n2]==1) {
                res = true;
            }
        }
        return res;
    }

    //print matrix
    public void display() {
        for (int i = 0;i<maxNodes;i++) {
            for (int j=0;j<maxNodes;j++) {
                System.out.println(adjacencyMatrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

