import java.util.Scanner;

public class MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int daysCount = scanner.nextInt();

        double discount = 1.00;
        if (destination.equals("Dubai")) {
            discount = 0.70;
        } else if (destination.equals("Sofia")) {
            discount = 1.25;
        }

        double price = 0;
        switch (destination) {
            case "Dubai":
                price = getDubaiPrice(season);
                break;
            case "Sofia":
                price = getSofiaPrice(season);
                break;
            case "London":
                price = getLondonPrice(season);
        }
        double discountedPrice = price * discount * daysCount;
        double diff = Math.abs(budget - discountedPrice);

        if (budget >= discountedPrice) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", diff);
        } else {
            System.out.printf("The director needs %.2f leva more!", diff);
        }

    }

    static double getDubaiPrice (String season) {
        switch (season) {
            case "Winter":
                return 45000;
            case "Summer":
                return 40000;
            default:
                return 0;
        }
    }

    static double getSofiaPrice (String season) {
        switch (season) {
            case "Winter":
                return 17000;
            case "Summer":
                return 12500;
            default:
                return 0;
        }
    }

    static double getLondonPrice (String season) {
        switch (season) {
            case "Winter":
                return 24000;
            case "Summer":
                return 20250;
            default:
                return 0;
        }
    }
}
