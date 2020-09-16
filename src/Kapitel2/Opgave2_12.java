package Kapitel2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

class Opgave2_12 {

    static Scanner input = new Scanner(System.in);
    static NumberFormat decimal = new DecimalFormat("#.###");

    static String runwayLength() {

        System.out.println("Enter speed and acceleration: ");

        String rawInput = input.nextLine();
        String[] inputSplit = rawInput.split(" ");

        double a = Double.parseDouble(inputSplit[1]);
        double v = Double.parseDouble(inputSplit[0]);

        double length = Math.pow(v, 2) / (2 * a);


        return "The minimum runway length for this airplane is " + decimal.format(length);

    }

    public static void main(String[] args) {

        System.out.println(runwayLength());

    }

}
