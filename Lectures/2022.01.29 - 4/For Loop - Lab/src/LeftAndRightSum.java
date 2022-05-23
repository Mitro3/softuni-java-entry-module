import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            int leftNum = Integer.parseInt(scanner.nextLine());
            leftSum += leftNum;
        }
        int rightSum = 0;
        for (int i = 0; i < n; i++) {
            int rightNum = Integer.parseInt(scanner.nextLine());
            rightSum += rightNum;
        }
        int diff = Math.abs(leftSum - rightSum);
        if (leftSum == rightSum) {
            System.out.println("Yes, sum = " + leftSum);
        } else {
            System.out.println("No, diff = " + diff);
        }
    }
}
