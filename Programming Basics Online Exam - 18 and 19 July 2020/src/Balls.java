import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int totalPoints = 0;
        int redBalls = 0;
        int orangeBalls = 0;
        int yellowBalls = 0;
        int whiteBalls = 0;
        int otherColors = 0;
        int blackBalls = 0;
        for (int i = 0; i < n; i++) {
            String colorBall = scanner.nextLine();

            switch (colorBall) {
                case "red":
                    totalPoints += 5;
                    redBalls++;
                    break;
                case "orange":
                    totalPoints += 10;
                    orangeBalls++;
                    break;
                case "yellow":
                    totalPoints += 15;
                    yellowBalls++;
                    break;
                case "white":
                    totalPoints += 20;
                    whiteBalls++;
                    break;
                case "black":
                    totalPoints = totalPoints / 2;
                    blackBalls++;
                    break;
                default:
                    totalPoints += 0;
                    otherColors++;
            }
        }

        System.out.println("Total points: " + totalPoints);
        System.out.println("Red balls: " + redBalls);
        System.out.println("Orange balls: " + orangeBalls);
        System.out.println("Yellow balls: " + yellowBalls);
        System.out.println("White balls: " + whiteBalls);
        System.out.println("Other colors picked: " + otherColors);
        System.out.println("Divides from black balls: " + blackBalls);

    }
}
