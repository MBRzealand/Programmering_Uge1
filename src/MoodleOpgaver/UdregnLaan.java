package MoodleOpgaver;

import java.util.Scanner;

class UdregnLaan {

    static Scanner input = new Scanner(System.in);

    static void uLaan() {

        System.out.print("Indtast årlig rente, for eksempel 8,25: ");
        double aarligRentesats = input.nextDouble();

        double maanedligRentesats = aarligRentesats / 1200;

        System.out.print(
                "Indtast antal år som heltal, for eksempel 5: ");
        int antalAar = input.nextInt();

        System.out.print("Indtast beløb, for eksempel 120000.95: ");
        double laanBeloeb = input.nextDouble();

        double maanedligBetaling = laanBeloeb * maanedligRentesats / (1
                - 1 / Math.pow(1 + maanedligRentesats, antalAar * 12));
        double totalBetaling = maanedligBetaling * antalAar * 12;

        System.out.println("Den månedlige betaling er $" +
                (int) (maanedligBetaling * 100) / 100.0);

        System.out.println("Den samlede betaling er $" +
                (int) (totalBetaling * 100) / 100.0);
    }


    public static void main(String[] args) {

        uLaan();

    }


}
