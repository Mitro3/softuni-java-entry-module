import java.util.Scanner;

public class MovieStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        double totalSum = budget;
        String input = scanner.nextLine();
        boolean isUsed = false;
        double actorReward = 0;

        while (!input.equals("ACTION")) {
            if (input.length() <= 15) {
                actorReward = Double.parseDouble(scanner.nextLine());
            } else {
                actorReward = 0.2 * totalSum;
            }

            totalSum -= actorReward;

            if (totalSum <= 0) {
                isUsed = true;
                break;
            }

            input = scanner.nextLine();
        }

        if (!isUsed) {
            System.out.printf("We are left with %.2f leva.", totalSum);
        } else {
            System.out.printf("We need %.2f leva for our actors.", Math.abs(totalSum));
        }
    }
}
