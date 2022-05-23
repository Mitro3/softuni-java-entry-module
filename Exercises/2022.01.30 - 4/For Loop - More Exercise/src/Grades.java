import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsCount = scanner.nextInt();

        int failGradeCount = 0;
        int topGradeCount = 0;
        int fourGradeCount = 0;
        int threeGradeCount = 0;
        double gradesSum = 0;
        for (int i = 0; i < studentsCount; i++) {
            double grade = scanner.nextDouble();

            if (grade >= 2.00 && grade <= 2.99) {
                failGradeCount++;
                gradesSum += grade;
            } else if (grade >= 3.00 && grade <= 3.99) {
                threeGradeCount++;
                gradesSum += grade;
            } else if (grade >= 4.00 && grade <= 4.99) {
                fourGradeCount++;
                gradesSum += grade;
            } else if (grade >= 5.00) {
                topGradeCount++;
                gradesSum += grade;
            }
        }

        double topStudentsPercent = 100.0 * topGradeCount / studentsCount;
        double fourStudentsPercent = 100.0 * fourGradeCount / studentsCount;
        double threeStudentsPercent = 100.0 * threeGradeCount / studentsCount;
        double failStudentsPercent = 100.0 * failGradeCount / studentsCount;
        double averageGrade = gradesSum / studentsCount;
        System.out.printf("Top students: %.2f%%\n", topStudentsPercent);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", fourStudentsPercent);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", threeStudentsPercent);
        System.out.printf("Fail: %.2f%%\n", failStudentsPercent);
        System.out.printf("Average: %.2f", averageGrade);
    }
}
