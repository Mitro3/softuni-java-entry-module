import java.util.Scanner;

public class CareOfPuppies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int boughtFood = Integer.parseInt(scanner.nextLine());

        int boughtFoodGrams = boughtFood * 1000;
        int eatenFoodTotal = 0;
        while (!scanner.hasNext("Adopted")) {
            int eatenFood = Integer.parseInt(scanner.nextLine());
            eatenFoodTotal += eatenFood;
        }

        int diff = Math.abs(boughtFoodGrams - eatenFoodTotal);
        if (boughtFoodGrams >= eatenFoodTotal) {
            System.out.printf("Food is enough! Leftovers: %d grams.", diff);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", diff);
        }
    }
}
