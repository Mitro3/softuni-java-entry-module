import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int seriesNumber = Integer.parseInt(scanner.nextLine());

        double sum = 0;
        for (int i = 0; i < seriesNumber; i++) {
            String serieName = scanner.nextLine();
            double seriePrice = Double.parseDouble(scanner.nextLine());

            switch (serieName) {
                case "Thrones":
                    sum += 0.5 * seriePrice;
                    break;
                case "Lucifer":
                    sum += 0.6 * seriePrice;
                    break;
                case "Protector":
                    sum += 0.7 * seriePrice;
                    break;
                case "TotalDrama":
                    sum += 0.8 * seriePrice;
                    break;
                case "Area":
                    sum += 0.9 * seriePrice;
                    break;
                default:
                    sum += seriePrice;
            }
        }

        double diff = Math.abs(budget - sum);
        if (budget >= sum) {
            System.out.printf("You bought all the series and left with %.2f lv.", diff);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", diff);
        }
    }
}
