public class ClockPart2 {
    public static void main(String[] args) {

        for (int hour = 0; hour < 24; hour++) {

            for (int minutes = 0; minutes < 60; minutes++) {
                for (int seconds = 0; seconds < 60; seconds++) {
                    System.out.println(hour + " : " + minutes + " : " + seconds);
                }
            }
        }
    }
}
