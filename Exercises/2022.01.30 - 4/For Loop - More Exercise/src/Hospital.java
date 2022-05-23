import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int period = scanner.nextInt();

        int doctorsCount = 7;
        int patientsExamined = 0;
        int patientsPrelocated = 0;
        for (int i = 1; i <= period; i++) {
            int patientsPerDayCount = scanner.nextInt();

            if (i % 3 == 0) {
                if (patientsPrelocated > patientsExamined) {
                    doctorsCount++;
                }
            }
            if (doctorsCount >= patientsPerDayCount) {
                patientsExamined += patientsPerDayCount;
            } else {
                patientsPrelocated += patientsPerDayCount - doctorsCount;
                patientsExamined += doctorsCount;
            }
        }
        System.out.printf("Treated patients: %d.\n", patientsExamined);
        System.out.printf("Untreated patients: %d.", patientsPrelocated);
    }
}
