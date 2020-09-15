package Kapitel1;

class Opg1_13 {

    public static void main(String[] args) {

        //  [ a  b ]
        //  [ c  d ]

        //  [ 3.4x  50.2y ]
        //  [             ]
        //  [             ]
        //  [ 2.1x  0.55y ]

        // ax + by = e  ->  e = 44.5
        // cx + dy = f  ->  f = 5.9

        // x = (ed - bf)/(ad - bc)
        // y = (af - ec)/(ad - bc)

        // deraf:

        // x = ( (44.5*0.55) - (50.2*5.9) ) / ( (3.4*0.55) - (50.2*2.1) )
        // y = ( (3.4*5.9) - (44.5*2.1) )  / ( (3.4*0.55) - (50.2*2.1) ) )


        double x = ((44.5 * 0.55) - (50.2 * 5.9)) / ((3.4 * 0.55) - (50.2 * 2.1));
        double y = ((3.4 * 5.9) - (44.5 * 2.1)) / ((3.4 * 0.55) - (50.2 * 2.1));

        // det = ad - bc


        double det = 3.4 * 0.55 - 55.2 * 2.1;

        System.out.println("x value:\t\t" + x);
        System.out.println("y value:\t\t" + y);
        System.out.println("determinant:\t" + det);
    }

}
