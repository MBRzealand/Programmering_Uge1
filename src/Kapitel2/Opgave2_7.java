package Kapitel2;

import java.util.Scanner;

class Opgave2_7 {

    static String simplifyMinutes() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter minutes: ");

        int minutes = input.nextInt();
        int years = ((minutes / 60) / 24) / 365;

        int remainder1 = minutes - (years * 60 * 24 * 365);
        int days = (remainder1 / 60) / 24;

        int remainder2 = remainder1 - (days * 60 * 24);
        int hours = remainder2 / 60;

        int remainder3 = remainder2 - hours * 60;


        return (minutes + " Minutes equal: " + years + " Years " + days + " Days " + hours + " Hours " + remainder3 + " minutes");

    }


    public static void main(String[] args) {

        System.out.println(simplifyMinutes());


    }

}

