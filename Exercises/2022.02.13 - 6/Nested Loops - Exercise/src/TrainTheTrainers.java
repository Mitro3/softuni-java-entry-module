import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juryNumber = Integer.parseInt(scanner.nextLine());

        double averageGradeFinal = 0;
        int counter = 0;
        String input = scanner.nextLine();

        while (!input.equals("Finish")) {

            double presentationGradeSum = 0;
            for (int i = 0; i < juryNumber; i++) {
                double presentationGrade = Double.parseDouble(scanner.nextLine());
                presentationGradeSum += presentationGrade;
            }

            double presentationAverageGrade = presentationGradeSum / juryNumber;
            System.out.printf("%s - %.2f.%n", input, presentationAverageGrade);
            averageGradeFinal += presentationAverageGrade;

            counter++;

            input = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.", averageGradeFinal / counter);

    }
}
