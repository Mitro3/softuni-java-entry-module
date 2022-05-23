import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstDigitLimit = Integer.parseInt(scanner.nextLine());
        int secondDigitLimit = Integer.parseInt(scanner.nextLine());
        int thirdDigitLimit = Integer.parseInt(scanner.nextLine());
        boolean isEvenFirstDigitFirstDigit = false;
        boolean isEvenThirdDigitFirstDigit = false;

        for (int firstDigit = 2; firstDigit <= firstDigitLimit; firstDigit++) {
            for (int secondDigit = 2; secondDigit <= secondDigitLimit; secondDigit++) {
                for (int thirdDigit = 2; thirdDigit <= thirdDigitLimit; thirdDigit++) {
                    if (firstDigit % 2 == 0) {
                        isEvenFirstDigitFirstDigit = true;
                    } else {
                        continue;
                    }
                    
                    int divider = 2;
                    boolean isPrime = true;
                    while (isPrime && (divider < secondDigit)) {
                        if (secondDigit % divider == 0) {
                            isPrime = false;
                        }
                        divider++;
                    }
                    
                    if (thirdDigit % 2 == 0) {
                        isEvenThirdDigitFirstDigit = true;
                    } else {
                        continue;
                    }
                    
                    if (isEvenFirstDigitFirstDigit && isEvenThirdDigitFirstDigit && isPrime) {
                        System.out.println(firstDigit + " " + secondDigit + " " + thirdDigit);
                    }
                }
            }
        }
    }
}
