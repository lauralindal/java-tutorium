package basics01;

/**
 * Created by laurall on 4/6/16.
 */
public class SnackFunctions {

    public static void schneideBroetchen(){
        nimm broetchen;
        nimm kaesemesser;
        halbiere broetchen;
        System.out.println("Hier ist dein halbes Brötchen!");
    }

    public static void verstreicheButter(){
        nimm broetchenhaelfte;
        nimm buttermesser;
        nimm etwas butter;
        verteile butter;
        System.out.println("Hier ist dein Butterbrötchen!");
    }

    public static void belegeBrötchenMitKaese(){
        nimm kaesemesser;
        nimm kaese;
        schneide kaese in scheiben;
        nimm butterbroetchen;
        lege kaesescheiben auf butterbroetchen;
        System.out.println("Hier ist dein Käsebrötchen!");
    }

    public static void reinigeMesser(){
        nimm kaesemesser;
        nimm brotmesser;
        nimm buttermesser;
        nimm spueli; // können wir das aus einer anderen library importieren?
        nimm wasser; // können wir das aus einer anderen library importieren?
        wasche messer; // die Messer könnten wir auch in eine einzelne Variable packen (Array üben)
        System.out.println("Schau, ich habe schon hinter mir aufgeräumt!");
    }

    public static void main(String[] args){

        Besteck brotmesser = "Groß mit welliger Schneide";
        Besteck kaesemesser = "Klein mit Spitze und zackiger Schneide";
        Besteck buttermesser = "Klein mit glatter Schneide";
        Lebensmittel broetchen = 3;
        Lebensmittel butter = 1;
        Lebensmittel kaese = 1;

        System.out.println("Lass und ein Käsebrot schmieren!");

        schneideBroetchen();
        verstreicheButter();
        belegeBrötchenMitKaese();
        reinigeMesser();

        System.out.println("Lasst es euch schmecken!");
    }
}
