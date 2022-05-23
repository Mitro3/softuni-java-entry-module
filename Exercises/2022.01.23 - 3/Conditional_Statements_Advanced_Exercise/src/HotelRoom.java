import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int daysCount = scanner.nextInt();

        double studioPrice = 0;
        double appartmentPrice = 0;
        switch (month) {
            case "May":
            case "October":
                studioPrice = 50;
                appartmentPrice = 65;
                break;
            case "June":
            case "September":
                studioPrice = 75.20;
                appartmentPrice = 68.70;
                break;
            case "July":
            case "August":
                studioPrice = 76;
                appartmentPrice = 77;
        }
        double studioTotalPrice = studioPrice * getStudioDiscount(month, daysCount) * daysCount;
        double appartmentTotalPrice = appartmentPrice * getAppartmentDiscount(daysCount) * daysCount;
        System.out.printf("Apartment: %.2f lv.%n", appartmentTotalPrice);
        System.out.printf("Studio: %.2f lv.", studioTotalPrice);
    }

    static double getStudioDiscount(String month, double daysCount) {
        switch (month) {
            case "May":
            case "October":
                if (daysCount > 7 && daysCount <= 14) {
                    return 0.95;
                } else if (daysCount >= 14) {
                    return 0.70;
                }
            case "June":
            case "September":
                if (daysCount > 14) {
                    return 0.80;
                }
            default:
                return 1;
        }
    }

    static double getAppartmentDiscount(double daysCount) {
        if (daysCount > 14) {
            return 0.90;
        } else {
            return 1;
        }
    }
}
