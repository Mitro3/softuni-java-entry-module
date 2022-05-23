import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyRequiredForVacation = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());

        int daysSpendingCount = 0;
        int totalDays = 0;
        boolean isFailed = false;
        double totalSum = currentMoney;
        while (totalSum < moneyRequiredForVacation) {
            String action = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());

            if (action.equals("spend")) {
                totalSum -= amount;
                if (totalSum < 0) {
                    totalSum = 0;
                }
                daysSpendingCount++;
            } else if (action.equals("save")) {
                totalSum += amount;
                daysSpendingCount = 0;
            }

            totalDays++;

            if (daysSpendingCount == 5) {
                isFailed = true;
                break;
            }

        }

        if (isFailed) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", totalDays);
        } else {
            System.out.printf("You saved the money for %d days.", totalDays);
        }
    }
}
