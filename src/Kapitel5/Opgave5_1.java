package Kapitel5;

import java.util.Scanner;

class Opgave5_1 {

    static String pass = "You pass the examn.";
    static String fail = "You don't pass the exam.";
    static String undefined = "Number not between 0 and 100";

    static String passOrFail(int score){
        if ((score >= 60) && (score <= 100)) {
            return pass;
        } else if ((score < 60) && (score >= 0)) {
            return fail;
        } else {
            return undefined;
        }
    }

}


class Opgave5_1_Main{

    public static void main(String[] args) {

        System.out.println("Enter your score: ");
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        System.out.println(Opgave5_1.passOrFail(score));

    }

}


class Opgave5_1_Test{

    public static void main(String[] args) {

        //testcase 1, input = 80:
        //expected output = You pass the examn.
        System.out.println("Testcase 1:");
        if (Opgave5_1.passOrFail(80) == Opgave5_1.pass){
            System.out.println("TEST SUCESSFUL");
        } else {
            System.out.println("TEST FAILED");
        }

        // testcase 2, input = 59:
        // expected output = You don't pass the exam.
        System.out.println("Testcase 2:");
        if (Opgave5_1.passOrFail(59) == Opgave5_1.fail){
            System.out.println("TEST SUCESSFUL");
        } else {
            System.out.println("TEST FAILED");
        }

        // testcase 3, input = -1:
        // expected output = Number not between 0 and 100
        System.out.println("Testcase 3:");
        if(Opgave5_1.passOrFail(-1) == Opgave5_1.undefined){
            System.out.println("TEST SUCESSFUL");
        }else{
            System.out.println("TEST FAILED");
        }

    }

}