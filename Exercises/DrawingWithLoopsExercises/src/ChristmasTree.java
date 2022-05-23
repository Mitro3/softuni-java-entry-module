import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row <= n; row++) {
            //print left intervals
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            //print left stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.print(" | ");
            //print right stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            //print right intervals
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
