import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysAway = Integer.parseInt(scanner.nextLine());
        int totalFoodKg = Integer.parseInt(scanner.nextLine());
        double dogFoodDailyKg = Double.parseDouble(scanner.nextLine());
        double catFoodDailyKg = Double.parseDouble(scanner.nextLine());
        double turtleFoodDailyGr = Double.parseDouble(scanner.nextLine());

        double eatenFoodDailyKg = dogFoodDailyKg + catFoodDailyKg + (turtleFoodDailyGr / 1000.0);
        double totalFoodKgRequired = eatenFoodDailyKg * daysAway;
        double difference = Math.abs(totalFoodKg - totalFoodKgRequired);
        if (totalFoodKg >= totalFoodKgRequired) {
            System.out.printf("%.0f kilos of food left.", Math.floor(difference));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(difference));
        }
    }
}
