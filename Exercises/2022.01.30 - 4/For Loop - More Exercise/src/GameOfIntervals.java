import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double result = 0;
        int numbersFrom0to9 = 0;
        int numbersFrom10to19 = 0;
        int numbersFrom20to29 = 0;
        int numbersFrom30to39 = 0;
        int numbersFrom40to50 = 0;
        int invalidNumbersCount = 0;
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();

            if (number >= 0 && number <= 9) {
                result += number * 0.2;
                numbersFrom0to9++;
            } else if (number >= 10 && number <= 19) {
                result += number * 0.3;
                numbersFrom10to19++;
            } else if (number >= 20 && number <= 29) {
                result += number * 0.4;
                numbersFrom20to29++;
            } else if (number >= 30 && number <= 39) {
                result += 50;
                numbersFrom30to39++;
            } else if (number >= 40 && number <= 50) {
                result += 100;
                numbersFrom40to50++;
            } else {
                result = result / 2;
                invalidNumbersCount++;
            }
        }

        double percentnumbersFrom0to9 = 100.0 * numbersFrom0to9 / n;
        double percentnumbersFrom10to19 = 100.0 * numbersFrom10to19 / n;
        double percentnumbersFrom20to29 = 100.0 * numbersFrom20to29 / n;
        double percentnumbersFrom30to39 = 100.0 * numbersFrom30to39 / n;
        double percentnumbersFrom40to50 = 100.0 * numbersFrom40to50 / n;
        double percentnumbersInvalid = 100.0 * invalidNumbersCount / n;
        System.out.printf("%.2f\n", result);
        System.out.printf("From 0 to 9: %.2f%%\n", percentnumbersFrom0to9);
        System.out.printf("From 10 to 19: %.2f%%\n", percentnumbersFrom10to19);
        System.out.printf("From 20 to 29: %.2f%%\n", percentnumbersFrom20to29);
        System.out.printf("From 30 to 39: %.2f%%\n", percentnumbersFrom30to39);
        System.out.printf("From 40 to 50: %.2f%%\n", percentnumbersFrom40to50);
        System.out.printf("Invalid numbers: %.2f%%\n", percentnumbersInvalid);

    }
}
