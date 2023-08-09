import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Computer {
    final private Graph graph;
    final private Query query;

    public Computer(Graph graph, Query query) {
        this.graph = graph;
        this.query = query;
    }

    public double process() {
        Node fromQueryNode = new Node(this.query.getFromUnit());
        Node toQueryNode = new Node(this.query.getToUnit());

        HashMap<Node, Boolean> visited = new HashMap<Node, Boolean>();

        Queue<QueuePair> queue = new LinkedList<QueuePair>();
        queue.add(new QueuePair(fromQueryNode, this.query.getQuantity()));

        while (!queue.isEmpty()) {
            QueuePair pair = queue.poll();
            Node fromNode = pair.getNode();

            if(fromNode.equals(toQueryNode)) {
                return pair.getResult();
            }

            if(!visited.containsKey(fromNode)) {
                visited.put(fromQueryNode, true);
                List<List<Edge>> edges = graph.getAdjacencyList().get(fromNode);
                for (List<Edge> edge : edges) {
                    double recomputedResult = edge.get(0).getMultiplier() * pair.getResult();
                    queue.add(new QueuePair(edge.get(0).getNode(), recomputedResult));
                }
            }
        }
        return Double.MIN_VALUE;
    }
}
