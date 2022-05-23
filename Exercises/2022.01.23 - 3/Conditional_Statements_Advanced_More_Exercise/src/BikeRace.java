import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juniorBikersCount = Integer.parseInt(scanner.nextLine());
        int seniorBikersCount = Integer.parseInt(scanner.nextLine());
        String traceType = scanner.nextLine();

        double discount = 1;
        if (traceType.equals("cross-country") && ((juniorBikersCount + seniorBikersCount) >= 50)) {
            discount = 0.75;
        }

        double juniorTax = 0;
        double seniorTax = 0;
        switch (traceType) {
            case "trail":
                juniorTax = 5.50;
                seniorTax = 7.00;
                break;
            case "cross-country":
                juniorTax = 8.00;
                seniorTax = 9.50;
                break;
            case "downhill":
                juniorTax = 12.25;
                seniorTax = 13.75;
                break;
            case "road":
                juniorTax = 20;
                seniorTax = 21.50;
                break;
        }
        double totalSum = (juniorBikersCount * juniorTax + seniorBikersCount * seniorTax) * discount * 0.95;
        System.out.printf("%.2f", totalSum);
    }
}
