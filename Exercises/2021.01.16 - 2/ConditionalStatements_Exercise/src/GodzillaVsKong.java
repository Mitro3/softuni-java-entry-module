import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statistsCount = Integer.parseInt(scanner.nextLine());
        double dressPrice = Double.parseDouble(scanner.nextLine());

        if (statistsCount > 150) {
            dressPrice = dressPrice * 0.9;
        }
        double dressPriceTotal = statistsCount * dressPrice;
        double decorPrice = 0.1 * budget;
        double totalPrice = decorPrice + dressPriceTotal;
        double difference = Math.abs(budget - totalPrice);
        if (budget >= totalPrice) {
            System.out.printf("Action!\nWingard starts filming with %.2f leva left.", difference);
        } else {
            System.out.printf("Not enough money!\nWingard needs %.2f leva more.", difference);
        }
    }
}
