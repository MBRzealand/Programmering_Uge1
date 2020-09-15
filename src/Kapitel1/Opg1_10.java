package Kapitel1;

class Opg1_10 {

    public static void main(String[] args) {

        double seconds = (50 * 60) + 30;
        double km = 15;
        double kmh = ((km / seconds) * 60) * 60;
        double mph = kmh / 1.6;

        System.out.println("km/h\t\t\t\tmph");
        System.out.println(kmh + "\t" + mph);

    }

}
