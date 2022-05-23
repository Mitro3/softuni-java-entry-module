import java.util.Scanner;

public class Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        String device = scanner.nextLine();

        double totalGrade = 0;
        double diff = 0;
        switch (country) {
            case "Russia":
                totalGrade = getRussiaScore(device);
                diff = (20 - totalGrade) / 20 * 100;
                break;
            case "Bulgaria":
                totalGrade = getBulgariaScore(device);
                diff = (20 - totalGrade) / 20 * 100;
                break;
            case "Italy":
                totalGrade = getItalyScore(device);
                diff = (20 - totalGrade) / 20 * 100;
                break;
        }
        System.out.printf("The team of %1$s get %2$.3f on %3$s.%n", country, totalGrade, device);
        System.out.printf("%.2f%%", diff);

    }

    static double getRussiaScore (String device) {
        double difficultyGrage = 0;
        double executionGrade = 0;
        switch (device) {
            case "ribbon":
                difficultyGrage = 9.100;
                executionGrade = 9.400;
                break;
            case "hoop":
                difficultyGrage = 9.300;
                executionGrade = 9.800;
                break;
            case "rope":
                difficultyGrage = 9.600;
                executionGrade = 9.000;
                break;
        }
        return (difficultyGrage + executionGrade);
    }

    static double getBulgariaScore (String device) {
        double difficultyGrage = 0;
        double executionGrade = 0;
        switch (device) {
            case "ribbon":
                difficultyGrage = 9.600;
                executionGrade = 9.400;
                break;
            case "hoop":
                difficultyGrage = 9.550;
                executionGrade = 9.750;
                break;
            case "rope":
                difficultyGrage = 9.500;
                executionGrade = 9.400;
                break;
        }
        return (difficultyGrage + executionGrade);
    }

    static double getItalyScore (String device) {
        double difficultyGrage = 0;
        double executionGrade = 0;
        switch (device) {
            case "ribbon":
                difficultyGrage = 9.200;
                executionGrade = 9.500;
                break;
            case "hoop":
                difficultyGrage = 9.450;
                executionGrade = 9.350;
                break;
            case "rope":
                difficultyGrage = 9.700;
                executionGrade = 9.150;
                break;
        }
        return (difficultyGrage + executionGrade);
    }
}
