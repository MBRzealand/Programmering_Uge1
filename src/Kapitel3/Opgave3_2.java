package Kapitel3;

import java.util.Scanner;

class Opgave3_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int int1 = (int) (Math.random() * 9);
        int int2 = (int) (Math.random() * 9);
        int int3 = (int) (Math.random() * 9);
        System.out.println("the randomly generated numbers are: " + int1 + " " + int2 + " " + int3 + " guess their product:");
        int guess = input.nextInt();
        System.out.println(multiplicationGame(guess, int1, int2, int3));

    }


    static String multiplicationGame(int guess, int int1, int int2, int int3) {

        if ((int1 * int2 * int3) == guess) {

            return "You're big brain";

        } else {

            return "Your math is weak";

        }

    }

}
