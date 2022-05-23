import java.util.Scanner;

public class P_04_Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine());

        int failGradeStudentsCount = 0;
        int threeGradeStudentsCount = 0;
        int fourStudentsCount = 0;
        int topGradeStudentsCount = 0;
        double totalGradeSum = 0;

        for (int i = 1; i <= studentsCount; i++) {
            double currentGrade = Double.parseDouble(scanner.nextLine());

            if (currentGrade >= 0 && currentGrade < 3) {
                failGradeStudentsCount++;
            } else if (currentGrade < 4) {
                threeGradeStudentsCount++;
            } else if (currentGrade < 5) {
                fourStudentsCount++;
            } else  {
                topGradeStudentsCount++;
            }
            totalGradeSum += currentGrade;
        }

        double percentFailedStudents = 100.0 * failGradeStudentsCount / studentsCount;
        double percentThreeGradeStudents = 100.0 * threeGradeStudentsCount / studentsCount;
        double percentFourGradeStudents = 100.0 * fourStudentsCount/ studentsCount;
        double percentTopStudents = 100.0 * topGradeStudentsCount / studentsCount;
        double averageGrade = totalGradeSum / studentsCount;

        System.out.printf("Top students: %.2f%%%n", percentTopStudents);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", percentFourGradeStudents);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", percentThreeGradeStudents);
        System.out.printf("Fail: %.2f%%%n", percentFailedStudents);
        System.out.printf("Average: %.2f", averageGrade);


    }
}
