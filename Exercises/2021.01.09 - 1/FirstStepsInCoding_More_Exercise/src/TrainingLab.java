import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double width = h * 100 - 100;
        double height = w * 100;
        double widthPlaces = Math.floor(width / 70);
//        System.out.println(widthPlaces);
        double heightPlaces = Math.floor(height / 120);
//        System.out.println(heightPlaces);
        double totalPlaces = widthPlaces * heightPlaces - 3;
        System.out.println(totalPlaces);
    }
}
