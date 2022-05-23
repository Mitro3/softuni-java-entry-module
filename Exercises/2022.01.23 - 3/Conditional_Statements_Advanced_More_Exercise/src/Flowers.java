import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chrysanthemumsCount = Integer.parseInt(scanner.nextLine());
        int rosesCount = Integer.parseInt(scanner.nextLine());
        int tulipsCount = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String isHoliday = scanner.nextLine();

        double chrysanthemumsPrice = 0;
        double rosesPrice = 0;
        double tulipsPrice = 0;
        if (season.equals("Spring") || season.equals("Summer")) {
            chrysanthemumsPrice = 2.00;
            rosesPrice = 4.10;
            tulipsPrice = 2.50;
        } else if (season.equals("Autumn") || season.equals("Winter")) {
            chrysanthemumsPrice = 3.75;
            rosesPrice = 4.50;
            tulipsPrice = 4.15;
        }
        double totalSum = (chrysanthemumsCount * chrysanthemumsPrice + rosesCount * rosesPrice  + tulipsCount * tulipsPrice);
        double totalDiscountedSum = totalSum * getDiscountFactor(chrysanthemumsCount, rosesCount, tulipsCount, season) * isHolidayPrice(isHoliday) + 2;
        System.out.printf("%.2f", totalDiscountedSum);

    }

    static double getDiscountFactor (int chrysanthemumsCount, int rosesCount, int tulipsCount, String season) {
        double discount = 1;
        if (tulipsCount > 7 && season.equals("Spring")) {
            discount = 0.95;
        }
        if (rosesCount >= 10 && season.equals("Winter")) {
            discount *= 0.90;
        }
        if ((chrysanthemumsCount + rosesCount + tulipsCount) > 20) {
            discount *= 0.80;
        }
        return discount;
    }

    static double isHolidayPrice (String isHoliday) {
        if (isHoliday.equals("Y")) {
            return 1.15;
        } else {
            return 1.00;
        }
    }
}
