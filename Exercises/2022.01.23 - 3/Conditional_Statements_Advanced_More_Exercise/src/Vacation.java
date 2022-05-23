import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String accomondationType = null;
        String accomondationPlace = null;
        double price = 0;
        if (budget <= 1000) {
            accomondationType = "Camp";
            if (season.equals("Summer")) {
                price = 0.65 * budget;
                accomondationPlace = "Alaska";
            } else if (season.equals("Winter")) {
                price = 0.45 * budget;
                accomondationPlace = "Morocco";
            }
        } else if (budget <= 3000) {
            accomondationType = "Hut";
            if (season.equals("Summer")) {
                price = 0.80 * budget;
                accomondationPlace = "Alaska";
            } else if (season.equals("Winter")) {
                price = 0.60 * budget;
                accomondationPlace = "Morocco";
            }
        } else {
            accomondationType = "Hotel";
            price = 0.9 * budget;
            if (season.equals("Summer")) {
                accomondationPlace = "Alaska";
            } else if (season.equals("Winter")) {
                accomondationPlace = "Morocco";
            }
        }
        System.out.printf("%s - %s - %.2f", accomondationPlace, accomondationType, price );
    }
}
