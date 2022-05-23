import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        if (oddSum == evenSum) {
            System.out.println("Yes");
            System.out.println("Sum = " + oddSum);
        } else {
            int diff = Math.abs(oddSum - evenSum);
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }
    }
}
