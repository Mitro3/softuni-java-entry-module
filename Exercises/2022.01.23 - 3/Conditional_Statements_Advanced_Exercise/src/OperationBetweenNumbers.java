import java.util.Scanner;

public class OperationBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1 = scanner.nextInt();
        int N2 = scanner.nextInt();
        scanner.nextLine();
        char operator = scanner.next().charAt(0);

        if (N2 == 0 && (operator == '/' || operator == '%')) {
            System.out.printf("Cannot divide %d by zero", N1);
            return;
        }
        double result = 0;
        String evenOrOdd;
        switch (operator) {
            case '+':
                result = N1 + N2;
                break;
            case '-':
                result = N1 - N2;
                break;
            case '*':
                result = N1 * N2;
                break;
            case '/':
                result = 1.00 * N1 / N2;
                break;
            case '%':
                result = N1 % N2;
        }
        if (operator == '+' || operator == '-' || operator == '*') {
            if (result % 2 ==0) {
                evenOrOdd = "even";
            } else {
                evenOrOdd = "odd";
            }
            System.out.printf("%d %c %d = %.0f - %s", N1, operator, N2, result, evenOrOdd);
        } else if (operator == '/') {
            System.out.printf("%d / %d = %.2f", N1, N2, result);
        } else if (operator == '%') {
            System.out.printf("%d %% %d = %.0f", N1, N2, result);
        }
    }
}
