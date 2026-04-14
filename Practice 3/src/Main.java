import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Inputs
        System.out.print("Enter your astronaut name: ");
        String astronautName = input.nextLine();

        System.out.print("Enter your capsule name: ");
        String callSign = input.nextLine();

        System.out.print("Enter which SuperHero you'd bring with you: ");
        String companion = input.nextLine();

        System.out.print("Enter which country you will launch from: ");
        String landingSite = input.nextLine();

        System.out.print("Enter your favorite space food: ");
        String spaceFood = input.nextLine();

        System.out.print("How many days will you spend in space? ");
        int daysInSpace = input.nextInt();

        System.out.print("How many hours of astronaut training have you completed? ");
        int trainingHours = input.nextInt();

        System.out.print("How many snacks are you packing? ");
        int snackCount = input.nextInt();

        System.out.print("Enter your height in meters (for suit fitting): ");
        double height = input.nextDouble();

        System.out.print("Enter a decimal number for fuel calculations: ");
        double fuelFactor = input.nextDouble();

        // Math
        int totalPreparation = trainingHours + daysInSpace;
        double fuelNeeded = fuelFactor * 72;

        // Output
        System.out.println("ARTEMIS: TO THE MOON AND BACK");

        System.out.println("Astronaut " + astronautName + " trained for " + trainingHours +
                " hours getting ready for this mission. It wasn’t easy, but you pushed through.");

        System.out.println("Your capsule, " + callSign + ", is set to launch from " + landingSite +
                " and take you on a " + daysInSpace + "-day trip to space.");

        System.out.println("You decided to bring " + companion +
                " along as your superhero partner. They also packed " + snackCount +
                " snacks, because apparently saving the world makes you hungry.");

        System.out.println("At " + height +
                " meters tall, your suit fits just right. Good thing, because there’s no backup.");

        System.out.println("Mission control ran the numbers and said you’ll need " + fuelNeeded +
                " liters of fuel for the big burn toward the Moon.");

        System.out.println("All together, you’ve got " + totalPreparation +
                " hours of training and mission time ahead of you.");

        System.out.println("When you finally reach the Moon, you sit down with some " + spaceFood +
                " and look back at Earth. It hits different seeing home from that far away.");

        System.out.println("After finishing your mission, you guide " + callSign +
                " back toward Earth. You made it — to the Moon and back.");


    }
}
