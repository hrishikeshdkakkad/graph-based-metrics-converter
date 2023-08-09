public class Fact {
    private String fromUnit;
    private String toUnit;
    private double multiplier;

    public Fact(String fromUnit, String toUnit, double multiplier) {
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.multiplier = multiplier;
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

    public double getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(double multiplier) {
        this.multiplier = multiplier;
    }
}
