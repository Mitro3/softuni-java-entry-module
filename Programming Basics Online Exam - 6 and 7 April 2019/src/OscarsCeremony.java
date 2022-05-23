import java.util.Scanner;

public class OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rentHall = Integer.parseInt(scanner.nextLine());

        double priceStatues = rentHall * 0.7;
        double priceCatering = priceStatues * 0.85;
        double priceSound = priceCatering / 2;
        double priceTot = rentHall + priceStatues + priceCatering + priceSound;
        System.out.printf("%.2f", priceTot);

    }
}
