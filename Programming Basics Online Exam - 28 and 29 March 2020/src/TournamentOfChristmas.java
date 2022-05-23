import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournamentDaysDuration = Integer.parseInt(scanner.nextLine());

        int countDailyWons = 0;
        int countDailyLosts = 0;
        int countTotalWons = 0;
        int countTotalLosts = 0;
        double moneyDaily = 0;
        double totalMoney = 0;

        for (int i = 0; i < tournamentDaysDuration; i++) {
            String gameName = scanner.nextLine();
            while (!gameName.equals("Finish")) {
                String gameResult = scanner.nextLine();

                if (gameResult.equals("win")) {
                    moneyDaily += 20;
                    countDailyWons++;
                } else if (gameResult.equals("lose")) {
                    countDailyLosts++;
                }
                gameName = scanner.nextLine();
            }
            if (countDailyWons > countDailyLosts) {
                countTotalWons++;
                moneyDaily *= 1.10;
            } else {
                countTotalLosts++;
            }

            countDailyWons = 0;
            countDailyLosts = 0;
            totalMoney += moneyDaily;
            moneyDaily = 0;
        }

        if (countTotalWons > countTotalLosts) {
            totalMoney *= 1.20;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);
        }
    }
}
