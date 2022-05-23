import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int squareMetersVineyard = Integer.parseInt(scanner.nextLine());
        double grapePerSquareMeter = Double.parseDouble(scanner.nextLine());
        int wineLitersNeeded = Integer.parseInt(scanner.nextLine());
        int workersCount = Integer.parseInt(scanner.nextLine());

        double squareMetersWineProd = squareMetersVineyard * 0.4;
        double wineLitersProd = grapePerSquareMeter * squareMetersWineProd / 2.5;
        double difference = Math.abs(wineLitersNeeded - wineLitersProd);
        if (wineLitersProd >= wineLitersNeeded) {
            double wineLitersPerWorker = difference / workersCount;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n", Math.floor(wineLitersProd));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(difference), Math.ceil(wineLitersPerWorker));
        } else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(difference));
        }
    }
}
