import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();

        switch (product) {
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                product = "fruit";
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                product = "vegetable";
                break;
            default:
                product = "unknown";
        }
        System.out.println(product);
    }
}
