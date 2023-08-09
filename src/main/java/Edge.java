public class Edge {
    private Node node;
    private Double multiplier;

    public Edge(Node node, Double multiplier) {
        this.node = node;
        this.multiplier = multiplier;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public Double getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(Double multiplier) {
        this.multiplier = multiplier;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "node=" + node +
                ", multiplier=" + multiplier +
                '}';
    }
}
