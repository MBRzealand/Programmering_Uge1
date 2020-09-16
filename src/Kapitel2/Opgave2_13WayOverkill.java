package Kapitel2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

class Opgave2_13WayOverkill {

    static Scanner input = new Scanner(System.in);
    static NumberFormat decimal = new DecimalFormat("#.##");

    static String interest() {

        System.out.println("Enter monthly saving amount, amount of months and yearly interest rate: ");

        String rawInput = input.nextLine();
        String[] inputSplit = rawInput.split(" ");

        int month = Integer.parseInt(inputSplit[1]);
        double monthlySavings = Double.parseDouble(inputSplit[0]);
        double rate = Double.parseDouble(inputSplit[2]);
        double savings = monthlySavings;

        double iRate = (1 + (rate / 12.0));

        if (month == 0) {

            return Double.toString(savings);

        } else if (month == 1) {

            return Double.toString((savings * iRate));

        } else {

            savings = savings * iRate;

            for (int i = 1; i <= month - 1; i++) {

                savings = ((monthlySavings + savings) * iRate);

            }

            return decimal.format(savings);

        }


    }

    public static void main(String[] args) {

        System.out.println(interest());

    }

}
