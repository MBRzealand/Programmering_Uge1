package MoodleOpgaver;

import java.util.Scanner;

class UdregnAendring {

    static Scanner input = new Scanner(System.in);

    static void aendring() {

        System.out.print(
                "Indtast et antal i double, for eksempel 11.56: ");
        double antal = input.nextDouble();

        int antalTilbage = (int) (antal * 100);

        int antalEnDollar = antalTilbage / 100;
        antalTilbage = antalTilbage % 100;

        int antalQuarters = antalTilbage / 25;
        antalTilbage = antalTilbage % 25;

        int antalDimes = antalTilbage / 10;
        antalTilbage = antalTilbage % 10;

        int antalNickels = antalTilbage / 5;
        antalTilbage = antalTilbage % 5;

        int antalPennies = antalTilbage;

        System.out.println("Dit antal " + antal + " består af");
        System.out.println("    " + antalEnDollar + " dollars");
        System.out.println("    " + antalQuarters + " quarters ");
        System.out.println("    " + antalDimes + " dimes");
        System.out.println("    " + antalNickels + " nickels");
        System.out.println("    " + antalPennies + " pennies");


    }

    public static void main(String[] args) {

        aendring();

    }
}
