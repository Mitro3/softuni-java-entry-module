import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        String packageIncluded = scanner.nextLine();
        String vipDiscount = scanner.nextLine();
        int holidaysCount = scanner.nextInt();

        if (holidaysCount < 1) {
            System.out.println("Days must be positive number!");
            return;
        }

        if (getAdditionalDiscount(holidaysCount)) {
            holidaysCount --;
        }

        if (!isValidCity(city) || !isValidPackage(packageIncluded)) {
            System.out.println("Invalid input!");
        } else {
            double totalPrice = holidaysCount * getPrice(city, packageIncluded) * getVIPDiscount(city, packageIncluded, vipDiscount);
            System.out.printf("The price is %.2flv! Have a nice time!", totalPrice);
        }

    }

    static boolean isValidCity (String city) {
        switch (city) {
            case "Bansko":
            case "Borovets":
            case "Varna":
            case "Burgas":
                return true;
            default:
                return false;
        }
    }

    static boolean isValidPackage (String packageIncluded) {
        switch (packageIncluded) {
            case "noEquipment":
            case "withEquipment":
            case "noBreakfast":
            case "withBreakfast":
                return true;
            default:
                return false;
        }
    }

    static boolean getAdditionalDiscount (int holidaysCount) {
        if (holidaysCount > 7) {
            return true;
        } else {
            return false;
        }
    }

    static double getVIPDiscount (String city, String packageIncluded, String vipDiscount) {
        double discount = 1;
        if (vipDiscount.equals("yes")) {
            switch (city) {
                case "Bansko":
                case "Borovets":
                    switch (packageIncluded) {
                        case "noEquipment":
                            discount = 0.95;
                            break;
                        case "withEquipment":
                            discount = 0.90;
                            break;
                    }
                case "Varna":
                case "Burgas":
                    switch (packageIncluded) {
                        case "noBreakfast":
                            discount = 0.93;
                            break;
                        case "withBreakfast":
                            discount = 0.88;
                            break;
                    }
            }
            return discount;
        } else {
            return discount;
        }
    }


    static double getPrice (String city, String packageIncluded) {
        double price = 0;
        switch (city) {
            case "Bansko":
            case "Borovets":
                switch (packageIncluded) {
                    case "noEquipment":
                        price = 80;
                        break;
                    case "withEquipment":
                        price = 100;
                        break;
                }
            case "Varna":
            case "Burgas":
                switch (packageIncluded) {
                    case "noBreakfast":
                        price = 100;
                        break;
                    case "withBreakfast":
                        price = 130;
                }
        }
        return price;
    }
}
