import java.util.Scanner;

public class EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guestsCount = Integer.parseInt(scanner.nextLine());
        double guestPrice = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double groupPrice = guestsCount * guestPrice;
        double cakePrice = budget * 0.1;
        double discountedPrice = getDiscountFactor(guestsCount) * groupPrice + cakePrice;
        double difference = Math.abs(discountedPrice - budget);
        if (budget >= discountedPrice) {
            System.out.printf("It is party time! %.2f leva left.", difference);
        } else {
            System.out.printf("No party! %.2f leva needed.", difference);
        }
    }

    static double getDiscountFactor (double guestsCount) {
        if (guestsCount >= 10 && guestsCount <= 15) {
            return 0.85;
        } else if (guestsCount >= 15 && guestsCount <= 20) {
            return 0.80;
        } else if (guestsCount > 20) {
            return 0.75;
        } else {
            return 1;
        }
    }
}
