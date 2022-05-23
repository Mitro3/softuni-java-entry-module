import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int paintedEggsQuantity = Integer.parseInt(scanner.nextLine());
        int redEggsCount = 0;
        int orangeEggsCount = 0;
        int blueEggsCount = 0;
        int greenEggsCount = 0;
        int maxEggs = Integer.MIN_VALUE;
        String maxEggsColor = "";


        for (int i = 0; i < paintedEggsQuantity; i++) {
            String eggColor = scanner.nextLine();

            switch (eggColor) {
                case "red":
                    redEggsCount++;
                    break;
                case "orange":
                    orangeEggsCount++;
                    break;
                case "blue":
                    blueEggsCount++;
                    break;
                case "green":
                    greenEggsCount++;
            }

            if (redEggsCount >= maxEggs) {
                maxEggs = redEggsCount;
                maxEggsColor = "red";
            }
            if (orangeEggsCount >= maxEggs) {
                maxEggs = orangeEggsCount;
                maxEggsColor = "orange";
            }
            if (blueEggsCount >= maxEggs) {
                maxEggs = blueEggsCount;
                maxEggsColor = "blue";
            }
            if (greenEggsCount >= maxEggs) {
                maxEggs = greenEggsCount;
                maxEggsColor = "green";

            }
        }

        System.out.printf("Red eggs: %d%n", redEggsCount);
        System.out.printf("Orange eggs: %d%n", orangeEggsCount);
        System.out.printf("Blue eggs: %d%n", blueEggsCount);
        System.out.printf("Green eggs: %d%n", greenEggsCount);
        System.out.printf("Max eggs: %d -> %s", maxEggs, maxEggsColor);

    }
}
