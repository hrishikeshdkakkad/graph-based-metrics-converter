public class Query {
    private String fromUnit;
    private String toUnit;
    private double quantity;

    public Query(String fromUnit, String toUnit, double quantity) {
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.quantity = quantity;
    }

    public String getFromUnit() {
        return fromUnit;
    }

    public void setFromUnit(String fromUnit) {
        this.fromUnit = fromUnit;
    }

    public String getToUnit() {
        return toUnit;
    }

    public void setToUnit(String toUnit) {
        this.toUnit = toUnit;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double multiplier) {
        this.quantity = multiplier;
    }
}
