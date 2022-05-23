import java.util.Scanner;

public class PCGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gamesSold = Integer.parseInt(scanner.nextLine());

        int gameHearthstoneCount = 0;
        int gameForniteCount = 0;
        int gameOverwatchCount = 0;
        int gameOthersCount = 0;
        for (int i = 0; i < gamesSold; i++) {
            String gameName = scanner.nextLine();

            switch (gameName) {
                case "Hearthstone":
                    gameHearthstoneCount++;
                    break;
                case "Fornite":
                    gameForniteCount++;
                    break;
                case "Overwatch":
                    gameOverwatchCount++;
                    break;
                default:
                    gameOthersCount++;
            }
        }

        double percentHearthstoneGame = 100.0 * gameHearthstoneCount / gamesSold;
        double percentForniteGame = 100.0 * gameForniteCount / gamesSold;
        double percentOverwatchGame = 100.0 * gameOverwatchCount / gamesSold;
        double percentOthersGame = 100.0 * gameOthersCount / gamesSold;

        System.out.printf("Hearthstone - %.2f%%%n", percentHearthstoneGame);
        System.out.printf("Fornite - %.2f%%%n", percentForniteGame);
        System.out.printf("Overwatch - %.2f%%%n", percentOverwatchGame);
        System.out.printf("Others - %.2f%%", percentOthersGame);

    }
}
