package com.company;

import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double overweightLuggagePrice = Double.parseDouble(scanner.nextLine());
        double luggageWeight = Double.parseDouble(scanner.nextLine());
        int daysToFlight = Integer.parseInt(scanner.nextLine());
        int luggageQuantity = Integer.parseInt(scanner.nextLine());

        double weightFactor = getWeightFactor(luggageWeight);
        double daysFactor = getDaysFactor(daysToFlight);
        double priceTotal = overweightLuggagePrice * weightFactor * daysFactor * luggageQuantity;
        System.out.printf("The total price of bags is: %.2f lv. ", priceTotal);
    }

    static double getWeightFactor (double luggageWeight) {
        if (luggageWeight > 20) {
            return 1;
        } else if (luggageWeight >= 10) {
            return 0.5;
        } else {
            return 0.2;
        }
    }

    static double getDaysFactor (double daysToFlight) {
        if (daysToFlight > 30) {
            return 1.1;
        } else if (daysToFlight >= 7) {
            return 1.15;
        } else {
            return 1.4;
        }
    }
}
