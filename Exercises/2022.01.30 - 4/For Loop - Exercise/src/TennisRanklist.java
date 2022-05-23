import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournamentsCount = Integer.parseInt(scanner.nextLine());
        int ranklistPoints = Integer.parseInt(scanner.nextLine());

        int pointsWon = ranklistPoints;
        int wonTournamentsCount = 0;
        for (int i = 0; i < tournamentsCount; i++) {
            String tournamentPhase = scanner.nextLine();

            if (tournamentPhase.equals("W")) {
                pointsWon += 2000;
                wonTournamentsCount++;
            } else if (tournamentPhase.equals("F")) {
                pointsWon += 1200;
            } else if (tournamentPhase.equals("SF")) {
                pointsWon += 720;
            }
        }

        System.out.println("Final points: " + pointsWon);

        int averagePoints = (pointsWon - ranklistPoints) / tournamentsCount;
        System.out.println("Average points: " + averagePoints);

        double percentWonTournaments = 1.00 * wonTournamentsCount / tournamentsCount * 100;
        System.out.printf("%.2f%%", percentWonTournaments);
    }
}
