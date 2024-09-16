// Enumeration representing different regions
public enum Region {
    R1("USA", 0.10),  // USA, tax 10%
    R2("Europe", 0.15),  // Europe, tax 15%
    R3("Asia", 0.05),  // Asia, tax 5%
    R4("Africa", 0.08);  // Africa, tax 8%

    private final String continent;
    private final double taxRate;

    // Constructor for enum constants
    Region(String continent, double taxRate) {
        this.continent = continent;
        this.taxRate = taxRate;
    }

    public String getContinent() {
        return continent;
    }

    public double getTaxRate() {
        return taxRate;
    }
}
