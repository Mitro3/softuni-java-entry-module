import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        leftSum = i + j;
                        rightSum = k + l;

                        boolean isReminderZero = false;
                        if (n % leftSum == 0) {
                            isReminderZero = true;
                        }

                        if (leftSum == rightSum && isReminderZero) {
                            System.out.print(i);
                            System.out.print(j);
                            System.out.print(k);
                            System.out.print(l + " ");
                        }
                    }
                }
            }
        }

    }
}
