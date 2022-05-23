import java.util.Scanner;

public class RectangleOfNxNStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int rows = 0; rows < n; rows++) {
            for (int columns = 0; columns < n; columns++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
