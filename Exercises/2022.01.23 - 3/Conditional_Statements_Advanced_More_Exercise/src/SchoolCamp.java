import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        String groupGender = scanner.nextLine();
        int studentsCount = scanner.nextInt();
        int nightCount = scanner.nextInt();

        double price = 0;
        if (groupGender.equals("boys") || groupGender.equals("girls")) {
            switch (season) {
                case "Winter":
                    price = 9.60;
                    break;
                case "Spring":
                    price = 7.20;
                    break;
                case "Summer":
                    price = 15;
                    break;
            }
        } else if (groupGender.equals("mixed")) {
            switch (season) {
                case "Winter":
                    price = 10;
                    break;
                case "Spring":
                    price = 9.50;
                    break;
                case "Summer":
                    price = 20;
                    break;
            }
        }
        double totalPrice = studentsCount * nightCount * price * getDiscount(studentsCount);
        String sportType = getSportType(season, groupGender);
        System.out.printf("%s %.2f lv.", sportType, totalPrice);
    }

    static double getDiscount (int studentsCount) {
        if (studentsCount >= 50) {
            return 0.50;
        } else if (studentsCount >= 20) {
            return 0.85;
        } else if (studentsCount >= 10) {
            return 0.95;
        } else {
            return 1.00;
        }
    }

    static String getSportType (String season, String groupGender) {
        String sportType = null;
        if (season.equals("Winter")) {
            switch (groupGender) {
                case "girls":
                    sportType = "Gymnastics";
                    break;
                case "boys":
                    sportType = "Judo";
                    break;
                case "mixed":
                    sportType = "Ski";
                    break;
            }
        } else if (season.equals("Spring")) {
            switch (groupGender) {
                case "girls":
                    sportType = "Athletics";
                    break;
                case "boys":
                    sportType = "Tennis";
                    break;
                case "mixed":
                    sportType = "Cycling";
                    break;
            }
        } else if (season.equals("Summer")) {
            switch (groupGender) {
                case "girls":
                    sportType = "Volleyball";
                    break;
                case "boys":
                    sportType = "Football";
                    break;
                case "mixed":
                    sportType = "Swimming";
                    break;
            }
        }
        return sportType;
    }
}
