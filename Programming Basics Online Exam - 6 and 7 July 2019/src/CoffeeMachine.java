import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String drinkType = scanner.nextLine();
        String sugar = scanner.nextLine();
        int drinksCount = scanner.nextInt();

        double drinkPrice = 0;
        if (drinkType.equals("Espresso")) {
            switch (sugar) {
                case "Without":
                    drinkPrice = 0.90;
                    break;
                case "Normal":
                    drinkPrice = 1.00;
                    break;
                case "Extra":
                    drinkPrice = 1.20;
                    break;
            }
        } else if (drinkType.equals("Cappuccino")) {
            switch (sugar) {
                case "Without":
                    drinkPrice = 1.00;
                    break;
                case "Normal":
                    drinkPrice = 1.20;
                    break;
                case "Extra":
                    drinkPrice = 1.60;
                    break;
            }
        } else if (drinkType.equals("Tea")) {
            switch (sugar) {
                case "Without":
                    drinkPrice = 0.50;
                    break;
                case "Normal":
                    drinkPrice = 0.60;
                    break;
                case "Extra":
                    drinkPrice = 0.70;
                    break;
            }
        }
        if (getSugarDiscount(sugar)) {
            drinkPrice = drinkPrice * 0.65;
        }
        double totalSum = drinkPrice * drinksCount * getEspressoDiscount(drinkType, drinksCount);
        double totalDiscountedSum = totalSum * getSumDiscount(totalSum);
        System.out.printf("You bought %d cups of %s for %.2f lv.", drinksCount, drinkType, totalDiscountedSum);
    }

    static boolean getSugarDiscount (String sugar) {
        if (sugar.equals("Without")) {
            return true;
        } else {
            return false;
        }
    }

    static double getEspressoDiscount (String drinkType, int drinksCount) {
        if (drinkType.equals("Espresso") && drinksCount >= 5) {
            return 0.75;
        } else {
            return 1;
        }
    }

    static double getSumDiscount (double totalSum) {
        if (totalSum > 15) {
            return 0.80;
        } else {
            return 1;
        }
    }
}
