import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int months = Integer.parseInt(scanner.nextLine());

        int waterBill = 20;
        int internetBill = 15;
        double billOthers = 0;
        double electricityBillTotal = 0;
        for (int i = 0; i < months; i++) {
            double electricityBill = Double.parseDouble(scanner.nextLine());

            billOthers += (electricityBill + waterBill + internetBill) * 1.20;
            electricityBillTotal += electricityBill;

        }
        double billTotal = (waterBill + internetBill) * months + billOthers + electricityBillTotal;
        double averageMonthlyBill = billTotal / months;
        double waterBillTotal = waterBill * months;
        double internetBillTotal = internetBill * months;

        System.out.printf("Electricity: %.2f lv\n", electricityBillTotal);
        System.out.printf("Water: %.2f lv\n", waterBillTotal);
        System.out.printf("Internet: %.2f lv\n", internetBillTotal);
        System.out.printf("Other: %.2f lv\n", billOthers);
        System.out.printf("Average: %.2f lv", averageMonthlyBill);
    }
}
