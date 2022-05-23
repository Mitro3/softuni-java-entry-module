import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int p1Count = 0;
        int p2Count = 0;
        int p3Count = 0;
        int p4Count = 0;
        int p5Count = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num < 200) {
                p1Count++;
            } else if (num <= 399) {
                p2Count++;
            } else if (num <= 599) {
                p3Count++;
            } else if (num <= 799) {
                p4Count++;
            } else {
                p5Count++;
            }
        }
        double p1 = p1Count * 100.0 / n ;
        double p2 = p2Count * 100.0 / n ;
        double p3 = p3Count * 100.0 / n ;
        double p4 = p4Count * 100.0 / n ;
        double p5 = p5Count * 100.0 / n ;

        System.out.printf("%.2f%%\n", p1);
        System.out.printf("%.2f%%\n", p2);
        System.out.printf("%.2f%%\n", p3);
        System.out.printf("%.2f%%\n", p4);
        System.out.printf("%.2f%%\n", p5);
    }
}
