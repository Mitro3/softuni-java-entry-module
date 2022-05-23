import java.util.Scanner;

public class VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hoursPerDay = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        for (int currentDay =  1; currentDay <= days; currentDay++) {
            double dayPrice = 0;
            double price = 0;

            for (int currentHour = 1; currentHour <= hoursPerDay; currentHour++) {

                if ((currentDay % 2 == 0) && (currentHour % 2 != 0)) {
                    price = 2.50;
                } else if ((currentDay % 2 != 0) && (currentHour % 2 == 0)) {
                    price = 1.25;
                } else {
                    price = 1.00;
                }
                dayPrice += price;

            }

            System.out.printf("Day: %d - %.2f leva%n", currentDay, dayPrice);
            totalPrice += dayPrice;
        }

        System.out.printf("Total: %.2f leva", totalPrice);

    }
}
