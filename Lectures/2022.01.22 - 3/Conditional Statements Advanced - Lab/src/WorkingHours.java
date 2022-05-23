import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        String weekday = scanner.nextLine();

        String state = "closed";
        if (hour >= 10 && hour <= 18) {
            switch (weekday) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                case "Saturday":
                    state = "open";
                    break;
            }
        }
        System.out.println(state);
    }
}
