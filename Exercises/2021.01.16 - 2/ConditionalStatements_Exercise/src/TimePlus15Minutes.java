import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = minutes + 15;
        if (totalMinutes >= 60) {
            hours++;
            totalMinutes -= 60;
        }
        if (hours >= 24) {
            hours = 0;
        }
        System.out.printf("%d:%02d", hours, totalMinutes);
    }
}
