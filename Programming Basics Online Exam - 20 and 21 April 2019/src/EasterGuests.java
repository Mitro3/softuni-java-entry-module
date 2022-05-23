import java.util.Scanner;

public class EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guestCount = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double cakesNeeded = Math.ceil(guestCount / 3.0);
        double egssNeeded = guestCount * 2;
        double cakesPrice = cakesNeeded * 4;
        double egssPrice = egssNeeded * 0.45;
        double totalPrice = cakesPrice + egssPrice;
        double difference = Math.abs(totalPrice - budget);
        if (totalPrice <= budget) {
            System.out.printf("Lyubo bought %.0f Easter bread and %.0f eggs.\nHe has %.2f lv. left.", cakesNeeded, egssNeeded, difference);
        } else {
            System.out.printf("Lyubo doesn't have enough money.\nHe needs %.2f lv. more.", difference);
        }
    }
}
