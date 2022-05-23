import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int V = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());

        double filledVolume = (P1 + P2) * H;
        double percentFilledTotal = filledVolume / V * 100;
        double percentFilledP1 = P1 * H / filledVolume * 100;
        double percentFilledP2 = P2 * H / filledVolume * 100;
        if (filledVolume <= V) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%", percentFilledTotal, percentFilledP1, percentFilledP2);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", H, filledVolume - V);
        }
    }
}
