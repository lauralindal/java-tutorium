package uebung4;

public class BusinessCardLoops {

    public static void main(String[] args) {

        int amountOfHyphen = 30;

        // These following lines are printed out to the console. After each line, there is a line break.

        // This is a for loop
        for (int i = 0; i < amountOfHyphen; i++){
            System.out.print("-");
        }
        System.out.println(); // This line is needed for the line break after the loop.

        System.out.println( "| Laura Laugwitz             |" );
        System.out.println( "| Informatik und Wirtschaft  |" );
        System.out.println( "|                            |" );
        System.out.println( "| Wilhelminenhofstr. 75A     |" );
        System.out.println( "| 7.6 km Arbeitsweg          |" );
        System.out.println( "| mag Kaffee                 |" );

        // This is a while loop.
        while (amountOfHyphen > 0){
            amountOfHyphen--;
            System.out.print("-");
        }
        System.out.println(); // This line is needed for the line break after the loop.
    }
}
