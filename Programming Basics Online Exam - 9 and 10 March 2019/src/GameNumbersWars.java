import java.util.Scanner;

public class GameNumbersWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstPlayerName = scanner.nextLine();
        String secondPlayerName = scanner.nextLine();

        String input = scanner.nextLine();
        int firstPlayerPoints = 0;
        int secondPlayerPoints = 0;
        boolean isNumberWars = false;
        String winner = "";

        while (!input.equals("End of game")) {
            int firstPlayerCard = Integer.parseInt(input);
            int secondPlayerCard = Integer.parseInt(scanner.nextLine());

            int pointsWon = Math.abs(firstPlayerCard - secondPlayerCard);

            if (firstPlayerCard > secondPlayerCard) {
                firstPlayerPoints += pointsWon;
            } else if (firstPlayerCard < secondPlayerCard) {
                secondPlayerPoints += pointsWon;
            } else {
                firstPlayerCard = Integer.parseInt(scanner.nextLine());
                secondPlayerCard = Integer.parseInt(scanner.nextLine());
                isNumberWars = true;

                if (firstPlayerCard > secondPlayerCard) {
                    firstPlayerPoints += pointsWon;
                    winner = firstPlayerName;
                } else if (firstPlayerCard < secondPlayerCard) {
                    secondPlayerPoints += pointsWon;
                    winner = secondPlayerName;
                }
                break;
            }

            input = scanner.nextLine();
        }

        if (isNumberWars) {
                System.out.println("Number wars!");
            if (winner.equals(firstPlayerName)) {
                System.out.printf("%s is winner with %d points", winner, firstPlayerPoints);
            } else if (winner.equals(secondPlayerName)) {
                System.out.printf("%s is winner with %d points", winner, secondPlayerPoints);
            }
        } else {
            System.out.printf("%s has %d points%n", firstPlayerName, firstPlayerPoints);
            System.out.printf("%s has %d points", secondPlayerName, secondPlayerPoints);
        }
    }
}
