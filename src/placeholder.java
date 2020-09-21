import java.util.Timer;
import java.util.TimerTask;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class placeholder {


}




class InSchool extends TimerTask {

    static void time() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        String time = dtf.format(now);
        String[] timeSplit = time.split(":");

        if(Integer.parseInt(timeSplit[0]) < 15) {
            System.out.println("the time is " + time + " you are in school");

        }else {
            System.out.println("the time is " + time + " you're not in school");
        }
    }


    public void run() {

        time();

    }


    public static void main(String[] args) {



    }

}



