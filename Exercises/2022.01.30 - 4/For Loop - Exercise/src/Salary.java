import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabsOpenedCount = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());

        int fine = 0;
        for (int i = 0; i < tabsOpenedCount; i++) {
                String tabName = scanner.nextLine();
                switch (tabName) {
                    case "Facebook":
                        fine += 150;
                        break;
                    case "Instagram":
                        fine += 100;
                        break;
                    case "Reddit":
                        fine += 50;
                        break;
                    default:
                        fine += 0;
            }
        }
            double salaryLeft = salary - fine;
        if (salaryLeft <= 0) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.printf("%.0f", salaryLeft);
        }
    }
}
