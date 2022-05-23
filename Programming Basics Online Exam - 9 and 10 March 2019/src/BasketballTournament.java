import java.util.Scanner;

public class BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tournamentName = scanner.nextLine();
        int gamesWon = 0;
        int gamesLost = 0;
        int gamesCount = 0;
        String gameResult = "";

        while (!tournamentName.equals("End of tournaments")) {

            int gamesNumber = Integer.parseInt(scanner.nextLine());

            for (int currentGame = 1; currentGame <= gamesNumber; currentGame++) {
                int teamDesiPoints = Integer.parseInt(scanner.nextLine());
                int teamOpponentPoints = Integer.parseInt(scanner.nextLine());

                if (teamDesiPoints > teamOpponentPoints) {
                    gamesWon++;
                    gameResult = "win";
                } else {
                    gamesLost++;
                    gameResult = "lost";
                }
                gamesCount++;
                int diff = Math.abs(teamDesiPoints - teamOpponentPoints);
                System.out.printf("Game %d of tournament %s: %s with %d points.%n", currentGame, tournamentName, gameResult, diff);

            }

            tournamentName = scanner.nextLine();
        }

        double percentWonGames = 100.0 * gamesWon / gamesCount;
        double percentLostGames = 100.0 * gamesLost / gamesCount;

        System.out.printf("%.2f%% matches win%n", percentWonGames);
        System.out.printf("%.2f%% matches lost", percentLostGames);

    }
}
