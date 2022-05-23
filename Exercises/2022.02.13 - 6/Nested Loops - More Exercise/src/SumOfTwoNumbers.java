import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startInterval = Integer.parseInt(scanner.nextLine());
        int endInterval = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int combinationCounter = 0;
        boolean isFound = false;
        int firstNumber = 0;
        int secondNumber = 0;

        for (int i = startInterval; i <= endInterval; i++) {
            for (int j = startInterval; j <= endInterval; j++) {
                sum = i + j;
                combinationCounter++;

                if (sum == magicNumber) {
                    isFound = true;
                    firstNumber = i;
                    secondNumber = j;
                    break;
                }
            }

            if (isFound) {
                System.out.printf("Combination N:%1$d (%2$d + %3$d = %4$d)", combinationCounter, firstNumber, secondNumber, magicNumber);
                break;
            }
        }

        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d", combinationCounter, magicNumber);
        }
    }
}
