package MoodleOpgaver;

import java.util.Scanner;

class FarenheitTilCelsius {

    static Scanner input = new Scanner(System.in);

    static String fTilC() {

        System.out.print("Indtast grader i Fahrenheit: ");

        double fahrenheit = input.nextDouble();
        double celsius = (5.0 / 9) * (fahrenheit - 32);

        return "Fahrenheit " + fahrenheit + " er " +
                celsius + " i Celsius";

    }

    public static void main(String[] args) {

        System.out.println(fTilC());


    }


}
