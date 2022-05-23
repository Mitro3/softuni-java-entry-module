import java.util.Scanner;

public class FootballResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstGameResult = scanner.nextLine();
        String secondGameResult = scanner.nextLine();
        String thirdGameResult = scanner.nextLine();


        int firstGameHost = firstGameResult.charAt(0);
        int firstGameAway = firstGameResult.charAt(2);

        int secondGameHost = secondGameResult.charAt(0);
        int secondGameAway = secondGameResult.charAt(2);

        int thirdGameHost = thirdGameResult.charAt(0);
        int thirdGameAway = thirdGameResult.charAt(2);

        int wonsCount = 0;
        int lostCount = 0;
        int drawCount = 0;

        if (firstGameHost > firstGameAway) {
            wonsCount++;
        } else if (firstGameHost < firstGameAway) {
            lostCount++;
        } else {
            drawCount++;
        }

        if (secondGameHost > secondGameAway) {
            wonsCount++;
        } else if (secondGameHost < secondGameAway) {
            lostCount++;
        } else {
            drawCount++;
        }

        if (thirdGameHost > thirdGameAway) {
            wonsCount++;
        } else if (thirdGameHost < thirdGameAway) {
            lostCount++;
        } else {
            drawCount++;
        }

        System.out.printf("Team won %d games.%n", wonsCount);
        System.out.printf("Team lost %d games.%n", lostCount);
        System.out.printf("Drawn games: %d", drawCount);


    }
}
