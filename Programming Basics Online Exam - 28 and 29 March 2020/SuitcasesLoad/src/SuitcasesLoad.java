import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double capacityVolume = Double.parseDouble(scanner.nextLine());

        int suitcaseCount = 0;
        while (!scanner.hasNext("End")) {
            double suitcaseVolume = Double.parseDouble(scanner.nextLine());

            if ((suitcaseCount + 1) % 3 == 0) {
                suitcaseVolume *= 1.1;
            }

            capacityVolume -= suitcaseVolume;

            if (capacityVolume < 0) {
                System.out.println("No more space!");
                break;
            }
            suitcaseCount++;

            if (scanner.hasNext("End")) {
                System.out.println("Congratulations! All suitcases are loaded!");
            }
        }

        System.out.printf("Statistic: %d suitcases loaded.", suitcaseCount);

    }
}
