import java.util.Scanner;

public class OldbooksCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wantedBook = scanner.nextLine();


        int booksCount = 0;
        String input = scanner.nextLine();
        boolean isFound = false;
        while (!input.equals("No More Books")) {
            if (input.equals(wantedBook)) {
                isFound = true;
                System.out.printf("You checked %d books and found it.", booksCount);
                break;
            }
                booksCount++;
                input = scanner.nextLine();
        }

        if (!isFound) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", booksCount);
        }
    }
}
