import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int firstSymbol = 1; firstSymbol <= n; firstSymbol++) {
            for (int secondSymbol = 1; secondSymbol <= n; secondSymbol++) {
                for (char thirdSymbol = 'a'; thirdSymbol < 'a' + l; thirdSymbol++) {
                    for (char fourthSymbol = 'a'; fourthSymbol < 'a' + l; fourthSymbol++) {
                        for (int fifthSymbol = 1; fifthSymbol <= n; fifthSymbol++) {

                            if (fifthSymbol > firstSymbol && fifthSymbol > secondSymbol) {
                                System.out.printf("%1$d%2$d%3$c%4$c%5$d ", firstSymbol, secondSymbol, thirdSymbol, fourthSymbol, fifthSymbol);
                            }
                        }
                    }
                }
            }
        }
    }
}
