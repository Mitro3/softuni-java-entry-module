import java.util.Scanner;

public class SquareOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int rows = 0; rows < n; rows++) {
            for (int columns = 0; columns < n; columns++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
