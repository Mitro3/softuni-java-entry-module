package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double secondsFor1m = Double.parseDouble(scanner.nextLine());

        double secondsTot = distanceInMeters * secondsFor1m;
        double addSeconds = Math.floor(distanceInMeters / 50) * 30;
        double totalTime = secondsTot + addSeconds;
        if (totalTime < recordInSeconds) {
            System.out.printf("Yes! The new record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", Math.abs(recordInSeconds - totalTime));
        }
    }
}
