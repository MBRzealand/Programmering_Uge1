package MoodleOpgaver;

class IfThenElse {

    public static void main(String[] args) {

        for (int x = 0; x < 2; x++) {
            If(x);
        }

        for (int x = 0; x < 2; x++) {
            Switch(x);
        }

        for (int x = 1; x <= 3; x++) {
            enhancedSwitch(x);
        }


    }

    static void If(int x) {
        if (x == 0) {
            System.out.println("x is 1");

        } else if (x == 1) {
            System.out.println("x is 2");

        } else {
            System.out.println("x is larger than i can count");

        }
    }

    static void Switch(int x) {
        switch (x) {
            case 1:
                System.out.println("x is 1");
            case 2:
                System.out.println("x is 2");
            default:
                System.out.println("x is larger than i can count");

        }


    }

    static void enhancedSwitch(int x) {
        switch (x) {
            case 1 -> System.out.println("x is 1");
            case 2 -> System.out.println("x is 2");
            default -> System.out.println("x is larger than i can count");

        }
    }

}
