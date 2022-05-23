import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        int s4 = startNumber % 10;
        startNumber = startNumber / 10;
        int s3 = startNumber % 10;
        startNumber = startNumber / 10;
        int s2 = startNumber % 10;
        startNumber = startNumber / 10;
        int s1 = startNumber % 10;

        int e4 = endNumber % 10;
        endNumber = endNumber / 10;
        int e3 = endNumber % 10;
        endNumber = endNumber / 10;
        int e2 = endNumber % 10;
        endNumber = endNumber / 10;
        int e1 = endNumber % 10;


        for (int i = s1; i <= e1; i++) {
            for (int j = s2; j <= e2; j++) {
                for (int k = s3; k <= e3; k++) {
                    for (int l = s4; l <= e4; l++) {

                        boolean isOdd = (i % 2 != 0) && (j % 2 != 0) && (k % 2 != 0) && (l % 2 != 0);
                        if (isOdd) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }

    }
}
