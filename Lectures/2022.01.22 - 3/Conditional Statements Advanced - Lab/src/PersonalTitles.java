import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        String title = new String();
        if (gender.equals("m")) {
            if (age >= 16) {
                title = "Mr.";
            } else {
                title = "Master";
            }
        } else if (gender.equals("f")) {
            if (age >= 16) {
                title = "Ms.";
            } else {
                title = "Miss";
            }
        }
        System.out.println(title);
    }
}
