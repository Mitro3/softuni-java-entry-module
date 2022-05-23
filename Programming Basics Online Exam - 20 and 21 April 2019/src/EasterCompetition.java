import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int participantsNumber = Integer.parseInt(scanner.nextLine());

        int maxPoints = 0;
        String winnerName = "";

        for (int i = 0; i < participantsNumber; i++) {
            String chefsName = scanner.nextLine();
            String input = scanner.nextLine();
            int totalPoints = 0;

            while (!input.equals("Stop")) {
                int currentPoints = Integer.parseInt(input);
                totalPoints += currentPoints;

                input = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n", chefsName, totalPoints);

            if (totalPoints > maxPoints) {
                maxPoints = totalPoints;
                winnerName = chefsName;
                System.out.printf("%s is the new number 1!%n", chefsName);
            }
        }

        System.out.printf("%s won competition with %d points!", winnerName, maxPoints);
    }
}
