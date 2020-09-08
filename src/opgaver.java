
import java.lang.Math;

class Opg1_1{

    public static void main(String[]args){
        System.out.println("Welcome to Java");
        System.out.println("Learning Java Now");
        System.out.println("Programming is fun");
        }
}

class Opg1_2{

    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("I love Java");
            i += 1;
        }
    }
}

class Opg1_3{

    // Tror de prøver skrive JAVA i bogen, men står grimt og utydeligt så har gjort det lidt pænere:

    public static void main(String[] args) {

        System.out.println("  J   aaa  v     v  aaa  ");
        System.out.println("  J  a   a  v   v  a   a ");
        System.out.println("  J  a a a   v v   a a a ");
        System.out.println("J    a   a    v    a   a ");

    }

}


class Opg1_4{

    public static void main(String[] args) {

        int[] Array1 = {1, 2, 3, 4};
        int[] Array2 = new int[Array1.length];
        int[] Array3 = new int[Array1.length];
        int[] Array4 = new int[Array1.length];

        for (int i = 0; i < Array1.length; i++) {
            Array2[i] = (int) Math.pow(Array1[i], 2);
            Array3[i] = (int) Math.pow(Array1[i], 3);
            Array4[i] = (int) Math.pow(Array1[i], 4);
        }

        System.out.println("a\t\ta^2\t\ta^3\t\ta^4");

        for(int i=0; i < 4; i++){

            System.out.println(Array1[i]+"\t\t"+Array2[i]+"\t\t"+Array3[i]+"\t\t"+Array4[i]);

        }
    }
}

class Opg1_5{

    public static void main(String[] args) {

        System.out.println(((7.5*6.5)-(4.5*3.0))/(47.5-5.5));

    }

}

class Opg1_6{

    public static void main(String[] args) {

        int number = 1;

        for (int i = 2; i <= 10 ; i++) {
            number += i;

        }

        System.out.println(number);

    }

}

class Opg1_7{

    public static void main(String[] args) {

        int count = 1;
        double pi = 4;                             // man kan ændre i < x til hvilken brøk man er nået til så fx i < 5
        double number = 0 ;                        // ville give 1 - 1/3 + 1/5

        for (double i = 1; i < 13; i += 2) {      // for eksempelvis i < 289 får vi pi til at være 3.14848912...
            //            |-------|                // i opgaven bedes om specifikt op til 1/13 som er eksemplet i koden:
          if (i == 1) {


                number += ((1.0 / i) - (1.0 / (i + 2.0)));  // 2/3
                count++;


            } else if (i > 1 && count%2 == 0){
                number += (1.0 / (i + 2.0));    // 2/3 + 1/5
                count++;

            } else {
                number += -(1.0 / (i + 2.0));
                count++;

            }

        }

        pi = pi*number;

        System.out.println(pi);

    }

}

class Opg1_8{

    public static void main(String[] args) {

            double perimeter = 2.0 * 6.5 * 3.14159;
            double area = 6.5 * 6.5 * 3.14159;

            System.out.println("perimeter\t\t\tarea");
            System.out.println(perimeter+"\t"+area);



    }

}

class Opg1_9{

    public static void main(String[] args) {

        double area = 5.3 * 8.6;
        double perimeter = 2.0 * (5.3 + 8.6);

        System.out.println("area\tperimeter");
        System.out.println(area+"\t"+perimeter);

    }

}

class Opg1_10{

    public static void main(String[] args) {

        double seconds = (50*60) + 30;
        double km = 15;
        double kmh = ((km/seconds)*60)*60;
        double mph = kmh/1.6;

        System.out.println("km/h\t\t\t\tmph");
        System.out.println(kmh+"\t"+mph);

    }

}

class Opg1_11{

    public static void main(String[] args) {

        // for at spare regnekræft omregner vi lige birth rate (br), death rate (dr), og immigration rate (ir) til per dag

        double br = (((1.0 / 7.0) * 60) * 60) * 24;
        double dr = (((1.0 / 13.0) * 60) * 60) * 24;
        double ir = (((1.0 / 45.0) * 60) * 60) * 24;

        double population = 312032486;

        for (int i = 0; i < 365*5; i++) {
            population += (br + ir) - dr;
        }

        System.out.printf("population: %.0f\n", population);
    }


}

class Opg1_12{

    public static void main(String[] args) {

        double seconds = (100*60) + 35;
        double miles = 24;
        double mph = ((miles/seconds)*60)*60;
        double kmh = mph*1.6;

        System.out.println("mph\t\t\t\t\tkm/h");
        System.out.println(mph+"\t"+kmh);

    }

}
