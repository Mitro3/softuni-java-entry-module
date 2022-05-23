import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());

        double secondsTotal = distanceMeters * secondsPerMeter;
        double resistanceTime = Math.floor(distanceMeters / 15) * 12.5;
        double totalTime = secondsTotal + resistanceTime;
        double difference = Math.abs(worldRecord - totalTime);
        if (totalTime < worldRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        }
    }
}
