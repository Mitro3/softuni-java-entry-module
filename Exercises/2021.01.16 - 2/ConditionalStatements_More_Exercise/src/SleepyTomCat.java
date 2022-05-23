import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int holidaysCount = Integer.parseInt(scanner.nextLine());

        int workingDaysCount = 365 - holidaysCount;
        int playingTime = holidaysCount * 127 + workingDaysCount * 63;
        int normDifference = Math.abs(30000 - playingTime);
        int normHours = normDifference / 60;
        int normMinutes = normDifference % 60;
        if (playingTime >= 30000) {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", normHours, normMinutes);
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", normHours, normMinutes);
        }
    }
}
