import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottlesQuantity = Integer.parseInt(scanner.nextLine());


        int detergentQuantity = bottlesQuantity * 750;
        int dishesCount = 0;
        int potsCount = 0;
        int loadingCount = 1;
        boolean isEmpty = false;
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            int utensilsCount = Integer.parseInt(input);

            if (loadingCount % 3 == 0) {
                detergentQuantity -= (utensilsCount * 15);
                potsCount += utensilsCount;
            } else {
                detergentQuantity -= (utensilsCount * 5);
                dishesCount += utensilsCount;
            }

            if (detergentQuantity < 0) {
                isEmpty = true;
                break;
            }

            loadingCount++;
            input = scanner.nextLine();
        }

        if (!isEmpty) {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", dishesCount, potsCount);
            System.out.printf("Leftover detergent %d ml.", detergentQuantity);
        } else {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergentQuantity));
        }
    }
}
