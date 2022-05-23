import java.util.Scanner;

public class SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxGeneratedPasswords = Integer.parseInt(scanner.nextLine());

        int counter = maxGeneratedPasswords;
        char A = '#';
        char B = '@';

        for (int x = 1; x <= a; x++) {
            for (int y = 1; y <= b; y++) {
                if (counter == 1) {
                    System.out.printf("%c%c%d%d%c%c|", A, B, x, y, B, A);
                    return;
                } else {
                    System.out.printf("%c%c%d%d%c%c|", A, B, x, y, B, A);
                    A++;
                    B++;

                    if (A > '7') {
                        A = '#';
                    }

                    if (B > '`') {
                        B = '@';
                    }

                    counter--;
                }

            }
        }
    }
}

