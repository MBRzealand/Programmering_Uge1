package Kapitel1;

class Opg1_7 {

    public static void main(String[] args) {

        int count = 1;
        double pi = 4;                             // man kan ændre i < x til hvilken brøk man er nået til så fx i < 5
        double number = 0;                        // ville give 1 - 1/3 + 1/5

        for (double i = 1; i < 13; i += 2) {      // for eksempelvis i < 289 får vi pi til at være 3.14848912...
            //            |-------|                // i opgaven bedes om specifikt op til 1/13 som er eksemplet i koden:
            if (i == 1) {


                number += ((1.0 / i) - (1.0 / (i + 2.0)));  // 2/3
                count++;


            } else if (i > 1 && count % 2 == 0) {
                number += (1.0 / (i + 2.0));    // 2/3 + 1/5
                count++;

            } else {
                number += -(1.0 / (i + 2.0));
                count++;

            }

        }

        pi = pi * number;

        System.out.println(pi);

    }

}
