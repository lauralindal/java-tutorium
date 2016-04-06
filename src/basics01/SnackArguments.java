package basics01;

/**
 * Created by laurall on 4/6/16.
 */
public class SnackArguments {
    public static Lebensmittel schneideBroetchen(Lebensmittel broetchen, Besteck brotmesser ){
        nimm broetchen;
        nimm brotmesser;
        Lebensmittel broetchenhaelfte = halbiere broetchen;
        System.out.println("Hier ist dein halbes Brötchen!");   // Das hier kann ich nur in der Console lesen
        return broetchenhaelfte;                                // Das hier kann die nächste Funktion tatsächlich weiter bearbeiten
    }

    public static Lebensmittel verstreicheButter(Lebensmittel broetchenhaelfte, Besteck buttermesser, Lebensmittel butter){
        nimm broetchenhaelfte;
        nimm buttermesser;
        nimm etwas butter;
        Lebensmittel butterbroetchen = verteile butter;
        System.out.println("Hier ist dein Butterbrötchen!");
        return butterbroetchen;
    }

    public static Lebensmittel belegeBrötchenMitKaese(Lebensmittel kaese, Besteck kaesemesser, Lebensmittel butterbroetchen) {
        nimm kaesemesser;
        nimm kaese;
        schneide kaese in scheiben;
        nimm butterbroetchen;
        Lebensmittel kaesebroetchen = lege kaesescheiben auf butterbroetchen;
        System.out.println("Hier ist dein Käsebrötchen!");
        return kaesebroetchen;
    }


    public static Besteck reinigeMesser(Besteck kaesemesser, Besteck buttermesser, Besteck brotmesser){
        Besteck[] dreckigeMesser = { kaesemesser, brotmesser, buttermesser };
        nimm spueli; // können wir das aus einer anderen "library" importieren?
        nimm wasser; // können wir das aus einer anderen "library" importieren?
        wasche dreckigeMesser[0];
        wasche dreckigeMesser[1];
        wasche dreckigeMesser[2];
        Besteck[] saubereMesser = { dreckigeMesser[0], dreckigeMesser[1], dreckigeMesser[2] };
        System.out.println("Schau, ich habe schon hinter mir aufgeräumt!");
        return saubereMesser;
    }

    public static void main(String[] args){

        Besteck brotmesser = "Groß mit welliger Schneide";
        Besteck kaesemesser = "Klein mit Spitze und zackiger Schneide";
        Besteck buttermesser = "Klein mit glatter Schneide";
        Lebensmittel broetchen = 3;
        Lebensmittel butter = 1;
        Lebensmittel kaese = 1;

        System.out.println("Lass und ein Käsebrot schmieren!");

        Lebensmittel broetchenhaelfte = schneideBroetchen(broetchen, brotmesser);
        Lebensmittel butterbroetchen = verstreicheButter(butter, buttermesser, broetchenhaelfte);
        Lebensmittel kaesebroetchen = belegeBrötchenMitKaese(kaese, kaesemesser, butterbroetchen);
        reinigeMesser(brotmesser, kaesemesser, buttermesser);

        System.out.println("Lasst es euch schmecken!");

        System.out.println(kaesebroetchen); // Wie jetzt, das Brötchen ist nicht echt?! Zeigt uns nur an, wo es gespeichert ist.
    }
}
