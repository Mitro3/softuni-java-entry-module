import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int combinationCount = 0;

        for (int i = startNumber; i <= endNumber; i++) {
            for (int j = startNumber; j <= endNumber; j++) {

                combinationCount++;
                int result = i + j;

                if (result == magicNumber) {
                    System.out.printf("Combination N:%1$d (%2$d + %3$d = %4$d) ", combinationCount, i, j, magicNumber);
                    return;
                }
            }
        }

        System.out.printf("%1$d combinations - neither equals %2$d", combinationCount, magicNumber);

    }
}
