import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999; i++) {
            String num = "" + i;

            int counter = 0;

            for (int j = 0; j < num.length(); j++) {
                int currentDigit = Integer.parseInt("" + num.charAt(j));

                if (currentDigit == 0) {
                    continue;
                }

                if (n % currentDigit == 0) {
                    counter++;
                }
            }

            if (counter == 4) {
                System.out.print(i + " ");
            }

        }

        System.out.println();
    }
}
