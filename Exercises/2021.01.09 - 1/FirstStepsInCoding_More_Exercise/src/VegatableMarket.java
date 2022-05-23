import java.util.Scanner;

public class VegatableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceVegPerKilo = Double.parseDouble(scanner.nextLine());
        double priceFrPerKilo = Double.parseDouble(scanner.nextLine());
        double vegKiloTot = Double.parseDouble(scanner.nextLine());
        double frKiloTot = Double.parseDouble(scanner.nextLine());

        double sum = (priceVegPerKilo * vegKiloTot + priceFrPerKilo * frKiloTot) / 1.94;
        System.out.printf("%.2f", sum);
    }
}
