import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = scanner.nextInt();
        scanner.nextLine();
        String season = scanner.nextLine();
        int fishermenCount = scanner.nextInt();

        double shipRent = 0;
        switch (season) {
            case "Spring":
                shipRent = 3000;
                break;
            case "Summer":
            case "Autumn":
                shipRent = 4200;
                break;
            case "Winter":
                shipRent = 2600;
                break;
        }
        double totalPrice = shipRent * getEvenDiscount(season, fishermenCount) * getCountDiscount(fishermenCount);
        double diff = Math.abs(totalPrice - budget);
        if (budget >= totalPrice) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }

    }

    static double getEvenDiscount (String season, int fishermenCount) {
        if (!"Autumn".equals(season) && fishermenCount % 2 == 0) {
            return 0.95;
        } else {
            return 1;
        }
    }

    static double getCountDiscount (int fishermenCount) {
        if (fishermenCount <= 6 && fishermenCount > 0) {
            return 0.9;
        } else if (fishermenCount >= 7 && fishermenCount <= 11) {
            return 0.85;
        } else if (fishermenCount > 12) {
            return 0.75;
        } else {
            return 1;
        }
    }
}
