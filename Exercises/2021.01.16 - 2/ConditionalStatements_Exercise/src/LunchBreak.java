import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String serieName = scanner.nextLine();
        int serieDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());

        double lunchDuration = breakDuration / 8.0;
        double chillDuration = breakDuration / 4.0;
        double remainedTime = breakDuration - lunchDuration - chillDuration;
        double difference = Math.ceil(Math.abs(serieDuration - remainedTime));
        if (remainedTime >= serieDuration) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serieName, difference);
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serieName, difference);
        }
    }
}
