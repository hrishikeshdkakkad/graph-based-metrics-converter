import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Fact meterToFeetFact = new Fact("m", "ft", 3.28);
        Fact feetToInchesFact = new Fact("ft", "inches", 12);
        Fact hrToMinsFact = new Fact("hr", "min", 60);
        Fact minToSecFact = new Fact("min", "sec", 60);
        Fact hrToSecFact = new Fact("hr", "sec", 3600);

        List<Fact> factList = new ArrayList<Fact>();
        factList.add(meterToFeetFact);
        factList.add(feetToInchesFact);
        factList.add(hrToMinsFact);
        factList.add(minToSecFact);
        factList.add(hrToSecFact);

        Builder graphBuilder = new Builder(factList);
        Graph graph = graphBuilder.buildGraph();
        Query query = new Query("m", "inches", 2);

        Computer computer = new Computer(graph, query);
        double result = computer.process();
        System.out.println(result);
    }
}
