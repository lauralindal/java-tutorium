package uebung3;

public class BusinessCardIfStatement {

    public static void main(String[] args) {

        String name = "Laura Laugwitz";
        String studyProgramme = "Informatik und Wirtschaft";
        int streetNumber = 75;
        double distance = 7.60;
        boolean likesCoffee = true;
        String likesTea = "I like tea!";

        // These following lines are printed out to the console. After each line, there is a line break.
        System.out.println("+----------------------------+");
        System.out.println("| " + name + "             |");
        System.out.printf("| %s  |%n", studyProgramme);
        System.out.println("|                            |" );
        System.out.printf("| Wilhelminenhofstr. %dA     |%n", streetNumber);
        System.out.println("| " + distance + " km Arbeitsweg          |");

        // This is an if/else statement.
        if(likesCoffee)
            System.out.println("| mag Kaffee                 |");
        else
            System.out.println("| Kaffee ist meh             |");

        System.out.println("+----------------------------+");
        System.out.println(likesTea);
    }
}
