import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylonQuantity = Integer.parseInt(scanner.nextLine());
        int paintQuantity = Integer.parseInt(scanner.nextLine());
        int razrQuantity = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
//•	Предпазен найлон - 1.50 лв. за кв. метър
//•	Боя - 14.50 лв. за литър
//•	Разредител за боя - 5.00 лв. за литър
        double nylonPrice = 1.50;
        double paintPrice = 14.50;
        double razrPrice = 5.00;
        double nylonSum = (nylonQuantity + 2) * nylonPrice;
        double paintSum = (paintQuantity * 1.10) * paintPrice;
        double razrSum = razrQuantity * razrPrice;
        double totalSum = nylonSum + paintSum + razrSum + 0.40;
        double hoursPrice = totalSum * 0.3;
        double totalPrice = totalSum + hoursPrice * hours;
        System.out.println(totalPrice);

    }
}
