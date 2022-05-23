import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double change = Double.parseDouble(scanner.nextLine());
        double coinsChange = Math.round(change * 100);

        int coinCount = 0;

        while (coinsChange > 0) {
            if (coinsChange >= 200) {
                coinsChange -= 200;
                coinCount++;
            } else if (coinsChange >= 100) {
                coinsChange -= 100;
                coinCount++;
            } else if (coinsChange >= 50) {
                coinsChange -= 50;
                coinCount++;
            } else if (coinsChange >= 20) {
                coinsChange -= 20;
                coinCount++;
            } else if (coinsChange >= 10) {
                coinsChange -= 10;
                coinCount++;
            } else if (coinsChange >= 5) {
                coinsChange -= 5;
                coinCount++;
            } else if (coinsChange >= 2) {
                coinsChange -= 2;
                coinCount++;
            } else if (coinsChange >= 1) {
                coinsChange -= 1;
                coinCount++;
            }

        }

        System.out.println(coinCount);
    }
}
