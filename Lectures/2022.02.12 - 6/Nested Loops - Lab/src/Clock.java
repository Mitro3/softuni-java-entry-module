
public class Clock {
    public static void main(String[] args) {

        for (int h = 0; h < 24; h++) {
            for (int m = 0; m < 60; m++) {
                if (m < 10) {
                    System.out.printf("%d:%d%n", h, m);
                } else {
                    System.out.printf("%d:%d%n", h, m);
                }
            }
        }
    }
}
