package Kapitel5;

import java.util.ArrayList;
import java.util.List;

class Opgave5_3 {

    static String celsiusToFarenheit(int celsius){

        double farenheit = ((celsius * 9/5.0) +32);

        return celsius + "                 " + farenheit;

    }

    static List tableLoop(){

        List table = 50;


        for (int i = 0; i <= 100; i+=2) {
            table.add(celsiusToFarenheit(i)+"\n");
        }

        table = table.replaceAll(", $", "");

        return table;
    }    // <- den her bracket er sur

}

class Opgave5_3_Main{

    public static void main(String[] args) {

        System.out.println("Celsius        Farenheit");
        System.out.println(Opgave5_3.tableLoop());

    }

}


class Opgave5_3_Test{


}
