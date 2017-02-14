/**
 * Created by Mike on 2/10/2017.
 */
import java.util.Scanner;


public class Opponent extends Player {

    @Override
    public String rock() {
        return "Rock";
    }

    @Override
    public String paper() {
        return "Paper";
    }

    @Override
    public String scissors() {
        return "Scissors";
    }

    @Override
    public String playerName() {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan1.nextLine();
        return name;
    }

    @Override
    public String randChoice() {
        return null;
    }

    @Override
    public String playAgainst() {
        return null;
    }

    public String userChoice(){
        boolean inputCheck = true;
        Validator val = new Validator();
        Scanner scan1 = new Scanner(System.in);
        String str = "";

        while(inputCheck) {
            System.out.println("Rock, paper, or scissors?(r/p/s)");
            String c = scan1.next();
            if (!val.inputCheck(c)) {//Calling method in Validator class to check for correct user input
                System.out.println("Invalid Entry!");
                continue;
            }

            inputCheck = false;



            if (c.equalsIgnoreCase("r")) {
                str = "Rock";
            }
            if (c.equalsIgnoreCase("p")) {
                str = "Paper";
            }
            if (c.equalsIgnoreCase("s")) {
                str = "Scissors";
            }


        }
        return str;
    }
}
