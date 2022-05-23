import java.util.Scanner;

public class FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String teamName = scanner.nextLine();
        int gamesNumber = Integer.parseInt(scanner.nextLine());

        int pointsWon = 0;
        int gamesWon = 0;
        int gamesDraw = 0;
        int gamesLost = 0;

        for (int i = 0; i < gamesNumber; i++) {
            String gameResult = scanner.nextLine();

            switch (gameResult) {
                case "W":
                    gamesWon++;
                    pointsWon += 3;
                    break;
                case "D":
                    gamesDraw++;
                    pointsWon += 1;
                    break;
                case "L":
                    gamesLost++;
                    pointsWon += 0;
                    break;
                default:
                    pointsWon += 0;

            }
        }

        if (gamesNumber == 0) {
            System.out.println(teamName + " hasn't played any games during this season.");
        } else {
            double percentWonGames = 100.0 * gamesWon / gamesNumber;
            System.out.printf("%s has won %d points during this season.%n", teamName, pointsWon);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n", gamesWon);
            System.out.printf("## D: %d%n", gamesDraw);
            System.out.printf("## L: %d%n", gamesLost);
            System.out.printf("Win rate: %.2f%%", percentWonGames);
        }
    }
}
