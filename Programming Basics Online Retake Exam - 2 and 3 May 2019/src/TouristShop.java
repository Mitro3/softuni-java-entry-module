import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int productCount = 0;
        double productPriceTotal = 0;

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            double productPrice = Double.parseDouble(scanner.nextLine());
            productCount++;

            if (productCount % 3 == 0) {
                productPrice *= 0.5;
            }

            productPriceTotal += productPrice;

            if (productPriceTotal > budget) {
                break;
            }

            input = scanner.nextLine();

        }

        if (budget > productPriceTotal) {
            System.out.printf("You bought %d products for %.2f leva.", productCount, productPriceTotal);
        } else {
            System.out.println("You don't have enough money!");
            double diff = Math.abs(budget - productPriceTotal);
            System.out.printf("You need %.2f leva!", diff);
        }

    }
}
