import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = scanner.nextDouble();
        scanner.nextLine();
        String season = scanner.nextLine();

        double price = 0;
        String place = null;
        String holidayType = null;

        if (budget <= 100) {
            price = getBulgariaPrice(season) * budget;
            place = "Bulgaria";
        } else if (budget <= 1000) {
            price = getBalkansPrice(season) * budget;
            place = "Balkans";
        } else {
            price = getEuropePrice(season) * budget;
            place = "Europe";
        }
        if (season.equals("summer") && price <= 1000) {
            holidayType = "Camp";
        } else if (season.equals("winter") || price > 1000) {
            holidayType = "Hotel";
        }
        System.out.printf("Somewhere in %s%n", place);
        System.out.printf("%s - %.2f", holidayType, price);
    }

    static double getBulgariaPrice (String season) {
        if (season.equals("summer")) {
            return 0.30;
        } else if (season.equals("winter")) {
            return 0.70;
        } else {
            return 1;
        }
    }

    static double getBalkansPrice (String season) {
        if (season.equals("summer")) {
            return 0.40;
        } else if (season.equals("winter")) {
            return 0.80;
        } else {
            return 1;
        }
    }

    static double getEuropePrice (String season) {
        return 0.90;
    }
}
