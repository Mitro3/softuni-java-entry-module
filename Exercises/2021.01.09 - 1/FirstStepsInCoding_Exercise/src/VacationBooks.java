import java.util.Scanner;

public class VacationBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int hoursTotal = pages / pagesPerHour;
        int hoursPerDay = hoursTotal / days;
        System.out.println(hoursPerDay);
    }
}
