import java.util.Scanner;

public class GodzillaVsKingKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budgetMovie = Double.parseDouble(scanner.nextLine());
        int numStatists = Integer.parseInt(scanner.nextLine());
        double priceDressPerStatists = Double.parseDouble(scanner.nextLine());

        double priceDecor = budgetMovie * 0.1;
        if (numStatists > 150) {
            priceDressPerStatists = priceDressPerStatists * 0.9;
        }
        double sumDressStatists = priceDressPerStatists * numStatists;
        double totSumMovie = priceDecor + sumDressStatists;
        double difference = Math.abs(budgetMovie - totSumMovie);
        if (totSumMovie > budgetMovie) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", difference);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", difference);
        }
    }
}
