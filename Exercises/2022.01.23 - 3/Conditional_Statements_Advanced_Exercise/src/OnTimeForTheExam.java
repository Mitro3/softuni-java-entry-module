import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = scanner.nextInt();
        int examMinutes = scanner.nextInt();
        int arrivalHour = scanner.nextInt();
        int arrivalMinutes = scanner.nextInt();

        int examTime = examHour * 60 + examMinutes;
        int arrivalTime = arrivalHour * 60 + arrivalMinutes;
        int diff = Math.abs(examTime - arrivalTime);

        if (arrivalHour == examTime || ((diff <= 30) && examTime >= arrivalTime)) {
            System.out.println("On time");
            System.out.printf("%d minutes before the start", diff);
        } else if (arrivalTime <= (examTime - 30)) {
            System.out.println("Early");
            if (diff < 60) {
                System.out.printf("%d minutes before the start", diff);
            } else {
                int hours = diff / 60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours before the start", hours, minutes);
            }
        } else if (arrivalTime > examTime) {
            System.out.println("Late");
            if (diff < 60) {
                System.out.printf("%d minutes after the start", diff);
            } else {
                int hours = diff / 60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours after the start", hours, minutes);
            }
        }
    }
}
