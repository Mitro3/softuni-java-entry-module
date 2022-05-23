import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int inputSum = 0;
        while (firstNumber > inputSum) {
            int num = Integer.parseInt(scanner.nextLine());
            inputSum += num;
        }
        System.out.println(inputSum);
    }
}
