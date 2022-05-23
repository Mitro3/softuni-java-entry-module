import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int stepsSum = 0;

        while (!input.equals("Going home")) {
            int stepsCount = Integer.parseInt(input);

            stepsSum += stepsCount;

            if (stepsSum >= 10000) {
                break;
            }

            input = scanner.nextLine();
        }

        if (input.equals("Going home")) {
            int stepsHome = Integer.parseInt(scanner.nextLine());;
            stepsSum += stepsHome;
        }

        int diff = Math.abs(stepsSum - 10000);

        if (stepsSum >= 10000) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", diff);
        } else {
            System.out.printf("%d more steps to reach goal.", diff);
        }
    }
}
