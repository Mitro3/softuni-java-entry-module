import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenu = Integer.parseInt(scanner.nextLine());;
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegMenu = Integer.parseInt(scanner.nextLine());

//•	Пилешко меню –  10.35 лв.
//•	Меню с риба – 12.40 лв.
//•	Вегетарианско меню  – 8.15 лв.
        double chickenPrice = 10.35;
        double fishPrice = 12.40;
        double vegPrice = 8.15;

        double sum = chickenMenu * chickenPrice + fishMenu * fishPrice + vegMenu * vegPrice;
        double totalSum = sum * 1.2 + 2.50;
        System.out.println(totalSum);



    }
}
