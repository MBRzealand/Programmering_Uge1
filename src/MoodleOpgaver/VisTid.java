package MoodleOpgaver;

import java.util.Scanner;

class VisTid {

    static Scanner input = new Scanner(System.in);

    static String visTid() {

        System.out.print("Indtast et heltal for sekunder: ");

        int sekunder = input.nextInt();
        int minutter = sekunder / 60; // Find minutter in sekunder
        int sekunderTilbage = sekunder % 60; // Sekunder tilbage
        return sekunder + " sekunder er " + minutter +
                " minutter og " + sekunderTilbage + " sekunder";

    }


    public static void main(String[] args) {

        // Prompt the user for input
        System.out.println(visTid());

    }


}
