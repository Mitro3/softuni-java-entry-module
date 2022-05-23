import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int spaceWidth = Integer.parseInt(scanner.nextLine());
        int spaceLength = Integer.parseInt(scanner.nextLine());
        int spaceHeight = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        int totalSpace = spaceHeight * spaceWidth * spaceLength;
        boolean isFull = false;

        while (!input.equals("Done")) {
            int packagesNumber = Integer.parseInt(input);

            totalSpace -= packagesNumber;

            if (totalSpace < 0) {
                isFull = true;
                break;
            }

            input = scanner.nextLine();
        }

        if (isFull) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(totalSpace));
        } else {
            System.out.printf("%d Cubic meters left.", totalSpace);
        }

    }
}
