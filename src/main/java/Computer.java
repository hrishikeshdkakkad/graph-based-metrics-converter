public class Computer {
    final private Graph graph;
    final private Query query;

    public Computer(Graph graph, Query query) {
        this.graph = graph;
        this.query = query;
    }

    public double process() {
        return 2;
    }
}
