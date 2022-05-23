import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cargoCount = scanner.nextInt();

        int pricePerTon = 0;
        int tonnageCargoTotal = 0;
        int tonnageByMicrobusCount = 0;
        int tonnageByTruckCount = 0;
        int tonnageByTrainCount = 0;
        for (int i = 0; i < cargoCount; i++) {
            int tonnageCargo = scanner.nextInt();

            if (tonnageCargo <= 3) {
                pricePerTon += tonnageCargo * 200;
                tonnageByMicrobusCount += tonnageCargo;
            } else if (tonnageCargo <= 11) {
                pricePerTon += tonnageCargo * 175;
                tonnageByTruckCount += tonnageCargo;
            } else {
                pricePerTon += tonnageCargo * 120;
                tonnageByTrainCount += tonnageCargo;
            }

            tonnageCargoTotal += tonnageCargo;
        }

        double averagePricePerTon = 1.0 * pricePerTon / tonnageCargoTotal;
        double percentCargoByMicrobus = 100.0 * tonnageByMicrobusCount / tonnageCargoTotal;
        double percentCargoByTruck = 100.0 * tonnageByTruckCount / tonnageCargoTotal;
        double percentCargoByTrain = 100.0 * tonnageByTrainCount / tonnageCargoTotal;

        System.out.printf("%.2f\n", averagePricePerTon);
        System.out.printf("%.2f%%\n", percentCargoByMicrobus);
        System.out.printf("%.2f%%\n", percentCargoByTruck);
        System.out.printf("%.2f%%\n", percentCargoByTrain);
    }
}
