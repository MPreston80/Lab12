/**
 * Created by Mike on 2/10/2017.
 */

import java.util.Random;

public class Player1 extends Player {


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
    public String randChoice() { // uses Random class to pick either rock, apper or scissors

        Random ran = new Random();
        int x = ran.nextInt(3)+1;
        String str = "";
        switch(x){
            case 1:
                str = "Rock";
                break;
            case 2:
                str = "Scissors";
                break;
            case 3:
                str = "Paper";
                break;
        }
        return str;

    }

    @Override
    public String playAgainst() {
        return "TheSharks";
    }
}
