import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int requiredSum = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        int counter = 0;
        int collectedSumCash = 0;
        int collectedSumCard = 0;
        int collectedSumTotal = 0;
        int cashCount = 0;
        int cardCount = 0;
        boolean isCollected = false;


        while (!input.equals("End")) {
            int itemPrice = Integer.parseInt(input);

            if (counter % 2 == 0) {
                if (itemPrice > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    collectedSumCash += itemPrice;
                    cashCount++;
                }
            } else {
                if (itemPrice < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    collectedSumCard += itemPrice;
                    cardCount++;
                }
            }
            collectedSumTotal = collectedSumCash + collectedSumCard;

            if (collectedSumTotal >= requiredSum) {
                isCollected = true;
                break;
            }

            counter++;
            input = scanner.nextLine();
        }

        if (isCollected) {
            double averageCS = 1.0 * collectedSumCash / cashCount;
            double averageCC = 1.0 * collectedSumCard / cardCount;
            System.out.printf("Average CS: %.2f%n", averageCS);
            System.out.printf("Average CC: %.2f", averageCC);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }

    }
}
