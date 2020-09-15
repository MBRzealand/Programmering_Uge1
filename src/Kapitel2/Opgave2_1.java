package Kapitel2;

import java.util.Scanner;

class Opgave2_1 {


    static String mileToKm() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter Miles: ");
        double miles = input.nextDouble();
        input.close();


        return (miles + " Miles equals " + (miles * 1.6) + " Kilometers");

    }


    public static void main(String[] args) {

        System.out.println(mileToKm());

    }

}
