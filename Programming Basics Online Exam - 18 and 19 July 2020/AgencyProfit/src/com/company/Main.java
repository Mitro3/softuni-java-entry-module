package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String company = scanner.nextLine();
        int ticketsAdults = Integer.parseInt(scanner.nextLine());
        int ticketsKids = Integer.parseInt(scanner.nextLine());
        double priceAdults = Double.parseDouble(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());

        double priceKids = priceAdults * 0.3;
        double priceAdultsTot = priceAdults + tax;
        double priceKidsTot = priceKids + tax;
        double totTickets = priceAdultsTot * ticketsAdults + priceKidsTot * ticketsKids;
        double profit = 0.2 * totTickets;
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", company, profit);

    }
}
