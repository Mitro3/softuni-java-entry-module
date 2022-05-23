import java.util.Scanner;

public class TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double racketPrice = Double.parseDouble(scanner.nextLine());
        int racketsCount = Integer.parseInt(scanner.nextLine());
        int snickersCount = Integer.parseInt(scanner.nextLine());

        double snickersPrice = 1 / 6.00 * racketPrice;
        double totalPriceRacketSnickers = racketPrice * racketsCount + snickersPrice * snickersCount;
        double totalPrice = totalPriceRacketSnickers * 1.20;
        double sumToPayDjokovic = totalPrice / 8;
        double sumToPaySponsors = totalPrice * 7 / 8;
        System.out.printf("Price to be paid by Djokovic %.0f\n", Math.floor(sumToPayDjokovic));
        System.out.printf("Price to be paid by sponsors %.0f", Math.ceil(sumToPaySponsors));

    }
}
