package Kapitel1;

class Opg1_4 {

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

        for (int i = 0; i < 4; i++) {

            System.out.println(Array1[i] + "\t\t" + Array2[i] + "\t\t" + Array3[i] + "\t\t" + Array4[i]);

        }
    }
}
