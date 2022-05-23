import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hoursNeeded = Integer.parseInt(scanner.nextLine());
        int availableDays = Integer.parseInt(scanner.nextLine());
        int workersCount = Integer.parseInt(scanner.nextLine());

        double availableHours = availableDays * 0.9 * 8;
        double hoursExtra = workersCount * 2 * availableDays;
        double totalHoursProvided = Math.floor(availableHours + hoursExtra);
        double difference = Math.abs(hoursNeeded - totalHoursProvided);
        if (hoursNeeded <= totalHoursProvided) {
            System.out.printf("Yes!%.0f hours left.", difference);
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", difference);
        }
    }
}
