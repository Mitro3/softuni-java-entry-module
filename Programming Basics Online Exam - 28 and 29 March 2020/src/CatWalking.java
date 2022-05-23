
import java.util.Scanner;

public class CatWalking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutesPerWalk = Integer.parseInt(scanner.nextLine());
        int walksPerDay = Integer.parseInt(scanner.nextLine());
        int caloriesPerDay = Integer.parseInt(scanner.nextLine());

        int minutesPerDay = minutesPerWalk * walksPerDay;
        int caloriesBurnt = minutesPerDay * 5;
        int caloriesAbs = caloriesPerDay / 2;
        if (caloriesBurnt >= caloriesAbs) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", caloriesBurnt );
        } else {
            System.out.printf( "No, the walk for your cat is not enough. Burned calories per day: %d.", caloriesBurnt);
        }
    }
}
