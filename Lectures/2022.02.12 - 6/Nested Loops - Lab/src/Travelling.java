import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")) {
            double minBudget = Double.parseDouble(scanner.nextLine());
            double savedMoneyTotal = 0;

            while (savedMoneyTotal < minBudget) {
                double savedMoney = Double.parseDouble(scanner.nextLine());
                savedMoneyTotal += savedMoney;
            }

            System.out.println("Going to " + destination + "!");

            destination = scanner.nextLine();
        }
    }
}
