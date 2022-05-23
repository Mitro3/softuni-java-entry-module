
import java.util.Scanner;

public class ChangeBureau {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bitcoins = Integer.parseInt(scanner.nextLine());
        double yuans = Double.parseDouble(scanner.nextLine());
        double comissionAmount = Double.parseDouble(scanner.nextLine());

        double bitcToLeva = bitcoins * 1168;
        double yuansToDollars = yuans * 0.15;
        double dollarsToLeva = yuansToDollars * 1.76;
        double euroToLeva =  (bitcToLeva + dollarsToLeva) / 1.95;
        double comission = comissionAmount * (euroToLeva) / 100;
        double sum = euroToLeva - comission;
        System.out.printf("%.2f", sum);
    }
}
