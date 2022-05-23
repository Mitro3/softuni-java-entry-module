import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameSerie = scanner.nextLine();
        int seasonsNumber = Integer.parseInt(scanner.nextLine());
        int seriesNumber = Integer.parseInt(scanner.nextLine());
        double timePerEpisode = Double.parseDouble(scanner.nextLine());

        double timePerEpisodeTotal = timePerEpisode * 1.2;
        double addTimeSpecialEpisode = seasonsNumber * 10;
        double totalTimeNeeded = Math.floor(timePerEpisodeTotal * seriesNumber * seasonsNumber + addTimeSpecialEpisode);
        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", nameSerie, totalTimeNeeded);
    }
}
