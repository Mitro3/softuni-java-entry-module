import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int climbersGroupsCount = Integer.parseInt(scanner.nextLine());

        int climbersMusala = 0;
        int climbersMonblan = 0;
        int climbersKilimandjaro = 0;
        int climbersK2 = 0;
        int climbersEverest = 0;
        for (int i = 0; i < climbersGroupsCount; i++) {
            int climbersCount = Integer.parseInt(scanner.nextLine());
            if (climbersCount >= 0 && climbersCount <= 5) {
                climbersMusala += climbersCount;
            } else if (climbersCount <= 12) {
                climbersMonblan += climbersCount;
            } else if (climbersCount <= 25) {
                climbersKilimandjaro += climbersCount;
            } else if (climbersCount <= 40) {
                climbersK2 += climbersCount;
            } else {
                climbersEverest += climbersCount;
            }
        }

        double totalClimbers = climbersMusala + climbersMonblan + climbersKilimandjaro + climbersK2 + climbersEverest;
        double percentClimbersMusala = climbersMusala / totalClimbers * 100;
        double percentClimbersMonblan = climbersMonblan / totalClimbers * 100;
        double percentClimbersKilimandjaro = climbersKilimandjaro / totalClimbers * 100;
        double percentClimbersK2 = climbersK2 / totalClimbers * 100;
        double percentClimbersEverest = climbersEverest / totalClimbers * 100;

        System.out.printf("%.2f%%\n", percentClimbersMusala);
        System.out.printf("%.2f%%\n", percentClimbersMonblan);
        System.out.printf("%.2f%%\n", percentClimbersKilimandjaro);
        System.out.printf("%.2f%%\n", percentClimbersK2);
        System.out.printf("%.2f%%\n", percentClimbersEverest);
    }
}
