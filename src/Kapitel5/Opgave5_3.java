package Kapitel5;

class Opgave5_3 {

    static String celsiusToFarenheit(double celsius){

        double farenheit = ((celsius * 9/5.0) +32);

        return celsius + "                 " + farenheit;

    }

    static String tableLoop(){

        for (int i = 0; i <= 100; i+=2) {
            return celsiusToFarenheit(i);
        }

    }    // <- den her bracket er sur

}

class Opgave5_3_Main{

    public static void main(String[] args) {

        System.out.println("Celsius        Farenheit");
        System.out.println(Opgave5_3.celsiusToFarenheit(0));

    }

}
