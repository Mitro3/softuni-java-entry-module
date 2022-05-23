import java.util.Scanner;

public class HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wantedHeight = Integer.parseInt(scanner.nextLine());

        int attemptsCount = 0;
        int failedAtemptsCount = 0;
        boolean isSuccessfull = false;
        boolean isFailed = false;


        for (int i = wantedHeight - 30; i <= wantedHeight; i += 5) {
            isSuccessfull = false;
            failedAtemptsCount = 0;
            while (!isSuccessfull) {
                attemptsCount++;
                int currentAttemptHeight = Integer.parseInt(scanner.nextLine());

                if (currentAttemptHeight > i) {
                    isSuccessfull = true;
                } else {
                    failedAtemptsCount++;
                }

                if (failedAtemptsCount == 3) {
                    isFailed = true;
                    break;
                }
            }

            if (isFailed) {
                System.out.printf("Tihomir failed at %dcm after %d jumps.", i, attemptsCount);
                break;
            }

        }

        if (!isFailed) {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", wantedHeight, attemptsCount);
        }


    }
}
