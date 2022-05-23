import java.util.Scanner;

public class EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int clientsQuantity = Integer.parseInt(scanner.nextLine());

        double totalBill = 0;

        for (int i = 0; i < clientsQuantity; i++) {
            String decorationType = scanner.nextLine();
            double price = 0;
            double bill = 0;
            int salesCount = 0;
            while (!decorationType.equals("Finish")) {
                salesCount++;

                if (decorationType.equals("basket")) {
                    price = 1.50;
                } else if (decorationType.equals("wreath")) {
                    price = 3.80;
                } else if (decorationType.equals("chocolate bunny")) {
                    price = 7.00;
                }

                bill += price;

                decorationType = scanner.nextLine();
            }

            if (salesCount % 2 == 0) {
                bill *= 0.80;
            }
            totalBill += bill;

            System.out.printf("You purchased %d items for %.2f leva.%n", salesCount, bill);
        }


        double averageBill = totalBill / clientsQuantity;
        System.out.printf("Average bill per client is: %.2f leva.", averageBill);
    }
}
