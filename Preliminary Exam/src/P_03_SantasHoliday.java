import java.util.Scanner;

public class P_03_SantasHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysStay = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String grade = scanner.nextLine();

        int nightsStay = daysStay - 1;

        double priceStay = nightsStay * getRoomPrice(roomType) * getDiscount(roomType, nightsStay) * getGradeDiscount(grade);
        System.out.printf("%.2f", priceStay);


    }

    private static double getRoomPrice(String roomType) {
        if (roomType.equals("room for one person")) {
            return 18;
        } else if (roomType.equals("apartment")) {
            return 25;
        } else if (roomType.equals("president apartment")) {
            return 35.00;
        } else {
            return -1;
        }
    }

    private static double getApartmentDiscount(int nightsStay) {
        if (nightsStay > 15) {
            return 0.50;
        } else if (nightsStay >= 10) {
            return 0.65;
        } else {
            return 0.70;
        }
    }

    private static double getPresidentApartmentDiscount(int nightsStay) {
        if (nightsStay > 15) {
            return 0.80;
        } else if (nightsStay >= 10) {
            return 0.85;
        } else {
            return 0.90;
        }
    }

    private static double getDiscount(String roomType, int nightsStay) {
        if (roomType.equals("apartment")) {
           return getApartmentDiscount(nightsStay);
        } else if (roomType.equals("president apartment")) {
            return getPresidentApartmentDiscount(nightsStay);
        } else {
            return 1.00;
        }
    }

    private static double getGradeDiscount(String grade) {
        if (grade.equals("positive")) {
            return 1.25;
        } else if (grade.equals("negative")) {
            return 0.90;
        } else {
            return -1;
        }
    }
}

