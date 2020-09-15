package Kapitel1;

class Opg1_12 {

    public static void main(String[] args) {

        double seconds = (100 * 60) + 35;
        double miles = 24;
        double mph = ((miles / seconds) * 60) * 60;
        double kmh = mph * 1.6;

        System.out.println("mph\t\t\t\t\tkm/h");
        System.out.println(mph + "\t" + kmh);

    }

}
