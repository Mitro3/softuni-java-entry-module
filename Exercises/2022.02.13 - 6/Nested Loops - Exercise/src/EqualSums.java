import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        for (int i = firstNumber; i <= secondNumber; i++) {
            int currentNumber = i;

            int oddSum = 0;
            int evenSum = 0;

            for (int j = 6; j >= 1; j--) {
                int currentDigit = currentNumber % 10;

                if (j % 2 == 0) {
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }

                currentNumber = currentNumber / 10;
            }

            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }

        }
    }
}
