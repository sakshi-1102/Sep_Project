// Factory class to map countries to regions
public class CarFactory {

    // Method to map the country of origin to the corresponding region
    public static Region getRegionByCountry(String country) {
        switch (country.toLowerCase()) {
            case "usa":
            case "canada":
                return Region.R1;  // USA region
            case "germany":
            case "france":
                return Region.R2;  // Europe region
            case "india":
            case "japan":
                return Region.R3;  // Asia region
            case "nigeria":
            case "south africa":
                return Region.R4;  // Africa region
            default:
                throw new IllegalArgumentException("Country not supported.");
        }
    }
}
