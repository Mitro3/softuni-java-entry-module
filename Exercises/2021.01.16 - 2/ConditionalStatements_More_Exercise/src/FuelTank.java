import java.util.Locale;
import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuelType = scanner.nextLine().toLowerCase();
        double fuelTank = Double.parseDouble(scanner.nextLine());

        if (fuelType.equals("diesel") || fuelType.equals("gasoline") || fuelType.equals("gas")) {
            if (fuelTank >= 25) {
                System.out.printf("You have enough %s.", fuelType);
            } else {
                System.out.printf("Fill your tank with %s!", fuelType);
            }
        } else {
            System.out.println("Invalid fuel!");
        }
    }
}
