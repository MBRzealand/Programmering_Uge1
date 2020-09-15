package Kapitel2;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

class Opgave2_2 {

    static String triangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter length: ");
        double length = input.nextDouble();
        double area = (sqrt(3) / 4) * pow(length, 2);
        double volume = area * length;
        input.close();


        return ("the area is: " + area + "\n" + "the volume of the Triangular prism is: " + volume);

    }


    public static void main(String[] args) {

        System.out.println(triangle());

    }


}
