import java.util.HashMap;
import java.util.List;

public class Graph {
    private HashMap<Node, List<List<Edge>>> adjacencyList;

    public Graph(HashMap<Node, List<List<Edge>>> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }

    public HashMap<Node, List<List<Edge>>> getAdjacencyList() {
        return adjacencyList;
    }
}
