import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String roll = "y";
        int sides = 0;
        boolean isNumber;

        System.out.println("Welcome to theGrand Circus Casino!\n");


        while (roll.equalsIgnoreCase("y")) {
            System.out.println("How many sides should each die have? (Enter whole number)");

            do {
                if (scan.hasNextInt()) {
                    sides = scan.nextInt();
                    isNumber = true;
                } else {
                    System.out.println("Hey, that's not a whole number!");
                    System.out.println("Enter new number: ");
                    isNumber = false;
                    scan.nextLine(); //garbage line to clean out scanner
                }

            } while (!(isNumber));


            System.out.println("Roll the " + sides + "-sided pair of die? (y/n)");
            String choice = scan.nextLine();
            choice = scan.nextLine();
            if (choice.equalsIgnoreCase("y")) {

                System.out.println("\nYou rolled:");
               
                System.out.println("Die 1: " + rollOut(sides));
                System.out.println("Die 2: " + rollOut(sides));
            } else {
                System.out.println("Do you want to change the sides on the die?");
                System.out.println("Type 'y' to continue or 'q' to quit the program.");
                String changeSides = scan.nextLine();
                if (changeSides.equalsIgnoreCase("y")) {
                    continue;
                } else if (changeSides.equalsIgnoreCase("q")) {
                    break;
                }
            }

            System.out.println("Would you like to play again? (y/n)");

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
