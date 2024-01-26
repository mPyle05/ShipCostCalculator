import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        // Pseudo code:
        // Prompt the user to enter the price of an item
        // Read the input using Scanner
        // If the item price is $100 or more, shipping is free, otherwise it is 2% of the price
        // Calculate shipping cost and total price
        // Output shipping cost and total price

        // Code:
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of the item: ");
        double itemPrice = scanner.nextDouble();

        double shippingCost;
        if (itemPrice >= 100) {
            shippingCost = 0; // Shipping is free
        } else {
            shippingCost = itemPrice * 0.02; // 2% of the item price
        }

        double totalPrice = itemPrice + shippingCost;

        System.out.println("Shipping Cost: $" + shippingCost);
        System.out.println("Total Price: $" + totalPrice);

        scanner.close();
    }
}