import java.text.DecimalFormat;
import java.util.Scanner;

public class DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        DecimalFormat df = new DecimalFormat("0.00");

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number % 2 == 0) {
                p1++;
            }
            if (number % 3 == 0) {
                p2++;
            }
            if (number % 4 == 0) {
                p3++;
            }
        }

        double percentP1Numbers = 100.0 * p1 / n;
        double percentP2Numbers = 100.0 * p2 / n;
        double percentP3Numbers = 100.0 * p3 / n;

        System.out.println(df.format(percentP1Numbers) + "%");
        System.out.println(df.format(percentP2Numbers) + "%");
        System.out.println(df.format(percentP3Numbers) + "%");
    }
}
