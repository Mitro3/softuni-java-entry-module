import java.util.Scanner;

public class FavoriteMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();

        char currentLetter;
        int maxSum = Integer.MIN_VALUE;
        String bestMovie = "";
        int movieCount = 0;
        boolean isLimitReached = false;

        while (!movieName.equals("STOP")) {
            int currentSum = 0;
            for (int i = 0; i < movieName.length(); i++) {

                currentLetter = movieName.charAt(i);
                currentSum += currentLetter;

                if (currentLetter >= 97 && currentLetter <= 122) {
                    currentSum -= 2 * movieName.length();
                } else if (currentLetter >= 65 && currentLetter <= 90){
                    currentSum -= movieName.length();
                }

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    bestMovie = movieName;
                }
            }

            movieCount++;
            if (movieCount == 7) {
                isLimitReached = true;
                break;
            }
            movieName = scanner.nextLine();
        }

        if (isLimitReached) {
            System.out.println("The limit is reached.");
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", bestMovie, maxSum);
    }
}
