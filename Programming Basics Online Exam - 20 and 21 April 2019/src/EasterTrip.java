import java.util.Scanner;

public class EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        String dates = scanner.nextLine();
        int nightsCount = scanner.nextInt();

        double pricePerNight = 0;
        if (destination.equals("France")) {
            if (dates.equals("21-23")) {
                pricePerNight = 30;
            } else if (dates.equals("24-27")) {
                pricePerNight = 35;
            } else if (dates.equals("28-31")) {
                pricePerNight = 40;
            }
        } else if (destination.equals("Italy")) {
            if (dates.equals("21-23")) {
                pricePerNight = 28;
            } else if (dates.equals("24-27")) {
                pricePerNight = 32;
            } else if (dates.equals("28-31")) {
                pricePerNight = 39;
            }
        } else if (destination.equals("Germany")) {
            if (dates.equals("21-23")) {
                pricePerNight = 32;
            } else if (dates.equals("24-27")) {
                pricePerNight = 37;
            } else if (dates.equals("28-31")) {
                pricePerNight = 43;
            }
        }
        double totalPrice = pricePerNight * nightsCount;
        System.out.printf("Easter trip to %s : %.2f leva.", destination, totalPrice);
    }
}
