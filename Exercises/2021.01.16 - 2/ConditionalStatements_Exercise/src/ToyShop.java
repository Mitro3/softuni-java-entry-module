import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double holidayPrice = Double.parseDouble(scanner.nextLine());
        int puzzleQuantity = Integer.parseInt(scanner.nextLine());
        int dollsQuantity = Integer.parseInt(scanner.nextLine());
        int bearsQuantity = Integer.parseInt(scanner.nextLine());
        int minionsQuantity = Integer.parseInt(scanner.nextLine());
        int trucksQuantity = Integer.parseInt(scanner.nextLine());

        double puzzleProfit = puzzleQuantity * 2.60;
        double dollsProfit = dollsQuantity * 3.00;
        double bearsProtif = bearsQuantity * 4.10;
        double minionsProfit = minionsQuantity * 8.20;
        double trucksProfit = trucksQuantity * 2.00;
        double totalProfit = (puzzleProfit + dollsProfit + bearsProtif + minionsProfit + trucksProfit) * 0.9;
        int totalQuantity = puzzleQuantity + dollsQuantity + bearsQuantity + minionsQuantity +trucksQuantity;
        if (totalQuantity >= 50) {
            totalProfit = totalProfit * 0.75;
        }
        double difference = Math.abs(holidayPrice - totalProfit);
        if (holidayPrice > totalProfit) {
            System.out.printf("Not enough money! %.2f lv needed.", difference);
        } else {
            System.out.printf("Yes! %.2f lv left.", difference);
        }
    }
}
