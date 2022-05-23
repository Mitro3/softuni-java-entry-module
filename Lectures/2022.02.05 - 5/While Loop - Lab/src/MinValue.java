import java.util.Scanner;

public class MinValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minValue = Integer.MAX_VALUE;

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {

            int number = Integer.parseInt(input);

            if (number < minValue) {
                minValue = number;
            }

            input = scanner.nextLine();
        }

        System.out.println(minValue);
    }
}
