import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int moviesCount = Integer.parseInt(scanner.nextLine());

        double maxRating = -Double.MAX_VALUE;
        String movieMaxRating = "";
        double minRating = Double.MAX_VALUE;
        String movieMinRating = "";
        double ratingSum = 0;

        for (int i = 0; i < moviesCount; i++) {
            String movieName = scanner.nextLine();
            double movieRating = Double.parseDouble(scanner.nextLine());

            if (movieRating > maxRating) {
                maxRating = movieRating;
                movieMaxRating = movieName;
            }

            if (movieRating < minRating) {
                minRating = movieRating;
                movieMinRating = movieName;
            }

            ratingSum += movieRating;
        }

        double averageRating = ratingSum / moviesCount;

        System.out.printf("%s is with highest rating: %.1f%n", movieMaxRating, maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n", movieMinRating, minRating);
        System.out.printf("Average rating: %.1f", averageRating);
    }
}
