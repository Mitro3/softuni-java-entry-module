import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double availableSum = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sportType = scanner.nextLine();

        double priceWithoutDiscount = 0;
        if (gender.equals("m")) {
            if (sportType.equals("Gym")) {
                priceWithoutDiscount = 42;
            } else if (sportType.equals("Boxing")) {
                priceWithoutDiscount = 41;
            } else if (sportType.equals("Yoga")) {
                priceWithoutDiscount = 45;
            } else if (sportType.equals("Zumba")) {
                priceWithoutDiscount = 34;
            } else if (sportType.equals("Dances")) {
                priceWithoutDiscount = 51;
            } else if (sportType.equals("Pilates")) {
                priceWithoutDiscount = 39;
            }
        } else if (gender.equals("f")) {
            if (sportType.equals("Gym")) {
                priceWithoutDiscount = 35;
            } else if (sportType.equals("Boxing")) {
                priceWithoutDiscount = 37;
            } else if (sportType.equals("Yoga")) {
                priceWithoutDiscount = 42;
            } else if (sportType.equals("Zumba")) {
                priceWithoutDiscount = 31;
            } else if (sportType.equals("Dances")) {
                priceWithoutDiscount = 53;
            } else if (sportType.equals("Pilates")) {
                priceWithoutDiscount = 37;
            }
        }

        double totalPrice = priceWithoutDiscount * getDiscount(age);
        double diff = Math.abs(totalPrice - availableSum);
        if (availableSum >= totalPrice) {
            System.out.printf("You purchased a 1 month pass for %s.", sportType);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", diff);
        }
    }

    static double getDiscount(int age) {
        if (age <= 19) {
            return 0.8;
        } else {
            return 1;
        }
    }
}
