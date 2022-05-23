import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCardsQuantity = Integer.parseInt(scanner.nextLine());
        int processorsQuantity = Integer.parseInt(scanner.nextLine());
        int memoryQuantity = Integer.parseInt(scanner.nextLine());

        double videoCardsPrice = videoCardsQuantity * 250;
        double processorsPrice = processorsQuantity * videoCardsPrice * 0.35;
        double memoryPrice = memoryQuantity * videoCardsPrice * 0.10;
        double totalPrice = videoCardsPrice + processorsPrice + memoryPrice;
        if (videoCardsQuantity > processorsQuantity) {
            totalPrice = totalPrice * 0.85;
        }
        double difference = Math.abs(budget - totalPrice);
        if (totalPrice <= budget) {
            System.out.printf("You have %.2f leva left!", difference);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", difference);
        }
    }
}
