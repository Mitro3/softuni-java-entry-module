import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double oddNumbersSum = 0;
        double minOddNumber = Double.MAX_VALUE;
        double maxOddNumber = -Double.MAX_VALUE;
        double evenNumbersSum = 0;
        double minEvenNumber = Double.MAX_VALUE;
        double maxEvenNumber = -Double.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(scanner.nextLine());

            if (i % 2 != 0) {
                oddNumbersSum += num;
                if (num > maxOddNumber) {
                    maxOddNumber = num;
                }
                if (num < minOddNumber) {
                    minOddNumber = num;
                }
            } else {
                evenNumbersSum += num;
                if (num > maxEvenNumber) {
                    maxEvenNumber = num;
                }
                if (num < minEvenNumber) {
                    minEvenNumber = num;
                }
            }
        }
            print("Odd", oddNumbersSum, minOddNumber, maxOddNumber, ",");
            print("Even", evenNumbersSum, minEvenNumber, maxEvenNumber, "");
    }

    static void print (String type, double sum, double minValue, double maxValue, String suffix) {
        System.out.printf("%sSum=%.2f,%n", type, sum);
        if (sum !=0) {
            System.out.printf("%sMin=%.2f,%n", type, minValue);
            System.out.printf("%sMax=%.2f%s%n", type, maxValue, suffix);
        } else {
            System.out.printf("%sMin=No,%n", type);
            System.out.printf("%sMax=No%s%n", type, suffix);
        }
    }
}
