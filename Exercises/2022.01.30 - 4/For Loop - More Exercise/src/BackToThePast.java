import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inheritedMoney = scanner.nextDouble();
        int finalYear = scanner.nextInt();


        double spendMoneyYearly = 0;
        for (int year = 1800; year <= finalYear; year++) {
            if (year % 2 == 0) {
                spendMoneyYearly += 12000;
            } else {
                spendMoneyYearly += 12000 + 50 * (year - 1800 + 18);
            }
        }

        double diff = Math.abs(inheritedMoney - spendMoneyYearly);
        if (inheritedMoney >= spendMoneyYearly) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", diff);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", diff);
        }
    }
}
