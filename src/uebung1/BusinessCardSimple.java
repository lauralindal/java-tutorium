package uebung1;

// This is a class
public class BusinessCardSimple {

    // This is the 'main' method. Everything gets executed from here.
    public static void main(String[] args) {

        String name = "Laura Laugwitz";
        String studyProgramme = "Informatik und Wirtschaft";
        String streetName = "Wilhelminenhofstr.";
        int streetNumber = 75;
        String distanceToWork = "km Arbeitsweg";
        double distance = 7.60;
        boolean likesCoffee = true;



        // These following lines are printed out to the console. After each line, there is a line break.
        System.out.println(name);
        System.out.println(studyProgramme);
        System.out.println(streetName + streetNumber);
        System.out.println(distance + distanceToWork);
        System.out.println(likesCoffee);
    }
}
