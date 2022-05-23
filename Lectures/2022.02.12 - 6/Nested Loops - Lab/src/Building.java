import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floorsQuantity = Integer.parseInt(scanner.nextLine());
        int roomsQuantity = Integer.parseInt(scanner.nextLine());

        String abbreviationApartmentOrOffice = "";

        for (int floor = floorsQuantity; floor >= 1; floor--) {

            if (floor == floorsQuantity) {
                abbreviationApartmentOrOffice = "L";
            } else if (floor % 2 == 0) {
                abbreviationApartmentOrOffice = "O";
            } else {
                abbreviationApartmentOrOffice = "A";
            }

            for (int room = 0; room < roomsQuantity; room++) {
                if (room != (roomsQuantity - 1)) {
                    System.out.print(abbreviationApartmentOrOffice + floor + room + " ");
                } else {
                    System.out.println(abbreviationApartmentOrOffice + floor + room);
                }
            }
        }
    }
}