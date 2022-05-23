import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxGoalsScored = Integer.MIN_VALUE;
        String bestGoalscorer = "";
        boolean hatTrick = false;
        while (!scanner.hasNext("END")) {
            String playerName = scanner.nextLine();
            int goalsScored = Integer.parseInt(scanner.nextLine());

            if (goalsScored > maxGoalsScored) {
                maxGoalsScored = goalsScored;
                bestGoalscorer = playerName;
            }

            if (goalsScored >= 3) {
                hatTrick = true;
            }

            if (goalsScored >= 10) {
                break;
            }
        }
        System.out.printf("%s is the best player!%n", bestGoalscorer);
        if (hatTrick) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoalsScored);
        } else {
            System.out.printf("He has scored %d goals.", maxGoalsScored);
        }
    }
}
