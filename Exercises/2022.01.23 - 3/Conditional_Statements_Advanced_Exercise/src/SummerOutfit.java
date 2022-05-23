import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degrees = scanner.nextInt();
        scanner.nextLine();
        String timeOfDay = scanner.nextLine();

        String outfitType = null;
        String shoesType = null;
        if (degrees >= 10 && degrees <= 18) {
            switch (timeOfDay) {
                case "Morning":
                    outfitType = "Sweatshirt";
                    shoesType = "Sneakers";
                    break;
                case "Afternoon":
                case "Evening":
                    outfitType = "Shirt";
                    shoesType = "Moccasins";
                    break;
            }
        } else if (degrees > 18 && degrees <= 24) {
            switch (timeOfDay) {
                case "Morning":
                case "Evening":
                    outfitType = "Shirt";
                    shoesType = "Moccasins";
                    break;
                case "Afternoon":
                    outfitType = "T-Shirt";
                    shoesType = "Sandals";
                    break;
            }
        }  else if (degrees >= 25) {
            switch (timeOfDay) {
                case "Morning":
                    outfitType = "T-Shirt";
                    shoesType = "Sandals";
                    break;
                case "Afternoon":
                    outfitType = "Swim Suit";
                    shoesType = "Barefoot";
                    break;
                case "Evening":
                    outfitType = "Shirt";
                    shoesType = "Moccasins";
                    break;
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfitType, shoesType);
    }
}
