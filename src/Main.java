import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String roll = "y";

        System.out.println("Welcome to theGrand Circus Casino!\n");

        while (roll.equalsIgnoreCase("y")) {
            Random random = new Random();

            System.out.println("How many sides should each die have?");
            int sides = scan.nextInt();

//            System.out.println("Roll the dice? (y/n)");
//            String choice = scan.nextLine();
//            choice = scan.nextLine();

            System.out.println("\nYou rolled:");
            //className(callVar)
            System.out.println("Die 1: " + rollOut(sides));
            System.out.println("Die 2: " + rollOut(sides));

            System.out.println("\nWould you like to play again? (y/n)");
            roll = scan.nextLine();

        }

        System.out.println("Thanks for playing, have a nice day!");
    }

    public static int rollOut(int dieRoll) {

        Random random = new Random();

        int roll = (random.nextInt(dieRoll) + 1);

        return roll;

    }
}
