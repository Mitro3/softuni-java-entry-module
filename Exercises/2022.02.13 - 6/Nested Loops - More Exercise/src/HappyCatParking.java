import java.util.Scanner;

public class HappyCatParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysCount = Integer.parseInt(scanner.nextLine());
        int hoursCount = Integer.parseInt(scanner.nextLine());

        double dayPrice = 0;
        double totalSum = 0;

        for (int days = 1; days <= daysCount; days++) {
            for (int hours = 1; hours <= hoursCount; hours++) {

                double price = 0;
                if ((days % 2 == 0) && (hours % 2 != 0)) {
                    price = 2.50;
                } else if ((days % 2 != 0) && (hours % 2 == 0)) {
                    price = 1.25;
                } else {
                    price = 1.00;
                }

                dayPrice += price;
            }
            totalSum += dayPrice;
            System.out.printf("Day: %d - %.2f leva%n", days, dayPrice);
            dayPrice = 0;
        }

        System.out.printf("Total: %.2f leva", totalSum);
    }
}
