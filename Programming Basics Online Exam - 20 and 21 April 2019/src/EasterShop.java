import java.util.Scanner;

public class EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEggQuantity = Integer.parseInt(scanner.nextLine());

        String action = scanner.nextLine();
        int totalEggsLeft= initialEggQuantity;
        int eggsSold = 0;
        boolean isFinished = false;

        while (!action.equals("Close")) {
            int eggsCount = Integer.parseInt(scanner.nextLine());

            if (action.equals("Buy")) {
                if (eggsCount > totalEggsLeft) {
                    isFinished = true;
                    break;
                } else {
                    totalEggsLeft -= eggsCount;
                    eggsSold += eggsCount;
                }
            } else if (action.equals("Fill")) {
                totalEggsLeft += eggsCount;
            }

            action = scanner.nextLine();
        }

        if (isFinished) {
            System.out.println("Not enough eggs in store!");
            System.out.printf("You can buy only %d.", totalEggsLeft);
        } else {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", (eggsSold));
        }
    }
}
