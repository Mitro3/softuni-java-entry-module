import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();

        double gradeSum = 0;
        int gradeCount = 0;
        int failedCount = 0;
        while (failedCount < 2 && gradeCount < 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4.00) {
                failedCount++;
            } else {
                gradeSum += grade;
                gradeCount++;
            }
        }

        if (failedCount == 2) {
            gradeCount++;
            System.out.printf("%s has been excluded at %d grade", studentName, gradeCount);
        } else {
            double averageGrade = gradeSum / gradeCount;
            System.out.printf("%s graduated. Average grade: %.2f", studentName, averageGrade);
        }
    }
}
