import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieType = scanner.nextLine();
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        double seatsCount = rows * columns;
        double ticketPrice = 0;
        if (movieType.equals("Premiere")) {
            ticketPrice = 12.00;
        } else if (movieType.equals("Normal")) {
            ticketPrice = 7.50;
        } else if ( movieType.equals("Discount")) {
            ticketPrice = 5.00;
        }
        System.out.printf("%.2f leva", (seatsCount * ticketPrice));
    }
}
