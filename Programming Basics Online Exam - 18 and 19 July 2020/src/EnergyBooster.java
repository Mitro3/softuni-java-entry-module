import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruitTaste = scanner.nextLine();
        String packSize = scanner.nextLine();
        int orderedSetsCount = scanner.nextInt();


        double priceWithoutDiscount = 0;
        if (packSize.equals("small")) {
            priceWithoutDiscount = 2 * getPriceForSmallSet(fruitTaste) * orderedSetsCount;
        } else if (packSize.equals("big")) {
            priceWithoutDiscount = 5 * getPriceForBigSet(fruitTaste) * orderedSetsCount;
        }
        double totalPrice = priceWithoutDiscount * getDiscountFactor(priceWithoutDiscount);
        System.out.printf("%.2f lv.", totalPrice);
    }

    static double getDiscountFactor (double priceWithoutDiscount) {
        double discount = 1;
        if (priceWithoutDiscount >= 400 && priceWithoutDiscount <= 1000) {
            discount = 0.85;
        } else if (priceWithoutDiscount > 1000) {
            discount = 0.50;
        }
        return discount;
    }

    static double getPriceForSmallSet (String fruitTaste) {
        switch (fruitTaste) {
            case "Watermelon":
                return 56;
            case "Mango":
                return 36.66;
            case "Pineapple":
                return 42.10;
            case "Raspberry":
                return 20;
            default:
                return 0;
        }
    }

    static double getPriceForBigSet (String fruitType) {
        switch (fruitType) {
            case "Watermelon":
                return 28.70;
            case "Mango":
                return 19.60;
            case "Pineapple":
                return 24.80;
            case "Raspberry":
                return 15.20;
            default:
                return 0;
        }
    }
}
