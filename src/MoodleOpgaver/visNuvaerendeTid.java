package MoodleOpgaver;

class visNuvaerendeTid {

    static String nuvaerendeTid() {

        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMillisekunder = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSekunder = totalMillisekunder / 1000;

        // Compute the current second in the minute in the hour
        long nuvaerendeSekund = totalSekunder % 60;

        // Obtain the total minutes
        long totalMinutter = totalSekunder / 60;

        // Compute the current minute in the hour
        long nuvaerendeMinut = totalMinutter % 60;

        // Obtain the total hours
        long totalTimer = totalMinutter / 60;

        // Compute the current hour
        long nuvaerendeTime = totalTimer % 24;

        return "nuværende tid er " + nuvaerendeTime + ":"
                + nuvaerendeMinut + ":" + nuvaerendeSekund + " GMT";

    }


    public static void main(String[] args) {


        // Display results
        System.out.println(nuvaerendeTid());
    }

}
