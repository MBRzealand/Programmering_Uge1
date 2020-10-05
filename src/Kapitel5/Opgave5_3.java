package Kapitel5;

import java.util.ArrayList;

class Opgave5_3 {

    static double celsiusToFarenheit(int celsius){

        return ((celsius * 9/5.0) +32);

    }

    static String listLoop() {

        ArrayList<Integer> celsiusList = new ArrayList<>();
        ArrayList<Double> farenheitList = new ArrayList<>();
        String formattedList = "Celsius\t\t\tFarenheit\n";              //initializes list with header

            for (int i = 0; i <= 100; i += 2) { // list of celsius

                celsiusList.add(i);

            }


            for (int i = 0; i <= 100; i += 2) { // list of farenheit

                farenheitList.add(celsiusToFarenheit(i));

            }

            for (int i = 0; i < farenheitList.toArray().length; i++) { // makes table

                formattedList += (celsiusList.get(i) + "\t\t\t\t" + farenheitList.get(i) + "\n");

            }

        return formattedList;



    }

}

class Opgave5_3_Main{

    public static void main(String[] args) {

        System.out.println(Opgave5_3.listLoop());

    }

}


class Opgave5_3_Test{

    static String listLoop2(int celsius) {

        ArrayList<Integer> celsiusList = new ArrayList<>();
        ArrayList<Double> farenheitList = new ArrayList<>();
        String formattedList = "Celsius\t\t\tFarenheit\n";              //initializes list with header

        for (int i = 0; i <= 100; i += 2) {                             // list of celsius

            celsiusList.add(i);

        }


        for (int i = 0; i <= 100; i += 2) {                             // list of farenheit

            farenheitList.add(Opgave5_3.celsiusToFarenheit(i));

        }

        for (int i = celsius; i <= celsius; i++) {                      // makes table - notice only loops once for input variable celsius

            formattedList += (celsiusList.get(celsius/2) + "\t\t\t\t" + farenheitList.get(celsius/2) + "\n");

        }

        return formattedList;



    }

    public static void main(String[] args) {


        // test case 1: input celsius = 0
        //expected output =
        // Celsius			Farenheit
        // 0                32.0

        System.out.println("Testcase 1:");

        if (listLoop2(0).equals("Celsius\t\t\tFarenheit\n0\t\t\t\t32.0")) {
            System.out.println("TEST SUCESSFUL\n");
        } else {
            System.out.println("TEST FAILED\n");
        }

        // test case 2: input celsius = 2
        //expected output =
        // Celsius			Farenheit
        // 2                35.6

        System.out.println("Testcase 2:");

        if (listLoop2(0).equals("Celsius\t\t\tFarenheit\n2\t\t\t\t35.6")) {
            System.out.println("TEST SUCESSFUL\n");
        } else {
            System.out.println("TEST FAILED\n");
        }

        // test case 3: input celsius = 98
        //expected output =
        // Celsius			Farenheit
        // 98               208.4

        System.out.println("Testcase 3:");

        if (listLoop2(0).equals("Celsius\t\t\tFarenheit\n98\t\t\t\t208.4")) {
            System.out.println("TEST SUCESSFUL\n");
        } else {
            System.out.println("TEST FAILED\n");
        }

        // test case 4: input celsius = 100
        //expected output =
        // Celsius			Farenheit
        // 100              212.0

        System.out.println("Testcase 4:");

        if (listLoop2(0).equals("Celsius\t\t\tFarenheit\n100\t\t\t\t212.0")) {
            System.out.println("TEST SUCESSFUL\n");
        } else {
            System.out.println("TEST FAILED\n");
        }

    }

}
