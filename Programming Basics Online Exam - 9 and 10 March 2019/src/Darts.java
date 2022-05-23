import java.util.Scanner;

public class Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerName = scanner.nextLine();

        int startingPoints = 301;
        String input = scanner.nextLine();
        int shotsCount = 0;
        int unsuccessfulShotsCount = 0;
        boolean isWon = false;

        while (!input.equals("Retire")) {
            String field = input;
            int points = Integer.parseInt(scanner.nextLine());

            if (field.equals("Single")) {
                startingPoints -= points;
                if (startingPoints < 0) {
                    unsuccessfulShotsCount++;
                    startingPoints += points;
                } else {
                    shotsCount++;
                }
            } else if (field.equals("Double")) {
                startingPoints -= (points * 2);
                if (startingPoints < 0) {
                    unsuccessfulShotsCount++;
                    startingPoints += (points * 2);
                } else {
                    shotsCount++;
                }
            } else if (field.equals("Triple")) {
                startingPoints -= (points * 3);
                if (startingPoints < 0) {
                    unsuccessfulShotsCount++;
                    startingPoints += (points * 3);
                } else {
                    shotsCount++;
                }

            }

            if (startingPoints == 0) {
                isWon = true;
                break;
            }

            input = scanner.nextLine();

        }

        if (isWon) {
            System.out.printf("%s won the leg with %d shots.", playerName, shotsCount);
        } else {
            System.out.printf("%s retired after %d unsuccessful shots.", playerName, unsuccessfulShotsCount);
        }
    }
}
