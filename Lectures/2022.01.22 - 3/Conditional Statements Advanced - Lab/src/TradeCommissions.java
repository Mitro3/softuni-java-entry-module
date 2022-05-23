import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double salesQuantity = Double.parseDouble(scanner.nextLine());

        double commission = getCommission(city,salesQuantity);
        if (commission != -1) {
            System.out.printf("%.2f", commission * salesQuantity / 100);
        }

    }

    static double getMinCommissionForCity(String city) {
        switch (city) {
            case "Sofia":
                return 5;
            case "Varna":
                return 4.5;
            case "Plovdiv":
               return  5.5;
            default:
                System.out.println("error");
                return -1;
        }
    }

    static double getSecondCommissionForCity(String city) {
        switch (city) {
            case "Sofia":
                return 7;
            case "Varna":
                return 7.5;
            case "Plovdiv":
                return  8;
            default:
                System.out.println("error");
                return -1;
        }
    }

    static double getThirdCommissionForCity(String city) {
        switch (city) {
            case "Sofia":
                return 8;
            case "Varna":
                return 10;
            case "Plovdiv":
                return 12;
            default:
                System.out.println("error");
                return -1;
        }
    }

    static double getMaxCommissionForCity(String city) {
        switch (city) {
            case "Sofia":
                return 12;
            case "Varna":
                return 13;
            case "Plovdiv":
                return  14.5;
            default:
                System.out.println("error");
                return -1;
        }
    }

    static double getCommission (String city, double salesQuantity) {
        if (salesQuantity >= 0 && salesQuantity <= 500) {
            return getMinCommissionForCity(city);
        } else if (salesQuantity > 500 && salesQuantity <= 1000) {
            return getSecondCommissionForCity(city);
        } else if (salesQuantity > 1000 && salesQuantity <= 10000) {
            return getThirdCommissionForCity(city);
        } else if (salesQuantity > 10000) {
            return getMaxCommissionForCity(city);
        } else {
            System.out.println("error");
            return -1;
        }
    }
}
