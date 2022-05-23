import java.util.Scanner;

public class CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int voucherPrice = Integer.parseInt(scanner.nextLine());

        int ticketsCount = 0;
        int productsCount = 0;
        int discountedPrice = 0;
        while (voucherPrice >= 0) {
            String purchase = scanner.nextLine();
            if (purchase.equals("End")) {
                System.out.println(ticketsCount);
                System.out.println(productsCount);
                break;
            }

            if (purchase.length() > 8) {
                char firstCharacter = purchase.charAt(0);
                char secondCharacter = purchase.charAt(1);
                int asciiFirstNumber = firstCharacter;
                int asciiSecondNumber = secondCharacter;
                discountedPrice = asciiFirstNumber + asciiSecondNumber;
                if (discountedPrice > voucherPrice) {
                    System.out.println(ticketsCount);
                    System.out.println(productsCount);
                    break;
                }
                voucherPrice -= discountedPrice;
                ticketsCount++;

            } else {
                char firstCharacter = purchase.charAt(0);
                discountedPrice = firstCharacter;
                if (discountedPrice > voucherPrice) {
                    System.out.println(ticketsCount);
                    System.out.println(productsCount);
                    break;
                }
                voucherPrice -= discountedPrice;
                productsCount++;

            }

        }

    }
}
