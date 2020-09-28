package Kapitel3;

import java.util.Scanner;

class Opgave3_1 {

    public static void main(String[] args) {

        System.out.println("Enter a, b, c:");
        Scanner input = new Scanner(System.in);
        String rawInput = input.nextLine();
        System.out.print(roots(rawInput));

    }

    static String roots(String rawInput){

        String[] inputSplit = rawInput.split(" ");
        double a = Double.parseDouble(inputSplit[0]);
        double b = Double.parseDouble(inputSplit[1]);
        double c = Double.parseDouble(inputSplit[2]);
        double d = Math.pow(b,2) - (4 * a * c);

        double root1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        double root2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

        if(d > 0){
            return "The equation has two real roots: " + "[" + root1 + "," + root2 + "]";

        }else if(d == 0){
            return "the equation has one real root: " + root1;

        }else
            return "the equation has no real roots ";
    }

}
