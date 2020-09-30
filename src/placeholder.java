import java.util.Scanner;
import java.lang.Math;

class placeholder {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i = i++ ) {

            i = i + 4;
            System.out.println(i);
        }

    }

}


class Opgave3_3{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c, d, e, f: ");
        String rawData = input.nextLine();
        String[] splitData = rawData.split(" ");
        System.out.println(linearEquation(splitData));

    }

    static String linearEquation(String[] splitData){

        double a = Double.parseDouble(splitData[0]);
        double b = Double.parseDouble(splitData[1]);
        double c = Double.parseDouble(splitData[2]);
        double d = Double.parseDouble(splitData[3]);
        double e = Double.parseDouble(splitData[4]);
        double f = Double.parseDouble(splitData[5]);

        double x = ((e*d)-(b*f))/((a*d)-(b*c));
        double y = ((a*f)-(e*c))/((a*d)-(b*c));

        if(((a*d)-(b*c)) == 0) {
            return "x is " + x + " and y is " + y;

        }else{
            return "the equation has no solution";
        }

    }

}


