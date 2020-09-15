package Kapitel1;

class Opg1_11 {

    public static void main(String[] args) {

        // for at spare regnekræft omregner vi lige birth rate (br), death rate (dr), og immigration rate (ir) til per dag

        double br = (((1.0 / 7.0) * 60) * 60) * 24;
        double dr = (((1.0 / 13.0) * 60) * 60) * 24;
        double ir = (((1.0 / 45.0) * 60) * 60) * 24;

        double population = 312032486;

        for (int i = 0; i < 365 * 5; i++) {
            population += (br + ir) - dr;
        }

        System.out.printf("population: %.0f\n", population);
    }


}
