import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int totalFansSum = Integer.parseInt(scanner.nextLine());

        int fansSectorA = 0;
        int fansSectorB = 0;
        int fansSectorV = 0;
        int fansSectorG = 0;
        for (int fan = 0; fan < totalFansSum; fan++) {
            String sectorLocation = scanner.nextLine();

            switch (sectorLocation) {
                case "A":
                    fansSectorA++;
                    break;
                case "B":
                    fansSectorB++;
                    break;
                case "V":
                    fansSectorV++;
                    break;
                case "G":
                    fansSectorG++;
            }

        }
        double percentFansSectorA = 100.0 * fansSectorA / totalFansSum;
        double percentFansSectorB = 100.0 * fansSectorB / totalFansSum;
        double percentFansSectorV = 100.0 * fansSectorV / totalFansSum;
        double percentFansSectorG = 100.0 * fansSectorG / totalFansSum;
        double percentFansTotal = (fansSectorA + fansSectorB + fansSectorV + fansSectorG) * 100.0 / stadiumCapacity ;

        System.out.printf("%.2f%%\n", percentFansSectorA);
        System.out.printf("%.2f%%\n", percentFansSectorB);
        System.out.printf("%.2f%%\n", percentFansSectorV);
        System.out.printf("%.2f%%\n", percentFansSectorG);
        System.out.printf("%.2f%%\n", percentFansTotal);
    }
}
