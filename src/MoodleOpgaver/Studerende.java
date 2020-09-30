package MoodleOpgaver;

class Studerende {

    static String navn;
    static int alder;
    static String campus;
    static String studieRetning;
    static String by;


    Studerende(){
        Studerende.studieRetning = "Datamatiker";
        Studerende.campus = "Zealand Erhvervsakademi";
    }

}


class Main {

    public static void main(String[] args) {

        Studerende st1 = new Studerende();
        st1.navn ="Mikkel Boye Rasmussen";
        st1.alder =24;
        st1.by = "Dalby";

        Studerende st2 = new Studerende();
        st2.navn ="Anders Larsen";
        st2.alder = 24 ;
        st2.by = "Slagelse";

        Studerende st3 = new Studerende();
        st3.navn ="Kim Ruan Larsen";
        st3.alder = 28 ;
        st3.by = "Næstved";

        Studerende st4 = new Studerende();
        st4.navn ="Mathias Madsen";
        st4.alder = 21;
        st4.by = "Errindlev";

        Studerende st5 = new Studerende();
        st5.navn ="Mike Patrick Horsted Rasmussen";
        st5.alder = 29;
        st5.by = "Odense";


    }

}



// kaffemaskine, monitor kaffeforbrug, hook op til alarm

// smartvindue, åbner vinduer når luftfugtighed bliver for høj

// smartsko, connecter til gps siger hvornår man skal dreje til højre og venstre med vibration, skridtæller