package uebung1;

// This is the first 'package' we open. It is a class with the name "BasicInfo".
public class BasicInfoVariables {

    // This is the 'main' method. Everything starts from here.
    public static void main(String[] args) {

        // Create a variable with the type String and give it a description/name. Assign your name to it.
        String name = "Laura Laugwitz";
        // Create another variable with the type string and give it a description/name. Assign your study programme to it.
        String studyProgramme = "Informatik und Wirtschaft";
        // Create a variable with the type string and give it a description/name. Assign the name of a street to it. Put a black space at the end within the string.
        String streetName = "Wilhelminenhofstraße ";
        // Create a variable with the type int and give it a description/name. Assign the street number of your address to it.
        int streetNumber = 75;
        // Create a variable with the type double and give it a description/name. Assign the distance from your home to your workplace to it.
        double distance = 7.60;
        // Create a variable with the type boolean and give it a description/name. Assign to it whether you like coffee or not.
        boolean likesCoffee = true;

        // These following lines are printed out to the console. After each line, there is a line break.
        System.out.println(name);
        System.out.println(studyProgramme);
        System.out.println(streetName + streetNumber);
        System.out.println(distance + " km Arbeitsweg");
        System.out.println(likesCoffee);
    }
}
