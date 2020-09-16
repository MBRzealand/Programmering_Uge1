package MoodleOpgaver;

import java.util.Scanner;

class Moms {

    static Scanner input = new Scanner(System.in);

    static String plusDanskMoms() {

        System.out.println("Indtast købspris: ");
        double pris = input.nextDouble();

        double moms = pris * 0.25;

        double momsOmkostninger = (moms * 100) / 100.0;

        return "Moms omkostningerne er: " + momsOmkostninger;

    }

    static String plusTyskMoms() {

        System.out.println("Indtast købspris: ");
        double pris = input.nextDouble();

        double moms = pris * 0.16;

        double momsOmkostninger = (moms * 100) / 100.0;

        return "Moms omkostningerne er: " + momsOmkostninger;

    }

    public static void main(String[] args) {

        System.out.println("Vælg land (Danmark/Tyskland): ");

        String land = input.nextLine();

        if (land.equals("Danmark")) {

            System.out.println(plusDanskMoms());

        } else if (land.equals("Tyskland")) {

            System.out.println(plusTyskMoms());

        } else {

            System.out.println("Country not supported");

        }


    }


}
