import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutesControl = Integer.parseInt(scanner.nextLine());
        int secondsControl = Integer.parseInt(scanner.nextLine());
        double lengthGutter = Double.parseDouble(scanner.nextLine());
        int secondsPassing100Meters = Integer.parseInt(scanner.nextLine());

        int controlTime = minutesControl * 60 + secondsControl;
        double decreasedTime = lengthGutter / 120 * 2.5;
        double passingTime = lengthGutter / 100 * secondsPassing100Meters - decreasedTime;
        if (controlTime >= passingTime) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.",passingTime);
        } else {
            double difference = passingTime - controlTime;
            System.out.printf("No, Marin failed! He was %.3f second slower.", difference);
        }
    }
}
