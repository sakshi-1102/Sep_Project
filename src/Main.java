import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the country of origin and the base price
        System.out.print("Enter the country of origin: ");
        String country = scanner.nextLine();

        System.out.print("Enter the base price of the car: ");
        double basePrice = scanner.nextDouble();

        // Create a car object
        Car car = new Car(country, basePrice);

        // Get the region based on the country
        try {
            Region region = CarFactory.getRegionByCountry(country);

            // Calculate the total price (including tax)
            double totalPrice = car.calculatePrice(region);

            // Display the result
            System.out.println("The car is from " + country + " (Region: " + region.getContinent() + ")");
            System.out.println("Base Price: $" + basePrice);
            System.out.println("Total Price (with tax): $" + totalPrice);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Close the scanner
        scanner.close();
    }
}
