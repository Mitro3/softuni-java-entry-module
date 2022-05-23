import java.util.Scanner;

public class PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startValueFirstPairNumbers = Integer.parseInt(scanner.nextLine());
        int startValueSecondPairNumbers = Integer.parseInt(scanner.nextLine());
        int differenceFirstPair = Integer.parseInt(scanner.nextLine());
        int differenceSecondPair = Integer.parseInt(scanner.nextLine());

        boolean isFirstNumberPrime = false;
        boolean isSecondNumberPrime = false;

        for (int i = startValueFirstPairNumbers; i <= startValueFirstPairNumbers + differenceFirstPair ; i++) {
            for (int j = startValueSecondPairNumbers; j <= startValueSecondPairNumbers + differenceSecondPair; j++) {
                int counter = 0;
                for (int k = 1; k <= i; k++) {
                    if (i % k == 0) {
                        counter++;
                    }
                    if (counter == 2) {
                        isFirstNumberPrime = true;
                    } else {
                        isFirstNumberPrime = false;
                    }
                }
                counter = 0;

                for (int l = 1; l <= j; l++) {
                    if (j % l == 0) {
                        counter++;
                    }
                    if (counter == 2) {
                        isSecondNumberPrime = true;
                    } else {
                        isSecondNumberPrime = false;
                    }

                }
                if (isFirstNumberPrime && isSecondNumberPrime) {
                    System.out.printf("%d%d%n", i, j);
                }
            }
        }
    }
}
