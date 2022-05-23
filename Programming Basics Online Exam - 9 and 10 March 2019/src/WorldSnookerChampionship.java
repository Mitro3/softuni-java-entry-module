import java.util.Scanner;

public class WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tournamentStage = scanner.nextLine();
        String ticketType = scanner.nextLine();
        int ticketsCount = scanner.nextInt();
        scanner.nextLine();
        String trophyPhoto = scanner.nextLine();

        double ticketPrice = 0;
        if (tournamentStage.equals("Quarter final")) {
            switch (ticketType) {
                case "Standard":
                    ticketPrice = 55.50;
                    break;
                case "Premium":
                    ticketPrice = 105.20;
                    break;
                case "VIP":
                    ticketPrice = 118.90;
            }
        } else if (tournamentStage.equals("Semi final")) {
            switch (ticketType) {
                case "Standard":
                    ticketPrice = 75.88;
                    break;
                case "Premium":
                    ticketPrice = 125.22;
                    break;
                case "VIP":
                    ticketPrice = 300.40;
            }
        } else if (tournamentStage.equals("Final")) {
            switch (ticketType) {
                case "Standard":
                    ticketPrice = 110.10;
                    break;
                case "Premium":
                    ticketPrice = 160.66;
                    break;
                case "VIP":
                    ticketPrice = 400.00;
            }
        }
        double totalTicketPrice = ticketPrice * ticketsCount;
        double trophyPhotoPrice = 0;
        if (trophyPhoto.equals("Y")) {
            trophyPhotoPrice = 40;
        } else {
            trophyPhotoPrice = 0;
        }
        double discount = 1;
        if (totalTicketPrice > 4000) {
            trophyPhotoPrice = 0;
            discount = 0.75;
        } else if (totalTicketPrice > 2500) {
            discount = 0.90;
        }
        System.out.printf("%.2f", (totalTicketPrice * discount + ticketsCount * trophyPhotoPrice));

    }
}
