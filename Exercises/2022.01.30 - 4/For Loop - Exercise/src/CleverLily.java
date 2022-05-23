import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toySinglePrice = Integer.parseInt(scanner.nextLine());

        // Count the number of toys in the years:
        int toyCount = 0;
        int birthDaySum = 0;
        double totalBirthdaySum = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 != 0) {
                toyCount++;
            } else {
                birthDaySum = birthDaySum + 10;
                totalBirthdaySum += birthDaySum;
            }
        }

        // Count the sum of the sold toys:
        double totalToySum = toyCount * toySinglePrice;

        //Count the sum of collected birthday money:
        int brothersMoney = age / 2;
        totalBirthdaySum = totalBirthdaySum - brothersMoney;

        //Calculate the total saved money:
        double totalSum = totalBirthdaySum + totalToySum;
        double diff = Math.abs(totalSum - washingMachinePrice);
        if (totalSum >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }

    }
}
