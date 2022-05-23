import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String classType = null;
        String carType = null;
        double carPrice = 0;
        if (budget <= 100) {
            classType = "Economy class";
            if (season.equals("Summer")) {
                carType = "Cabrio";
                carPrice = 0.35 * budget;
            } else if (season.equals("Winter")) {
                carType = "Jeep";
                carPrice = 0.65 * budget;
            }
        } else if (budget <= 500) {
            classType = "Compact class";
            if (season.equals("Summer")) {
                carType = "Cabrio";
                carPrice = 0.45 * budget;
            } else if (season.equals("Winter")) {
                carType = "Jeep";
                carPrice = 0.80 * budget;
            }
        } else {
            classType = "Luxury class";
            carType = "Jeep";
            carPrice = 0.90 * budget;
        }

        System.out.println(classType);
        System.out.printf("%s - %.2f", carType, carPrice);
    }
}
