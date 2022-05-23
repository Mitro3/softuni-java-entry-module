import java.util.Scanner;

public class FuelTank3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuelType = scanner.nextLine().toLowerCase();
        double fuelQuantity = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine().toLowerCase();

        double discount = (getFuelPrice(fuelType) - getClubCardDiscount(fuelType, clubCard)) * (getLitersDiscountFactor(fuelQuantity));
        double totalPrice = fuelQuantity * discount;
        System.out.printf("%.2f lv.", totalPrice);

    }

    static double getFuelPrice(String fuelType) {
        switch (fuelType) {
            case "gas":
                return 0.93;
            case "gasoline":
                return 2.22;
            case "diesel":
                return 2.33;
            default:
                return 0;
        }
    }

    static double getClubCardDiscount(String fuelType, String clubCard) {
        if (!clubCard.equals("yes")) {
            return 0;
        }
        switch (fuelType) {
            case "gas":
                return 0.08;
            case "gasoline":
                return 0.18;
            case "diesel":
                return 0.12;
            default:
                return 0;
        }
    }

    static double getLitersDiscountFactor(double fuelQuantity) {
        if (fuelQuantity >= 20 && fuelQuantity <= 25) {
            return 0.92;
        } else if (fuelQuantity > 25) {
            return 0.90;
        } else {
            return 1;
        }
    }
}


