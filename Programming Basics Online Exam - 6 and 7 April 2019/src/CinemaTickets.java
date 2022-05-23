import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int standardTicketsCount = 0;
        int kidTicketsCount = 0;
        int studentTicketsCount = 0;
        int totalTicketsCount = 0;
        String movieName = scanner.nextLine();

        while (!movieName.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());;
            int busySeatsCount = 0;

            while (busySeatsCount < freeSeats) {
                String ticketType = scanner.nextLine();
                if (ticketType.equals("End")) {
                    break;
                }
                switch (ticketType) {
                    case "standard":
                        standardTicketsCount++;
                        break;
                    case "kid":
                        kidTicketsCount++;
                        break;
                    case "student":
                        studentTicketsCount++;
                }
                busySeatsCount++;
            }
            double percentFull = 100.0 * busySeatsCount / freeSeats;
            System.out.printf("%s - %.2f%% full.%n", movieName, percentFull);
            totalTicketsCount += busySeatsCount;

            movieName = scanner.nextLine();
        }

        double percentStudentTickets = 100.0 * studentTicketsCount / totalTicketsCount;
        double percentStandardTickets = 100.0 * standardTicketsCount / totalTicketsCount;
        double percentKidsTickets = 100.0 * kidTicketsCount / totalTicketsCount;

        System.out.printf("Total tickets: %d%n", totalTicketsCount);
        System.out.printf("%.2f%% student tickets.%n", percentStudentTickets);
        System.out.printf("%.2f%% standard tickets.%n", percentStandardTickets);
        System.out.printf("%.2f%% kids tickets.", percentKidsTickets);
    }
}
