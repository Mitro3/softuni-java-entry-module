import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double strawbPrice = Double.parseDouble(scanner.nextLine());
        double bananasQuantity = Double.parseDouble(scanner.nextLine());
        double orangesQuantity = Double.parseDouble(scanner.nextLine());
        double rasbQuantity = Double.parseDouble(scanner.nextLine());
        double strawbQuantity = Double.parseDouble(scanner.nextLine());

        double rasbPrice = strawbPrice * 0.5;
        double orangesPrice = rasbPrice * 0.6;
        double bananasPrice = rasbPrice * 0.2;
        double strawbBill = strawbPrice * strawbQuantity;
        double bananasBill = bananasPrice * bananasQuantity;
        double orangeBill = orangesPrice * orangesQuantity;
        double rasbBill = rasbPrice * rasbQuantity;
        double totalPrice = strawbBill + bananasBill + orangeBill + rasbBill;
        System.out.printf("%.2f",totalPrice);
    }
}
