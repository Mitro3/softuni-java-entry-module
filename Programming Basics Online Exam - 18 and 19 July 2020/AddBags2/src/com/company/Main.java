package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double overweightLuggagePrice = Double.parseDouble(scanner.nextLine());
        double luggageWeight = Double.parseDouble(scanner.nextLine());
        int daysToFlight = Integer.parseInt(scanner.nextLine());
        int luggageQuantity = Integer.parseInt(scanner.nextLine());

        double weightFactor = 0;
        if (luggageWeight > 20) {
            weightFactor = 1;
        } else if (luggageWeight >= 10) {
            weightFactor = 0.5;
        } else {
            weightFactor = 0.2;
        }
        double daysFactor = 0;
        if (daysToFlight > 30) {
            daysFactor = 1.1;
        } else if (daysToFlight >= 7) {
            daysFactor = 1.15;
        } else {
            daysFactor = 1.4;
        }
        double priceTotal = overweightLuggagePrice * weightFactor * daysFactor * luggageQuantity;
        System.out.printf("The total price of bags is: %.2f lv. ", priceTotal);
    }
}
