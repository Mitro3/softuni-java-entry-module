import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dogs = Double.parseDouble(scanner.nextLine());
        double dprice = 2.50;
        double cats = Double.parseDouble(scanner.nextLine());
        double cprice = 4.0;
        double total = dogs * dprice + cats * cprice;
        System.out.println(total + " lv.");


    }
}
