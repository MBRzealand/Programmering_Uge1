package Kapitel3;

import java.util.Scanner;

class Opgave3_5 {

    static Scanner input = new Scanner(System.in);
    static int input1 = input.nextInt();
    static int input2 = input.nextInt();

    static String[] weekday = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    static int future = ((input1 + input2) % 7);

    static String today = weekday[input1];
    static String total = weekday[future];


    public static void main(String[] args) {
        if (input1 + input2 >= 0) {
            System.out.println("Today is " + today + " and the future day is " + total);
        } else {
            System.out.println("error only defined for positive integers");
        }
    }

}

