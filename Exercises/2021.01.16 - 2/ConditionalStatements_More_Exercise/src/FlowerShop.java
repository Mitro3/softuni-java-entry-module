import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnoliasCount = Integer.parseInt(scanner.nextLine());
        int hyacinthsCount = Integer.parseInt(scanner.nextLine());
        int rosesCount = Integer.parseInt(scanner.nextLine());
        int cactusesCount = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double orderAmount = magnoliasCount * 3.25 + hyacinthsCount * 4.00 + rosesCount * 3.50 + cactusesCount * 8.00;
        double moneyEarned = orderAmount * 0.95;
        double difference = Math.abs(giftPrice - moneyEarned);
        if (giftPrice <= moneyEarned) {
            System.out.printf("She is left with %.0f leva.", Math.floor(difference));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(difference));
        }
    }
}
