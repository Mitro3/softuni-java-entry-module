import java.util.Scanner;

public class LettersCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String startLimit = scanner.nextLine();
        String endLimit = scanner.nextLine();
        String skipLimit = scanner.nextLine();

        int combinationCounter = 0;
        char startLetter = startLimit.charAt(0);
        char endLetter = endLimit.charAt(0);
        char skipLetter = skipLimit.charAt(0);

        for (char i = startLetter; i <= endLetter; i++) {
            if (i == skipLetter) {
                continue;
            }
            for (char j = startLetter; j <= endLetter; j++) {
                if (j == skipLetter) {
                    continue;
                }
                for (char k = startLetter; k <= endLetter; k++) {
                    if (k == skipLetter) {
                        continue;
                    }

                    String firstLetter = Character.toString(i);
                    String secondLetter = Character.toString(j);
                    String thirdLetter = Character.toString(k);
                    System.out.print(firstLetter + secondLetter + thirdLetter + " ");
                    combinationCounter++;

                }
            }
        }

        System.out.println(combinationCounter);
    }
}
