import java.text.DecimalFormat;
import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double totalSum = 0;
        while (!scanner.hasNext("NoMoreMoney")) {
            double input = Double.parseDouble(scanner.nextLine());
            if (input < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            totalSum += input;
            System.out.println("Increase: " + df.format(input));
        }

        System.out.println("Total: " + df.format(totalSum));
    }
}
