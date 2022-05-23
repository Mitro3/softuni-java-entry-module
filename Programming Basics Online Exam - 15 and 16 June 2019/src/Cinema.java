import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hallCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        int ticketIncome = 0;
        boolean isFull = false;

        while (!input.equals("Movie time!")) {
            int peopleCount = Integer.parseInt(input);
            if (peopleCount > hallCapacity) {
                isFull = true;
                break;
            }

            if (peopleCount % 3 == 0) {
                ticketIncome += (peopleCount * 5 - 5);
            } else {
                ticketIncome += peopleCount * 5;
            }

            hallCapacity -= peopleCount;


            input = scanner.nextLine();
        }

        if (!isFull) {
            System.out.printf("There are %d seats left in the cinema.%n", hallCapacity);
        } else {
            System.out.println("The cinema is full.");
        }
        System.out.printf("Cinema income - %d lv.", ticketIncome);

    }
}
