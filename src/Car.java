// Base class representing a car
public class Car {
    private String countryOfOrigin;
    private double basePrice;

    // Constructor
    public Car(String countryOfOrigin, double basePrice) {
        this.countryOfOrigin = countryOfOrigin;
        this.basePrice = basePrice;
    }

    // Method to calculate the total price based on the region
    public double calculatePrice(Region region) {
        double tax = basePrice * region.getTaxRate();
        return basePrice + tax;
    }

    // Getters for car properties
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public double getBasePrice() {
        return basePrice;
    }
}
