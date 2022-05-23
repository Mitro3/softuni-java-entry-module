import java.util.Scanner;

public class EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int breadCount = Integer.parseInt(scanner.nextLine());
        int eggsCount = Integer.parseInt(scanner.nextLine());
        int cookiesKg = Integer.parseInt(scanner.nextLine());

        double breadSum = breadCount * 3.2;
        double eggsSum = eggsCount * 4.35;
        double cookiesSum = cookiesKg * 5.40;
        double eggsPaintSum = 12 * eggsCount * 0.15;
        double priceTotal = breadSum + eggsSum + cookiesSum + eggsPaintSum;
        System.out.printf("%.2f", priceTotal);
    }
}
