package uebung5;

public class BusinessCardArguments {

    public static void printManyHyphens(int amount) {
        for (int i = 0; i < amount; i++){
            System.out.print("-");
        }
        System.out.println(); // This line is needed for the line break after the loop.
    }

    public static void printManyCharacters(int amount, char character){
        System.out.print("|");
        for (int i = 0; i < amount; i++){
            System.out.print(character);
        }
        System.out.print("|");
        System.out.println(); // This line is needed for the line break after the loop.
    }

    public static void main(String[] args) {

        int amountOfHyphen = 30;

        // These following lines are printed out to the console. After each line, there is a line break.

        // Call the function printManyHyphens and tell it which number to pass on.
        printManyHyphens(30);
        System.out.println( "| Laura Laugwitz             |" );
        System.out.println( "| Informatik und Wirtschaft  |" );
        printManyCharacters(28, ' ');
        System.out.println( "| Wilhelminenhofstr. 75A     |" );
        System.out.println( "| 7.6 km Arbeitsweg          |" );
        System.out.println( "| mag Kaffee                 |" );
        // Call the function printManyHyphens and tell it to pass on the contents of the variable amountOfHyphen
        printManyHyphens(amountOfHyphen);
    }
}
