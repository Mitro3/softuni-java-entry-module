import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournamentsCount = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());

        int tournamentsWon = 0;
        int pointsWon = 0;

        for (int i = 0; i < tournamentsCount; i++) {
            String stageReached = scanner.nextLine();

            if (stageReached.equals("W")) {
                tournamentsWon++;
                pointsWon += 2000;
            } else if (stageReached.equals("F")) {
                pointsWon += 1200;
            } else if (stageReached.equals("SF")) {
                pointsWon += 720;
            }
        }
        int totalPoints = initialPoints + pointsWon;
        int averagePointsWon = pointsWon / tournamentsCount;
        double percentWonTournaments = 100.0 * tournamentsWon / tournamentsCount;
        System.out.printf("Final points: %d%n", totalPoints);
        System.out.printf("Average points: %d%n", averagePointsWon);
        System.out.printf("%.2f%%", percentWonTournaments);
    }
}
