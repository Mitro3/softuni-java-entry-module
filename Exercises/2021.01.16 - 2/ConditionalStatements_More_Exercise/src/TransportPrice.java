import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distanceKm = Integer.parseInt(scanner.nextLine());
        String daytime = scanner.nextLine();

        double price = 0;
        double taxiPrice = 0;
        if (daytime.equals("day")) {
            taxiPrice = 0.79 ;
        } else if (daytime.equals("night")) {
            taxiPrice = 0.90;
        }
        if (distanceKm < 20) {
            price = 0.70 + taxiPrice * distanceKm;
        } else if (distanceKm < 100) {
            price = distanceKm * 0.09;
        } else {
            price = distanceKm * 0.06;
        }
        System.out.printf("%.2f", price);
    }
}
