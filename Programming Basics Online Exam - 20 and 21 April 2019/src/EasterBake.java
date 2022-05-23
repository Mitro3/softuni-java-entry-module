import java.util.Scanner;

public class EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cakesQuantity = Integer.parseInt(scanner.nextLine());

        int totalSugarQuantity = 0;
        int totalFlourQuantity = 0;
        int maxSugarQuantity = Integer.MIN_VALUE;
        int maxFlourQuantity = Integer.MIN_VALUE;

        for (int i = 0; i < cakesQuantity; i++) {
            int sugarQuantity = Integer.parseInt(scanner.nextLine());
            int flourQuantity = Integer.parseInt(scanner.nextLine());

            totalSugarQuantity += sugarQuantity;
            totalFlourQuantity += flourQuantity;

            if (sugarQuantity > maxSugarQuantity) {
                maxSugarQuantity = sugarQuantity;
            }
            if (flourQuantity > maxFlourQuantity) {
                maxFlourQuantity = flourQuantity;
            }
        }

        double sugarPacks = Math.ceil(totalSugarQuantity / 950.0);
        double flourPacks = Math.ceil(totalFlourQuantity / 750.0);

        System.out.printf("Sugar: %.0f%n", sugarPacks);
        System.out.printf("Flour: %.0f%n", flourPacks);
        System.out.printf("Max used flour is %1$d grams, max used sugar is %2$d grams.", maxFlourQuantity, maxSugarQuantity);
    }
}
