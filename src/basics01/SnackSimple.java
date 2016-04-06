package basics01;

/**
 * Created by laurall on 4/6/16.
 */
public class SnackSimple {

    public static void main(String[] args){

        // Unsere Elemente (Variablen) haben verschiedene Datentypen: Besteck oder Lebensmittel.
        // Den verschiedenen Elementen geben wir einen Namen (Variablenname): brotmesser, butter, ...
        // In den Variablen speichern wir Informationen.
        Besteck brotmesser = "Groß mit welliger Schneide";
        Besteck kaesemesser = "Klein mit Spitze und zackiger Schneide";
        Besteck buttermesser = "Klein mit glatter Schneide";
        Lebensmittel broetchen = 3;
        Lebensmittel butter = 1;
        Lebensmittel kaese = 1;

        System.out.println("Lass und ein Käsebrot schmieren!");

        schneideBroetchen();
        verstreicheButter();
        belegeBroetchenMitKaese();

        System.out.println("Lasst es euch schmecken!");
    }


}
