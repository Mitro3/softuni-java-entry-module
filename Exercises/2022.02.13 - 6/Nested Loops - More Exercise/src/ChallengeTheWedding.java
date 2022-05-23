import java.util.Scanner;

public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maleQuantity = Integer.parseInt(scanner.nextLine());
        int femaleQuantity = Integer.parseInt(scanner.nextLine());
        int maxTableQuantity = Integer.parseInt(scanner.nextLine());

        int tableCount = 0;
        boolean isFull = false;
        for (int maleNumber = 1; maleNumber <= maleQuantity; maleNumber++) {
            for (int femaleNumber = 1; femaleNumber <= femaleQuantity; femaleNumber++) {
                System.out.printf("(%d <-> %d) ", maleNumber, femaleNumber);
                tableCount++;

                if (tableCount >= maxTableQuantity) {
                    isFull = true;
                    break;
                }
            }

            if (isFull) {
                break;
            }
        }


    }

}
