import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int fansCount = scanner.nextInt();

        double transportExpenses = 0;
        if (fansCount >= 1 && fansCount <= 4) {
            transportExpenses = 0.75 * budget;
        } else if (fansCount <= 9) {
            transportExpenses = 0.60 * budget;
        } else if (fansCount <= 24) {
            transportExpenses = 0.50 * budget;
        } else if (fansCount <= 49) {
            transportExpenses = 0.40 * budget;
        } else {
            transportExpenses = 0.25 * budget;
        }

        double ticketSum = fansCount * getTicketPriceFactor(category);
        double diff = Math.abs(budget - transportExpenses);
        if (diff >= ticketSum) {
            System.out.printf("Yes! You have %.2f leva left.", (diff - ticketSum));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", (ticketSum - diff));
        }

    }

    static double getTicketPriceFactor (String category) {
        if (category.equals("VIP")) {
            return 499.99;
        } else if (category.equals("Normal")) {
            return 249.99;
        } else {
            return -1;
        }
    }
}
