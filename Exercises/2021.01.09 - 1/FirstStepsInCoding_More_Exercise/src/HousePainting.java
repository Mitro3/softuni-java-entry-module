import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double areaWallsFront = 2 * x * x - 1.2 * 2;
        double areaWallsSide = 2 * (x * y - 1.5 * 1.5);
        double areaWallsTot = areaWallsFront + areaWallsSide;
        double litWalls = areaWallsTot / 3.4;

        double areaRoofFront = x * h;
        double areaRoofSide = 2 * x * y;
        double areaRoofTot = areaRoofFront + areaRoofSide;
        double litRoof = areaRoofTot / 4.3;

        System.out.printf("%.2f %n", litWalls);
        System.out.printf("%.2f %n", litRoof);


    }
}
