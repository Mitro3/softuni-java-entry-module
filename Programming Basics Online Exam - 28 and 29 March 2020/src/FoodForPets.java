import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double totalFoodQuantity = Double.parseDouble(scanner.nextLine());

        double biscuitsCount = 0;
        int eatenFoodDogTotal = 0;
        int eatenFoodCatTotal = 0;
        for (int day = 1; day <= days; day++) {
            int eatenFoodDog = Integer.parseInt(scanner.nextLine());
            int eatenFoodCat = Integer.parseInt(scanner.nextLine());

            if (day % 3 == 0) {
                biscuitsCount += 0.1 * (eatenFoodDog + eatenFoodCat);
            }

            eatenFoodCatTotal += eatenFoodCat;
            eatenFoodDogTotal += eatenFoodDog;
        }
        double eatenFoodTotal = eatenFoodCatTotal + eatenFoodDogTotal;
        double percentEatenFoodTotal = eatenFoodTotal / totalFoodQuantity * 100;
        double percentEatenFoodDog = eatenFoodDogTotal / eatenFoodTotal * 100;
        double percentEatenFoodCat = eatenFoodCatTotal / eatenFoodTotal * 100;

        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(biscuitsCount));
        System.out.printf("%.2f%% of the food has been eaten.%n", percentEatenFoodTotal);
        System.out.printf("%.2f%% eaten from the dog.%n", percentEatenFoodDog);
        System.out.printf("%.2f%% eaten from the cat.%n", percentEatenFoodCat);

    }
}
