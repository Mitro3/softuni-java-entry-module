package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceLuggAbove20kg = Double.parseDouble(scanner.nextLine());
        double kgLugg = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int luggQuantity = Integer.parseInt(scanner.nextLine());

        double priceLugg10to20 = priceLuggAbove20kg * 0.5;
        double priceLuggBelow10 = priceLuggAbove20kg * 0.2;
        double priceTot = 0;
        if (kgLugg < 10 && kgLugg >= 0) {
            priceTot = priceLuggBelow10;
        } else if (kgLugg >= 10 && kgLugg <= 20){
            priceTot = priceLugg10to20;
        } else if (kgLugg > 20) {
            priceTot = priceLuggAbove20kg;
        }
        if (days < 7 && days > 0) {
            priceTot = priceTot * 1.4;
        } else if (days >= 7 && days <= 30) {
            priceTot = priceTot * 1.15;
        } else if (days > 30) {
            priceTot = priceTot * 1.1;
        }
//        if (kgLugg < 10 && kgLugg >=0) {
//            if (days <7 && days >0) {
//                priceTot = priceLuggBelow10 * 1.4;
//            } else if (days >= 7 && days <= 30){
//                priceTot = priceLuggBelow10 * 1.15;
//            } else if (days > 30) {
//                priceTot = priceLuggBelow10 * 1.1;
//            }
//        } else if (kgLugg >=10 && kgLugg <= 20) {
//            if (days <7 && days >0) {
//                priceTot = priceLugg10to20 * 1.4;
//            } else if (days >= 7 && days <= 30){
//                priceTot = priceLugg10to20 * 1.15;
//            } else if (days > 30) {
//                priceTot = priceLugg10to20 * 1.1;
//            }
//        } else if (kgLugg > 20) {
//            if (days <7 && days >0) {
//                priceTot = priceLuggAbove20kg * 1.4;
//            } else if (days >= 7 && days <= 30){
//                priceTot = priceLuggAbove20kg * 1.15;
//            } else if (days > 30) {
//                priceTot = priceLuggAbove20kg * 1.1;
//            }
//        }
        double sum = priceTot * luggQuantity;
        System.out.printf("The total price of bags is: %.2f lv. ", sum);
    }
}
