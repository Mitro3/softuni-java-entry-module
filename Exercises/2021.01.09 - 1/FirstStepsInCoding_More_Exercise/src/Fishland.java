import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceSkum = Double.parseDouble(scanner.nextLine());
        double priceCaca = Double.parseDouble(scanner.nextLine());
        double palamudKilo = Double.parseDouble(scanner.nextLine());
        double safridKilo = Double.parseDouble(scanner.nextLine());
        double midiKilo = Double.parseDouble(scanner.nextLine());

        double palamudPrice = 1.6 * priceSkum;
        double safridPrice = 1.8 * priceCaca;
        double midiPrice = 7.50;
        double sum = palamudPrice * palamudKilo + safridPrice * safridKilo + midiPrice * midiKilo;

        System.out.printf("%.2f", sum);
    }
}
