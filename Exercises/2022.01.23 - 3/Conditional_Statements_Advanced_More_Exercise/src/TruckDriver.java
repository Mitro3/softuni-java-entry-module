import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double km = Double.parseDouble(scanner.nextLine());

        double profit = km * getSeasonalPrice(season, km) * 4 * 0.90;
        System.out.printf("%.2f", profit);
    }

    static double getSeasonalPrice (String season, double km) {
        double profit = 0;
        if (km <= 5000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    profit = 0.75;
                    break;
                case "Summer":
                    profit = 0.90;
                    break;
                case "Winter":
                    profit = 1.05;
            }
        } else if (km <= 10000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    profit = 0.95;
                    break;
                case "Summer":
                    profit = 1.10;
                    break;
                case "Winter":
                    profit = 1.25;
            }
        } else if (km <= 20000) {
            profit = 1.45;
        }
        return profit;
    }
}
