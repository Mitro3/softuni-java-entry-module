import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double wantedIncome = Double.parseDouble(scanner.nextLine());

        int coctailPrice = 0;
        double discountedCoctailPrice = 0;
        double clubIncome = 0;
        while (clubIncome < wantedIncome) {
            String coctail = scanner.nextLine();
            if (coctail.equals("Party!")) {
                System.out.printf("We need %.2f leva more.%n", wantedIncome - clubIncome);
                break;
            }

            int coctailsCount = Integer.parseInt(scanner.nextLine());

            coctailPrice = coctail.length() * coctailsCount;
            if (coctailPrice % 2 != 0) {
                discountedCoctailPrice = 0.75 * coctailPrice;
            } else {
                discountedCoctailPrice = coctailPrice;
            }
            clubIncome += discountedCoctailPrice;
        }
        if (clubIncome >= wantedIncome) {
            System.out.println("Target acquired.");
        }
        System.out.printf("Club income - %.2f leva.", clubIncome);
    }
}
