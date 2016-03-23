package uebung8;

public class BusinessCardArrays {

    public static void main(String[] args) {

        String name = "Laura Laugwitz";
        String studyProgramme = "Informatik und Wirtschaft";
        String streetName = "Wilhelminenhofstr.";
        int streetNumber = 75;
        String distanceToWork = "km Arbeitsweg";
        double distance = 7.60;

        // Let's allow more than just one favorite drink
        String[] favoriteDrinks = { "Coffee", "Apfelschorle", "Ginger Tea"};
        // And some lucky numbers
        int[] luckyNumbers = {13, 42, 256};



        // These following lines are printed out to the console. After each line, there is a line break.
        System.out.println(name);
        System.out.println(studyProgramme);
        System.out.println(streetName + streetNumber);
        System.out.println(distance + distanceToWork);
        System.out.println(favoriteDrinks[0]);
        System.out.println(favoriteDrinks[1]);
        System.out.println(favoriteDrinks[2]);

        for(int i = 0; i < luckyNumbers.length; i++){
            System.out.println(luckyNumbers[i]);
        }
    }
}

