import java.util.Scanner;

public class P_01_PcStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceCPU = Double.parseDouble(scanner.nextLine());
        double priceVideoCard = Double.parseDouble(scanner.nextLine());
        double priceRAM = Double.parseDouble(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());
        double percentDiscount = Double.parseDouble(scanner.nextLine());

        double priceCPULeva = priceCPU * 1.57;
        double priceVideoCardLeva = priceVideoCard * 1.57;
        double priceRAMLeva = priceRAM * 1.57;

        double totalRAMPrice = priceRAMLeva * ramCount;
        double discountedPriceCPU = priceCPULeva - priceCPULeva * percentDiscount;
        double discountedPriceVideoCard = priceVideoCardLeva - priceVideoCardLeva * percentDiscount;

        double totalSum = totalRAMPrice + discountedPriceCPU + discountedPriceVideoCard;
        System.out.printf("Money needed - %.2f leva.", totalSum);
    }
}
