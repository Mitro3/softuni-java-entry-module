import java.util.Scanner;

public class P_02_MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceMaidenParty = Double.parseDouble(scanner.nextLine());;
        int loveMessagesCount = Integer.parseInt(scanner.nextLine());
        int waxRosesCount = Integer.parseInt(scanner.nextLine());
        int keyRingsCount = Integer.parseInt(scanner.nextLine());
        int cartoonsCount = Integer.parseInt(scanner.nextLine());
        int luckySupricesCount = Integer.parseInt(scanner.nextLine());

        double sum = loveMessagesCount * 0.60 + waxRosesCount * 7.20 + keyRingsCount * 3.60 + cartoonsCount * 18.20 + luckySupricesCount * 22;
        int totalItems = loveMessagesCount + waxRosesCount + keyRingsCount + cartoonsCount + luckySupricesCount;

        double finalSum = sum * getDiscountFactor(totalItems) * 0.9;

        double diff = Math.abs(finalSum - priceMaidenParty);
        if (finalSum >= priceMaidenParty) {
            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }

    }

    static double getDiscountFactor (int totalItems) {
        if (totalItems >= 25) {
            return 0.65;
        } else {
            return 1.00;
        }
    }
}
