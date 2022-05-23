import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countLetterN = 0, countLetterO = 0, countLetterC = 0;
        String input = scanner.nextLine();
        String word = "";

        while (!input.equals("End")) {
            char letter = input.charAt(0);
            if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
                if (letter == 'n' && countLetterN != 1) {
                    countLetterN++;
                } else if (letter == 'o' && countLetterO != 1) {
                    countLetterO++;
                } else if (letter == 'c' && countLetterC != 1) {
                    countLetterC++;
                } else {
                    word += letter;
                }

                if (countLetterC > 0 && countLetterN > 0 && countLetterO > 0) {
                    System.out.print(word + " ");
                    countLetterN--;
                    countLetterC--;
                    countLetterO--;
                    word = "";
                }
            }

            input = scanner.next();


        }

    }
}
