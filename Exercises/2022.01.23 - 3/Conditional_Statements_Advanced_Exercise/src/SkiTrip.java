import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysStayed = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String grade = scanner.nextLine();

        daysStayed --;
        double roomPrice = 0;
        switch (roomType) {
            case "room for one person":
                roomPrice = daysStayed * 18;
                break;
            case "apartment":
                roomPrice = daysStayed * 25 * getApartmentDiscount(daysStayed);
                break;
            case "president apartment":
                roomPrice = daysStayed * 35 * getPresidentApartmentDiscount(daysStayed);
        }
        if (grade.equals("positive")) {
            roomPrice += 0.25 * roomPrice;
        } else if (grade.equals("negative")) {
            roomPrice -= 0.1 * roomPrice;
        }
        System.out.printf("%.2f", roomPrice);
    }

    static double getApartmentDiscount (int dayStayed) {
        if (dayStayed < 10) {
            return 0.70;
        } else if (dayStayed <= 15) {
            return 0.65;
        } else {
            return 0.50;
        }
    }

    static double getPresidentApartmentDiscount (int dayStayed) {
        if (dayStayed < 10) {
            return 0.90;
        } else if (dayStayed <= 15) {
            return 0.85;
        } else {
            return 0.80;
        }
    }
}
