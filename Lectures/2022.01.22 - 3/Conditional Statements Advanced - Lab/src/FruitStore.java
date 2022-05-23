import java.util.Scanner;

public class FruitStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruitType = scanner.nextLine();
        String weekday = scanner.nextLine();
        double quantity = scanner.nextDouble();

        if (!isValidDay(weekday)) {
            System.out.println("error");
            return;
        }
        if (!isValidFruit(fruitType)) {
            System.out.println("error");
            return;
        }

        double price = getFruitPrice(weekday, fruitType);
        if (price != -1) {
            System.out.printf("%.2f", price * quantity);
        }
    }

    static boolean isValidDay(String weekday) {
        switch (weekday) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
            case "Sunday":
                return true;
            default:
                return false;
        }
    }

    static boolean isValidFruit(String fruitType) {
        switch (fruitType) {
            case "banana":
            case "apple":
            case "orange":
            case "grapefruit":
            case "kiwi":
            case "pineapple":
            case "grapes":
                return true;
            default:
                return false;
        }
    }


    static boolean isWeekend(String weekday) {
        if (weekday.equals("Saturday") || weekday.equals("Sunday")) {
            return true;
        } else {
            return false;
        }
    }

    static double getBananaPrice (String weekday) {
        if (!isWeekend(weekday)) {
            return 2.50;
        } else {
            return 2.70;
        }
    }

    static double getApplePrice (String weekday) {
        if (!isWeekend(weekday)) {
            return 1.20;
        } else {
            return 1.25;
        }
    }

    static double getOrangePrice (String weekday) {
        if (!isWeekend(weekday)) {
            return 0.85;
        } else {
            return 0.90;
        }
    }

    static double getGrapefruitPrice (String weekday) {
        if (!isWeekend(weekday)) {
            return 1.45;
        } else {
            return 1.60;
        }
    }

    static double getKiwiPrice (String weekday) {
        if (!isWeekend(weekday)) {
            return 2.70;
        } else {
            return 3.00;
        }
    }

    static double getPineapllePrice (String weekday) {
        if (!isWeekend(weekday)) {
            return 5.50;
        } else {
            return 5.60;
        }
    }

    static double getGrapesPrice (String weekday) {
        if (!isWeekend(weekday)) {
            return 3.85;
        } else {
            return 4.20;
        }
    }

    static double getFruitPrice (String weekday, String fruitType) {
        switch (fruitType) {
            case "banana":
            return getBananaPrice(weekday);
            case "apple":
            return getApplePrice(weekday);
            case "orange":
            return getOrangePrice(weekday);
            case "grapefruit":
            return getGrapefruitPrice(weekday);
            case "kiwi":
            return getKiwiPrice(weekday);
            case "pineapple":
            return getPineapllePrice(weekday);
            case "grapes":
            return getGrapesPrice(weekday);
            default:
            return -1;
        }
     }
}


