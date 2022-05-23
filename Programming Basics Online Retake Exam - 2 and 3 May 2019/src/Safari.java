import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double neededFuel = Double.parseDouble(scanner.nextLine());
        String weekday = scanner.nextLine().toLowerCase();

        double fuelPrice = neededFuel * 2.1;
        double totalPrice = (fuelPrice + 100) * getWeekdayFactor(weekday);
        double balance = Math.abs(budget - totalPrice);
        if (budget >= totalPrice) {
            System.out.printf("Safari time! Money left: %.2f lv.", balance);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", balance);
        }
    }

    static double getWeekdayFactor (String weekday) {
        if (weekday.equals("saturday")) {
            return 0.90;
        } else if (weekday.equals("sunday")){
            return 0.8;
        } else {
            return 1;
        }
    }
}