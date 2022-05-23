import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lastSector = scanner.nextLine();
        int rowsQuantitySector = Integer.parseInt(scanner.nextLine());
        int seatsAtOddRow = Integer.parseInt(scanner.nextLine());

        char lastSectorChar = lastSector.charAt(0);
        int rowSeats = seatsAtOddRow;
        int totalSeatsCount = 0;

        for (char sector = 'A'; sector <= lastSectorChar; sector++) {
            for (int row = 1; row <= rowsQuantitySector; row++) {
                if (row % 2 == 0) {
                    rowSeats += 2;
                } else {
                    rowSeats = seatsAtOddRow;
                }
                for (char seat = 'a'; seat <= ('a' + rowSeats) - 1; seat++) {
                    System.out.printf("%c%d%c%n", sector, row, seat);
                    totalSeatsCount++;
                }
            }
            rowsQuantitySector++;
        }
        System.out.println(totalSeatsCount);
    }
}
