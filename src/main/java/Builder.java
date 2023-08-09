import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Builder {
    final private List<Fact> facts;

    public Builder(List<Fact> facts) {
        this.facts = facts;
    }

    public Graph buildGraph() {
        HashMap<Node, List<List<Edge>>> adjList = new HashMap<Node, List<List<Edge>>>();
        for(Fact fact : facts) {
            Node fromNode = new Node(fact.getFromUnit());
            Node toNode = new Node(fact.getToUnit());

            if (!adjList.containsKey(fromNode)) {
                adjList.put(fromNode, new ArrayList<>());
            }

            if (!adjList.containsKey(toNode)) {
                adjList.put(toNode, new ArrayList<>());
            }

            adjList.computeIfPresent(fromNode, (key, value) -> {
                List<Edge> edge = new ArrayList<Edge>();
                edge.add(new Edge(toNode, fact.getMultiplier()));
                value.add(edge);
                return value;
            });

            adjList.computeIfPresent(toNode, (key, value) -> {
                List<Edge> edge = new ArrayList<Edge>();
                edge.add(new Edge(fromNode, 1 / fact.getMultiplier()));
                value.add(edge);
                return value;
            });
        }

        return new Graph(adjList);
    }
}
