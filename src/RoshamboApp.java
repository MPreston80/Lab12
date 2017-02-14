/**
 * Created by Mike on 2/11/2017.
 */
import java.util.Scanner;

public class RoshamboApp extends Player {
    @Override
    public String playAgainst() {
        Validator vals = new Validator();
        boolean inputCheck1 = true;
        String str = "";
        Scanner scan1 = new Scanner(System.in);
        while(inputCheck1) {
            System.out.println("Would you like to play against the Jets or the Sharks? (j/s)");
            String str1 = scan1.nextLine();
            if(!vals.inputCheck2(str1)){ //  Calling method in Validator class to check for correct user input
                System.out.println("Invalid Entry!");
                continue;
            }
            inputCheck1 = false;
            if (str1.equalsIgnoreCase("j")) {
                str = "TheJets";
            }
            if (str1.equalsIgnoreCase("s")) {
                str = "TheSharks";
            }
        }
        return str;


    }



    @Override
    public String rock() {
        return null;
    }

    @Override
    public String paper() {
        return null;
    }

    @Override
    public String scissors() {
        return null;
    }

    @Override
    public String playerName() {
        return null;
    }

    @Override
    public String randChoice() {
        return null;
    }
}
