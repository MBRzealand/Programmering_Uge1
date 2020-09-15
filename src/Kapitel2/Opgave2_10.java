package Kapitel2;

import java.util.Scanner;

class Opgave2_10 {

    static String energy() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of water in kilograms: ");
        double water = input.nextDouble();

        System.out.println("Enter the initial temperature in celsius: ");
        double startTemp = input.nextDouble();

        System.out.println("Enter the final temperature in celsius: ");
        double endTemp = input.nextDouble();

        double energy = water * (endTemp - startTemp) * 4184;

        return "\nThe energy needed is: " + energy;

    }

    public static void main(String[] args) {

        System.out.println(energy());

    }

}
