import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tax = Integer.parseInt(scanner.nextLine());
//•	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
//•	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
//•	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
//•	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка
        double snickersPrice = 0.6 * tax;
        double jerseyPrice = snickersPrice * 0.8;
        double ballPrice = 0.25 * jerseyPrice;
        double accPrice = 0.20 * ballPrice;
        double sum = tax + snickersPrice + jerseyPrice + ballPrice + accPrice;
        System.out.println(sum);


    }
}
