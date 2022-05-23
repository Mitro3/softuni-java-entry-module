import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        boolean isInRange = (number >= -100 && number <= 100 && number != 0);
        if (!isInRange) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
