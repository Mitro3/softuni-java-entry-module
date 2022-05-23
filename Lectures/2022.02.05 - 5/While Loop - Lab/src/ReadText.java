import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(!scanner.hasNext("Stop")) {
            String name = scanner.nextLine();
            System.out.println(name);
        }
    }
}
