import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cointOneLev = Integer.parseInt(scanner.nextLine());
        int coinsTwoLeva = Integer.parseInt(scanner.nextLine());
        int banknotesFiveLeva = Integer.parseInt(scanner.nextLine());
        int amount = Integer.parseInt(scanner.nextLine());

        for (int oneLev = 0; oneLev <= cointOneLev; oneLev++) {
            for (int twoLeva = 0; twoLeva <= coinsTwoLeva; twoLeva++) {
                for (int fiveLeva = 0; fiveLeva <= banknotesFiveLeva; fiveLeva++) {
                    int sum = oneLev * 1 + twoLeva * 2 + fiveLeva * 5;

                    if (sum == amount) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", oneLev, twoLeva, fiveLeva, amount);
                    }

                }
            }
        }
    }
}
