import java.util.Scanner;

public class BonusPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        double bonusPoints = getBonusPointsFactor(num);
        if (num % 2 == 0){
            bonusPoints += 1;
        } else if (num % 10 == 5) {
            bonusPoints += 2;
        }
        System.out.println(bonusPoints);
        System.out.println(bonusPoints + num);
    }

    static double getBonusPointsFactor(double num) {
        double bonusPoints = 0;
        if (num <= 100) {
            bonusPoints = 5;
        } else if (num > 100 && num <= 1000) {
            bonusPoints = 0.2 * num;
        } else if (num > 1000) {
            bonusPoints = 0.1 * num;
        }
        return bonusPoints;
    }
}
