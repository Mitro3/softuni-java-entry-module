import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sqMeters = Double.parseDouble(scanner.nextLine());
        double price = 7.61;
        double totPrice = price * sqMeters;
        double discount = 0.18 * totPrice;
        double finPrice = totPrice - discount;
        System.out.println("The final price is: " + finPrice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}
