import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unsatisfyingGradesNumber = Integer.parseInt(scanner.nextLine());

        double gradesSum = 0;
        int problemsCount = 0;
        int poorGradesCount = 0;
        String lastProblem = "";
        boolean isUnsatisfied = false;
        String input = scanner.nextLine();

        while(!input.equals("Enough")) {
            String problemName = input;
            int currentGrade = Integer.parseInt(scanner.nextLine());

            gradesSum += currentGrade;
            problemsCount++;
            lastProblem = problemName;

            if (currentGrade <= 4) {
                poorGradesCount++;
            }
            if (poorGradesCount == unsatisfyingGradesNumber) {
                System.out.printf("You need a break, %d poor grades.", poorGradesCount);
                isUnsatisfied = true;
                break;
            }

            input = scanner.nextLine();
        }

        if (!isUnsatisfied) {
            System.out.printf("Average score: %.2f%n", gradesSum / problemsCount);
            System.out.printf("Number of problems: %d%n", problemsCount);
            System.out.printf("Last problem: %s", lastProblem);
        }

    }
}
