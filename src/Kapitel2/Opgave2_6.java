package Kapitel2;

import java.util.Scanner;

class Opgave2_6 {

    static String digitMultiply() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter integer: ");
        String number = input.nextLine();
        String[] numberSplit = number.split("");

        int intProduct = 1;

        for (int i = 0; i < numberSplit.length; i++) {

            intProduct *= Integer.parseInt(numberSplit[i]);

        }

        String output = ("If you multiply the individual numbers of " + number + "\nYou get: " + intProduct);
        return output;

    }


    public static void main(String[] args) {

        System.out.printf(digitMultiply());


    }

}
