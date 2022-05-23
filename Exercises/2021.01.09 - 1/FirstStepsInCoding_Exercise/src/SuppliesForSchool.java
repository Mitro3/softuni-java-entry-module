import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens =Integer.parseInt(scanner.nextLine());
        int markers =Integer.parseInt(scanner.nextLine());
        int prep =Integer.parseInt(scanner.nextLine());
        int percent =Integer.parseInt(scanner.nextLine());

        double pricePens = 5.80;
        double priceMarkers = 7.20;
        double pricePrep = 1.20;

        double sum = pens * pricePens + markers * priceMarkers + prep * pricePrep;
        double totPrice = sum - (sum * percent / 100);
        System.out.println(totPrice);



    }
}
