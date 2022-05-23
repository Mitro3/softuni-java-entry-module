import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int nightsCount = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int percentAdditionalCost = Integer.parseInt(scanner.nextLine());

        double discountFactor = getDiscountFactor(nightsCount);
        double discountedPrice = nightsCount * pricePerNight * discountFactor;
        double additionalCost = budget * percentAdditionalCost / 100;
        double totalPrice = discountedPrice + additionalCost;
        double balance = Math.abs(budget - totalPrice);
        if (budget >= totalPrice) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", balance);
        } else {
            System.out.printf("%.2f leva needed.", balance);
        }
    }

    static double getDiscountFactor (double nightsCount) {
        if (nightsCount > 7) {
            return 0.95;
        } else {
            return 1;
        }
    }
}
