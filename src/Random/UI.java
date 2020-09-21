package Random;

import java.util.Scanner;

class UI {

    public static void main(String[] args) {

        System.out.println("Enter GMT: ");
        Scanner input = new Scanner(System.in);
        String gmt = input.nextLine();
        System.out.println(Method.Time(gmt));

    }

}
