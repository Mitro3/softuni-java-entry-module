import java.util.Scanner;

public class AluminiumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int joineriesCount = scanner.nextInt();
        scanner.nextLine();
        String joinerySize = scanner.nextLine();
        String acquireMethod  = scanner.nextLine();

        if (!isValidOrder(joineriesCount)) {
            System.out.println("Invalid order");
            return;
        }

        double priceWithoutDiscount = getSizePrice(joinerySize) * joineriesCount;
        double firstDiscount = priceWithoutDiscount * getDiscount(joinerySize, joineriesCount) / 100;
        if (acquireMethod.equals("With delivery")) {
            double totalPrice = (priceWithoutDiscount - firstDiscount + 60) * (1 - getExtraDiscount(joineriesCount) / 100);
            System.out.printf("%.2f BGN", totalPrice);
        } else if (acquireMethod.equals("Without delivery")) {
            double totalPrice = (priceWithoutDiscount - firstDiscount) * (1 - getExtraDiscount(joineriesCount) / 100);
            System.out.printf("%.2f BGN", totalPrice);
        }

    }

    static boolean isValidOrder (int joineriesCount) {
        if (joineriesCount >= 10) {
            return true;
        } else {
            return false;
        }
    }

    static double getExtraDiscount (int joineriesCount) {
        if (joineriesCount > 99) {
            return 4;
        } else {
            return 0;
        }
    }

    static double getSizePrice (String joinerySize) {
        switch (joinerySize) {
            case "90X130":
                return 110;
            case "100X150":
                return 140;
            case "130X180":
                return 190;
            case "200X300":
                return 250;
            default:
                return -1;
        }
    }

    static double getDiscount (String joinerySize, double joineriesCount) {
        double percentDiscount = 0;
        switch (joinerySize) {
            case "90X130":
                if (joineriesCount > 30 && joineriesCount <= 60)  {
                    percentDiscount = 5;
                } else if (joineriesCount > 60) {
                    percentDiscount = 8;
                }
                break;

            case "100X150":
                if (joineriesCount > 40 && joineriesCount <= 80)  {
                    percentDiscount = 6;
                } else if (joineriesCount > 80) {
                    percentDiscount = 10;
                }
                break;

            case "130X180":
                if (joineriesCount > 20 && joineriesCount <= 50)  {
                    percentDiscount = 7;
                } else if (joineriesCount > 50) {
                    percentDiscount = 12;
                }
                break;

            case "200X300":
                if (joineriesCount > 25 && joineriesCount <= 50)  {
                    percentDiscount = 9;
                } else if (joineriesCount > 50) {
                    percentDiscount = 14;
                }
                break;
            default:
                return 0;
        }
        return percentDiscount;
    }
}
