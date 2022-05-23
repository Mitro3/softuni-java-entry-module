import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contractTerm = scanner.nextLine();
        String contactType = scanner.nextLine();
        String mobileInternet = scanner.nextLine();
        int monthsLeasing = scanner.nextInt();

        double monthlyTax = 0;
        if (contractTerm.equals("one")) {
            if (contactType.equals("Small")) {
                monthlyTax = 9.98;
            } else if (contactType.equals("Middle")) {
                monthlyTax = 18.99;
            } else if (contactType.equals("Large")) {
                monthlyTax = 25.98;
            } else if (contactType.equals("ExtraLarge")) {
                monthlyTax = 35.99;
            }
        } else if (contractTerm.equals("two")) {
            if (contactType.equals("Small")) {
                monthlyTax = 8.58;
            } else if (contactType.equals("Middle")) {
                monthlyTax = 17.09;
            } else if (contactType.equals("Large")) {
                monthlyTax = 23.59;
            } else if (contactType.equals("ExtraLarge")) {
                monthlyTax = 31.79;
            }
        }

        double price = (monthlyTax + getAddTaxMobileInternet(mobileInternet, monthlyTax)) * getTermDiscount(contractTerm);
        double totalPrice = price * monthsLeasing;
        System.out.printf("%.2f lv.", totalPrice);

    }

    static boolean getMobileInternetPresence (String mobileInternet) {
        if (mobileInternet.equals("yes")) {
            return true;
        } else {
            return false;
        }
    }

    static double getAddTaxMobileInternet (String mobileInternet, double monthlyTax) {
        double additionalTax = 0;
        if (getMobileInternetPresence(mobileInternet)) {
            if (monthlyTax <= 10) {
                additionalTax = 5.50;
            } else if (monthlyTax <= 30) {
                additionalTax = 4.35;
            } else {
                additionalTax = 3.85;
            }
        }
        return additionalTax;
    }

    static double getTermDiscount (String contractTerm) {
        if (contractTerm.equals("two")) {
            return 0.9625;
        } else {
            return 1;
        }
    }
}
