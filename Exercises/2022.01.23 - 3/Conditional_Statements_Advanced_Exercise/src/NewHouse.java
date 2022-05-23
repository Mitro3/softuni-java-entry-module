import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowersType = scanner.nextLine();
        int flowersCount = scanner.nextInt();
        int budget = scanner.nextInt();

        double rosePrice = 5.0;
        double dahliaPrice = 3.80;
        double tulipPrice = 2.80;
        double narcissusPrice = 3.00;
        double gladiolusPrice = 2.50;

        double totalPrice = 0;
        if (flowersType.equals("Roses")) {
            totalPrice = flowersCount * rosePrice;
        } else if (flowersType.equals("Dahlias")) {
            totalPrice = flowersCount * dahliaPrice;
        } else if (flowersType.equals("Tulips")) {
            totalPrice = flowersCount * tulipPrice;
        } else if (flowersType.equals("Narcissus")) {
            totalPrice = flowersCount * narcissusPrice;
        } else if (flowersType.equals("Gladiolus")) {
            totalPrice = flowersCount * gladiolusPrice;
        }
        double discountedPrice = totalPrice *  getDiscountFactor(flowersType, flowersCount);
        double diff = Math.abs(discountedPrice - budget);
        if (budget >= discountedPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersCount, flowersType, diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }

    static double getDiscountFactor(String flowersType, int flowersCount) {
        double discount = 1;
        if (flowersType.equals("Roses") && flowersCount > 80) {
            discount = 0.90;
        } else if (flowersType.equals("Dahlias") && flowersCount > 90) {
            discount = 0.85;
        } else if (flowersType.equals("Tulips") && flowersCount > 80) {
            discount = 0.85;
        } else if (flowersType.equals("Narcissus") && flowersCount < 120) {
            discount = 1.15;
        } else if (flowersType.equals("Gladiolus") && flowersCount < 80) {
            discount = 1.20;
        }
        return discount;
    }
}
