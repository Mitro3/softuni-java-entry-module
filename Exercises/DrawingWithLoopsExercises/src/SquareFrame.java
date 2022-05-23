import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        for (int rows = 1; rows <= n; rows++) {
            while (rows != n) {

                if (rows == 1) {
                    System.out.print("+ ");
                    for (int columns = 0; columns < n - 2; columns++) {
                        System.out.print("- ");
                    }
                    System.out.println("+");
                } else {
                    System.out.print("| ");
                    for (int columns = 0; columns < n - 2; columns++) {
                        System.out.print("- ");
                    }
                    System.out.println("|");
                }
                rows++;
            }

            System.out.print("+ ");
            for (int columns = 0; columns < n - 2; columns++) {
                System.out.print("- ");
            }
            System.out.println("+");

        }

    }
}
