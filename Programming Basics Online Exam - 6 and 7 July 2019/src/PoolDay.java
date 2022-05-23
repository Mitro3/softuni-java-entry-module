import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleNumber = Integer.parseInt(scanner.nextLine());
        double taxForEntrance = Double.parseDouble(scanner.nextLine());
        double pricePerSunbed = Double.parseDouble(scanner.nextLine());
        double pricePerUmbrella = Double.parseDouble(scanner.nextLine());

        double taxEntranceTotal = peopleNumber * taxForEntrance;
        double sunbedsNeeded = Math.ceil(peopleNumber * 0.75);
        double priceForSunbedsTotal = sunbedsNeeded * pricePerSunbed;
        double umbrellasNeeded = Math.ceil(peopleNumber / 2.0);
        double priceForUmbrellaTotal = umbrellasNeeded * pricePerUmbrella;
        double totalSum = taxEntranceTotal + priceForSunbedsTotal + priceForUmbrellaTotal;
        System.out.printf("%.2f lv.", totalSum);

    }
}
