import java.util.Scanner;

public class CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startInterval = Integer.parseInt(scanner.nextLine());
        int endInterval = Integer.parseInt(scanner.nextLine());

        for (int i = startInterval; i <= endInterval; i++) {
            for (int j = startInterval; j <= endInterval; j++) {
                for (int k = startInterval; k <= endInterval; k++) {
                    for (int l = startInterval; l <= endInterval; l++) {

                        boolean isEvenAndOdd = false;
                        if (((i % 2 == 0) && (l % 2 != 0)) || ((i % 2 != 0) && (l % 2 == 0))) {
                            isEvenAndOdd = true;
                        }

                        boolean isIBiggerThanL = false;
                        if (i > l) {
                            isIBiggerThanL = true;
                        }

                        boolean isMiddleSumEven = false;
                        int middleSum = j + k;
                        if (middleSum % 2 == 0) {
                            isMiddleSumEven = true;
                        }

                        if (isEvenAndOdd && isIBiggerThanL && isMiddleSumEven) {
                            System.out.print(i);
                            System.out.print(j);
                            System.out.print(k);
                            System.out.print(l + " ");

                        }
                    }
                }
            }


        }


    }
}
