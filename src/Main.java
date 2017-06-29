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

            System.out.println("Roll the dice? (y/n)");
            String choice = scan.nextLine();
            choice = scan.nextLine();

            System.out.println("\nYou rolled:");
            System.out.println("Die 1: " + (random.nextInt(sides) + 1);
            System.out.println("Die 2: " + (random.nextInt(sides) + 1));

            System.out.println("\nWould you like to play again? (y/n)");
            roll = scan.nextLine();

        }
    }
}
