public class QueuePair {
    final private Node node;
    final private double result;

    public QueuePair(Node node, double result) {
        this.node = node;
        this.result = result;
    }

    public Node getNode() {
        return node;
    }

    public double getResult() {
        return result;
    }
}
