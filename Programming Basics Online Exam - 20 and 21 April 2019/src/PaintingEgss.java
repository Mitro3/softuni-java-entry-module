import java.util.Scanner;

public class PaintingEgss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String eggSize = scanner.nextLine();
        String eggColor = scanner.nextLine();
        int batchCount = scanner.nextInt();

        double price = 0;
        switch (eggColor) {
            case "Red":
            switch (eggSize) {
                case "Large":
                    price = 16;
                    break;
                case "Medium":
                    price = 13;
                    break;
                case "Small":
                    price = 9;
            }
            break;
            case "Green":
                switch (eggSize) {
                    case "Large":
                        price = 12;
                        break;
                    case "Medium":
                        price = 9;
                        break;
                    case "Small":
                        price = 8;
                }
                break;
            case "Yellow":
                switch (eggSize) {
                    case "Large":
                        price = 9;
                        break;
                    case "Medium":
                        price = 7;
                        break;
                    case "Small":
                        price = 5;
                }
        }
        double totalPrice = price * batchCount * 0.65;
        System.out.printf("%.2f leva.", totalPrice);
    }
}
