import java.util.Scanner;

public class Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wallHeight = Integer.parseInt(scanner.nextLine());
        int wallWidth = Integer.parseInt(scanner.nextLine());
        int percentWindowsDoors = Integer.parseInt(scanner.nextLine());

        int hallArea = 4 * wallHeight * wallWidth;
        double totalAreaForPainting = Math.ceil(hallArea - hallArea * percentWindowsDoors / 100.0);
        double paintedArea = 0;
        String input = scanner.nextLine();
        while (!input.equals("Tired!")) {
            int litersPaint = Integer.parseInt(input);
            paintedArea += litersPaint;

            if (paintedArea >= totalAreaForPainting) {
                break;
            }

            input = scanner.nextLine();

        }

        if (paintedArea == totalAreaForPainting) {
            System.out.println("All walls are painted! Great job, Pesho!");
        } else if (input.equals("Tired!")) {
            System.out.printf("%.0f quadratic m left.", totalAreaForPainting - paintedArea);
        }
        else {
            System.out.printf("All walls are painted and you have %.0f l paint left!",  Math.abs(paintedArea - totalAreaForPainting));
        }
    }
}
