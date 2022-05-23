import java.util.Scanner;

public class P_05_Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String overnight = scanner.nextLine();

        int mountHeight = 8848;
        int nightsCount = 1;
        int metersClimbed = 5364;
        boolean isClimbed = false;

        while (!overnight.equals("END")) {
            int currentMeters = Integer.parseInt(scanner.nextLine());

            if (overnight.equals("Yes")) {
                nightsCount++;
            }

            if (nightsCount == 6) {
                break;
            }

            metersClimbed += currentMeters;

            if (metersClimbed >= mountHeight) {
                isClimbed = true;
                break;
            }

            overnight = scanner.nextLine();
        }

        if (isClimbed) {
            System.out.printf("Goal reached for %d days!", nightsCount);
        } else {
            System.out.println("Failed!");
            System.out.println(metersClimbed);
        }


    }
}
