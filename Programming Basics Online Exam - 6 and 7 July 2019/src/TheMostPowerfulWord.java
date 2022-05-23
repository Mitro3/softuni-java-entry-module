import java.util.Scanner;

public class TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        char currentLetter;
        String mostPowerfulWord = "";

        while (!word.equals("End of words")) {

            for (int i = 0; i < word.length(); i++) {
                currentLetter = word.charAt(i);

                sum += currentLetter;

            }
            boolean isVowel = word.charAt(0) == 'a' || word.charAt(0) =='e' || word.charAt(0) =='i' || word.charAt(0) =='o' || word.charAt(0) =='u'
                    || word.charAt(0) =='y' || word.charAt(0) == 'A' || word.charAt(0) =='E' || word.charAt(0) =='I' || word.charAt(0) =='O'
                    || word.charAt(0) =='U'
                    || word.charAt(0) =='Y';

            if (isVowel) {
                sum *= word.length();
            } else {
                sum = sum / word.length();
            }

            if (sum > maxSum) {
                maxSum = sum;
                mostPowerfulWord = word;
            }
            sum = 0;
            word = scanner.nextLine();
        }

        System.out.printf("The most powerful word is %s - %d", mostPowerfulWord, maxSum);
    }
}
