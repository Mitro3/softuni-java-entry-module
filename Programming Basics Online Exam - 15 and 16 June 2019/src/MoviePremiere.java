import java.util.Scanner;

public class MoviePremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        String moviePackage = scanner.nextLine();
        int ticketsCount = scanner.nextInt();

        double discount = 0;
        if (movieName.equals("Star Wars") && ticketsCount >= 4) {
            discount = 0.70;
        } else if (movieName.equals("Jumanji") && ticketsCount == 2) {
            discount = 0.85;
        } else {
            discount = 1.00;
        }

        double ticketPrice = 0;
        switch (movieName) {
            case "John Wick":
                switch (moviePackage) {
                    case "Drink":
                        ticketPrice = 12;
                        break;
                    case "Popcorn":
                        ticketPrice = 15;
                        break;
                    case "Menu":
                        ticketPrice = 19;

                }
                break;
            case "Star Wars":
                switch (moviePackage) {
                    case "Drink":
                        ticketPrice = 18;
                        break;
                    case "Popcorn":
                        ticketPrice = 25;
                        break;
                    case "Menu":
                        ticketPrice = 30;
                        break;
                }
                break;
            case "Jumanji":
                switch (moviePackage) {
                    case "Drink":
                        ticketPrice = 9;
                        break;
                    case "Popcorn":
                        ticketPrice = 11;
                        break;
                    case "Menu":
                        ticketPrice = 14;
                        break;
                }
        }
        double discountedTicketPrice = ticketPrice * discount * ticketsCount;
        System.out.printf("Your bill is %.2f leva.", discountedTicketPrice);

    }
}
