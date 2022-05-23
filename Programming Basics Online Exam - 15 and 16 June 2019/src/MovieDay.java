import java.util.Scanner;

public class MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int availableShootingTime = Integer.parseInt(scanner.nextLine());
        int scenesCount = Integer.parseInt(scanner.nextLine());
        int sceneTimeNeeded = Integer.parseInt(scanner.nextLine());

        double preparationTime = availableShootingTime * 0.15;
        double sceneDuration = preparationTime + sceneTimeNeeded * scenesCount;
        double difference = Math.round(Math.abs(availableShootingTime - sceneDuration));
        if (availableShootingTime >= sceneDuration) {
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", difference);
        } else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", difference);
        }
    }
}
