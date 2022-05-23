import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int juryCount = Integer.parseInt(scanner.nextLine());

        double juryPointsTotal = academyPoints;
        for (int i = 0; i < juryCount; i++) {
            String juryName = scanner.nextLine();
            double juryPoints = Double.parseDouble(scanner.nextLine());

            juryPointsTotal += juryName.length() * juryPoints / 2;

            if ((juryPointsTotal) > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, (juryPointsTotal));
                break;
            }
        }

        if (juryPointsTotal < 1250.5){
            double diff = 1250.5 - juryPointsTotal;
            System.out.printf("Sorry, %s you need %.1f more!", actorName, diff);
        }

    }
}
