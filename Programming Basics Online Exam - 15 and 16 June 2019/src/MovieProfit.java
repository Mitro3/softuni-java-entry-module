import java.util.Scanner;

public class MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        int numberDays = Integer.parseInt(scanner.nextLine());
        int ticketsQuantity = Integer.parseInt(scanner.nextLine());
        double ticketsPrice = Double.parseDouble(scanner.nextLine());
        int percentCinema = Integer.parseInt(scanner.nextLine());

        double priceTickets = ticketsQuantity * ticketsPrice;
        double totalIncome = numberDays * priceTickets;
        double cinemaIncome = totalIncome * percentCinema / 100;
        double clearIncome = totalIncome - cinemaIncome;
        System.out.printf("The profit from the movie %s is %.2f lv.", movieName,clearIncome);
    }
}
