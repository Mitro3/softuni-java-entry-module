import java.text.DecimalFormat;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            sum += num;

        }

        double averageSum = sum * 1.0 / n;
        System.out.println(df.format(averageSum));
    }
}
