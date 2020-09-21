package Random;

import java.util.Scanner;

class MinimalWorkingCase {

    public static void main(String[] args) {
        System.out.println("indtast 2 tal der skal ganges:");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println(MinimalWorkingCaseMethod.Multiply(x,y));

    }

}
