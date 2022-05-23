import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int primeSum = 0;
        int nonPrimeSum = 0;

        while (!input.equals("stop")) {
            int num = Integer.parseInt(input);

            if (num < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }

            int divider = 2;
            int maxDivider = (int) Math.sqrt(num);
            boolean prime = true;

            while (prime && (divider <= maxDivider)) {
                if (num % divider == 0) {
                    prime = false;
                }
                divider++;
            }

            if (prime) {
                primeSum += num;
            } else {
                nonPrimeSum += num;
            }

            input = scanner.nextLine();
        }

        System.out.println("Sum of all prime numbers is: " + primeSum);
        System.out.println("Sum of all non prime numbers is: " + nonPrimeSum);
    }
}
