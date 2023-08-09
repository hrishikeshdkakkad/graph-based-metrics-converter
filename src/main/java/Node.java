import java.util.Objects;

public class Node {
    private String unit;

    public Node(String unit) {
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Node{" +
                "unit='" + unit + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Node otherNode = (Node) obj;
        return Objects.equals(unit, otherNode.unit);
    }
}
