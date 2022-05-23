import java.util.Scanner;

public class OscarsWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        String hallType = scanner.nextLine();
        int ticketsQuantity = scanner.nextInt();

        double totalProfit = ticketsQuantity * getTicketPrice(movieName, hallType);
        System.out.printf("%s -> %.2f lv.", movieName, totalProfit);
    }

    static double getNormalHallPrice (String movieName) {
        double ticketPrice = 0;
        switch (movieName) {
            case "A Star Is Born":
                ticketPrice = 7.50;
                break;
            case "Bohemian Rhapsody":
                ticketPrice = 7.35;
                break;
            case "Green Book":
                ticketPrice = 8.15;
                break;
            case "The Favourite":
                ticketPrice = 8.75;
                break;
            default:
                return -1;
        }
        return ticketPrice;
    }

    static double getLuxuryHallPrice (String movieName) {
        double ticketPrice = 0;
        switch (movieName) {
            case "A Star Is Born":
                ticketPrice = 10.5;
                break;
            case "Bohemian Rhapsody":
                ticketPrice = 9.45;
                break;
            case "Green Book":
                ticketPrice = 10.25;
                break;
            case "The Favourite":
                ticketPrice = 11.55;
                break;
            default:
                return -1;
        }
        return ticketPrice;
    }

    static double getUltraLuxuryHallPrice (String movieName) {
        double ticketPrice = 0;
        switch (movieName) {
            case "A Star Is Born":
                ticketPrice = 13.50;
                break;
            case "Bohemian Rhapsody":
                ticketPrice = 12.75;
                break;
            case "Green Book":
                ticketPrice = 13.25;
                break;
            case "The Favourite":
                ticketPrice = 13.95;
                break;
            default:
                return -1;
        }
        return ticketPrice;
    }

    static double getTicketPrice (String movieName, String hallType) {
        double ticketPrice = 0;
        if (hallType.equals("normal")) {
            ticketPrice = getNormalHallPrice(movieName);
        } else if (hallType.equals("luxury")) {
            ticketPrice = getLuxuryHallPrice(movieName);
        } else if (hallType.equals("ultra luxury")) {
            ticketPrice = getUltraLuxuryHallPrice(movieName);
        }
        return ticketPrice;
    }

}
