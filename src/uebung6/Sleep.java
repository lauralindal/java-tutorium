package uebung6;

public class Sleep {

    public static void main(String[] args){


        for(int hoursToSleep = 4; hoursToSleep >= 0; hoursToSleep--){
            System.out.println(printSleep(hoursToSleep));
        }
    }

    private static String printSleep(int hoursToSleep){
        return hoursToSleep + " more hours to sleep.";
    }
}
