package uebung6;

// We need to import two classes in order to read the input that the User will give us in the console.
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BusinnesCardGame {

    public static String readInput(String query) {
        String input = "";
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print(query);

        try {
            input = br.readLine();
        } catch (Exception e) {
            input = "";
        }
        return input;
    }

    public static void printBusinessCard(String name, String studyProgramme, String address, String distanceToWork, String favoriteDrink){
        System.out.println( "+----------------------------+" );
        System.out.println( "| " + name);
        System.out.println( "| " + studyProgramme);
        System.out.println( "|" );
        System.out.println( "| " + address);
        System.out.println( "| " + distanceToWork + " to work");
        System.out.println( "| likes "+favoriteDrink);
        System.out.println( "+----------------------------+" );
    }

    public static void main(String[] args){

        String name = readInput("Hi there! Let's print your Business Card! What is your full name? > ");
        String studyProgramme = readInput("Hi " + name + ", and what is you Study Programme? > ");
        String address  = readInput("And what is you adddress? > ");
        String distanceToWork = readInput("How far away is your workplace? > ");
        String favoriteDrink = readInput("One last questions: What is your favorite non-alcoholic drink? > ");

        System.out.println("Thank you " + name + "! Here is your Business Card:");
        System.out.println();

        printBusinessCard(name, studyProgramme, address, distanceToWork, favoriteDrink);
    }

}
