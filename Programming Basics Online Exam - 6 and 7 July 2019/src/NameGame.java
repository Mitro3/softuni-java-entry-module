import java.util.Scanner;

public class NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerName = scanner.nextLine();
        int playerPoints = 0;
        int maxPoints = Integer.MIN_VALUE;
        String winnerName = "";

        while (!playerName.equals("Stop")) {

            for (int i = 0; i < playerName.length(); i++) {
                int currentNumber = Integer.parseInt(scanner.nextLine());
                char currentLetter = playerName.charAt(i);

                if (currentNumber == currentLetter) {
                    playerPoints += 10;
                } else {
                    playerPoints += 2;
                }
            }
            if (playerPoints >= maxPoints) {
                maxPoints = playerPoints;
                winnerName = playerName;
            }

            playerPoints = 0;
            playerName = scanner.nextLine();

        }

        System.out.printf("The winner is %s with %d points!", winnerName, maxPoints);
    }
}
