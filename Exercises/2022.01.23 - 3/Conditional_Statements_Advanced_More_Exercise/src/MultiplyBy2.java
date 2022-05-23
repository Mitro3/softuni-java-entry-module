import java.util.Scanner;

public class MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double result = 0;
        while (result >= 0) {
            double num = Double.parseDouble(scanner.nextLine());
            result = num * 2;
            if (result < 0) {
                System.out.println("Negative number!");
            } else {
                System.out.printf("Result: %.2f\n", result);
            }
        }
    }
}
