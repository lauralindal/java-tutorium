package uebung6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RealGame {

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

    public static void firstRoom(){
        System.out.println("You're standing in a dark room. There are two doors in front of you. The one to the left appears to glitter. Behind the other door, you can hear music.");
    }

    public static void main(String[] args){

        String name = readInput("Hi there! What is your first name? > ");
        String choice = readInput("Hi " + name + ", would you like to play a game? > ");

        while(true){
            if (choice.equals("yes")) {
                System.out.println("Cool. I will have to think of something now...");
                firstRoom();
                break;
            } else if (choice.equals("no")) {
                System.out.println("That's okay. Have a good day then!");
                break;
            } else {
                System.out.println("I don't understand.");
                choice = readInput("Please type either 'yes' or 'no' > ");
            }
        }

        // Denke dir nun aus, was weiter passieren kann!


    }
}
