import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentTicketsCount = 0;
        int standardTicketsCount = 0;
        int kidsTicketsCounts = 0;
        int totalTickets = 0;
        String movieName = scanner.nextLine();

        while (!movieName.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());

            int totalTicketsPerMovie = 0;
            while (totalTicketsPerMovie < freeSeats) {
                String ticket = scanner.nextLine();

                if (ticket.equals("student")) {
                    studentTicketsCount++;
                } else if (ticket.equals("standard")) {
                    standardTicketsCount++;
                } else if (ticket.equals("kid")) {
                    kidsTicketsCounts++;
                } else if (ticket.equals("End")) {
                    break;
                }
                totalTicketsPerMovie++;
            }

            double percentBusySeats = 100.0 * totalTicketsPerMovie / freeSeats;
            System.out.printf("%s - %.2f%% full.%n", movieName, percentBusySeats);
            totalTickets += totalTicketsPerMovie;

            movieName = scanner.nextLine();
        }

        double percentStudentsTickets = 100.0 * studentTicketsCount / totalTickets;
        double percentStandardTickets = 100.0 * standardTicketsCount / totalTickets;
        double percentKidsTickets = 100.0 * kidsTicketsCounts / totalTickets;
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", percentStudentsTickets);
        System.out.printf("%.2f%% standard tickets.%n", percentStandardTickets);
        System.out.printf("%.2f%% kids tickets.", percentKidsTickets);

    }
}
