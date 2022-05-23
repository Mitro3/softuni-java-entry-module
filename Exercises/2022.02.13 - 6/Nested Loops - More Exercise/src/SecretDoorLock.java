import java.util.Scanner;

public class SecretDoorLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNumberHundreds = Integer.parseInt(scanner.nextLine());
        int maxNumberDecimals = Integer.parseInt(scanner.nextLine());
        int maxNumberUnits = Integer.parseInt(scanner.nextLine());

        boolean isHundredsAndUnitsEven = false;
        boolean isDecimalsPrime = false;



        for (int hundreds = 1; hundreds <= maxNumberHundreds; hundreds++) {
            for (int decimals = 2; decimals <= maxNumberDecimals; decimals++) {
                for (int units = 1; units <= maxNumberUnits; units++) {

                    if ((hundreds % 2 == 0) && (units % 2 == 0)) {
                        isHundredsAndUnitsEven = true;
                    } else {
                        isHundredsAndUnitsEven = false;
                    }

                    int divider = 0;
                    for (int i = 1; i <= decimals; i++) {
                        if (decimals % i == 0) {
                            divider++;
                        }
                    }
                    if (divider == 2) {
                        isDecimalsPrime = true;
                    } else {
                        isDecimalsPrime = false;
                    }

                    if (isHundredsAndUnitsEven && isDecimalsPrime) {
                        System.out.println(hundreds + " " + decimals + " " + units + " ");
                    }



                }
            }
        }
    }
}
