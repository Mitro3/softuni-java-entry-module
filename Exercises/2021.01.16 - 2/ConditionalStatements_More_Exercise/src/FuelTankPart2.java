import java.util.Scanner;

public class FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuelType = scanner.nextLine().toLowerCase();
        double fuelQuantity = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine().toLowerCase();

        double discount = (getFuelPrice(fuelType) - getClubCardDiscount(fuelType, clubCard)) * (getLitersDiscountFactor(fuelQuantity));
        double totalPrice = fuelQuantity * discount;
        System.out.printf("%.2f lv.", totalPrice);

    }

    static double getFuelPrice (String fuelType) {
        if (fuelType.equals("gas")) {
            return 0.93;
        } else if (fuelType.equals("gasoline")) {
            return 2.22;
        } else if (fuelType.equals("diesel")) {
            return 2.33;
        } else {
            return 0;
        }
    }

    static double getClubCardDiscount (String fuelType, String clubCard) {
        if (clubCard.equals("yes")) {
            if (fuelType.equals("gas")) {
                return 0.08;
            } else if (fuelType.equals("gasoline")) {
                return 0.18;
            } else if (fuelType.equals("diesel")) {
                return 0.12;
            } else return 0;
        } else {
            return 0;
        }
    }

    static double getLitersDiscountFactor (double fuelQuantity) {
        if (fuelQuantity >= 20 && fuelQuantity <= 25) {
            return 0.92;
        } else if (fuelQuantity > 25) {
            return 0.90;
        } else {
            return 1;
        }
    }
}
