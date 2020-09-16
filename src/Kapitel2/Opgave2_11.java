package Kapitel2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

class Opgave2_11 {

    static Scanner input = new Scanner(System.in);

    static NumberFormat decimal = new DecimalFormat("#");


    static String popCount() {

        System.out.println("Input how many years ahead you want to calculate population count: ");

        // for at spare regnekræft omregner vi lige birth rate (br), death rate (dr), og immigration rate (ir) til per dag

        int year = input.nextInt();

        double br = (((1.0 / 7.0) * 60) * 60) * 24;
        double dr = (((1.0 / 13.0) * 60) * 60) * 24;
        double ir = (((1.0 / 45.0) * 60) * 60) * 24;

        double population = 312032486;

        for (int i = 0; i <= 365 * year; i++) {
            population += (br + ir) - dr;
        }

        String output = decimal.format(population);

        return "population: " + output;

    }


    public static void main(String[] args) {

        System.out.printf(popCount());
    }


}
