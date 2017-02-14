/**
 * Created by Mike on 2/14/2017.
 */
public class Validator {
    public static boolean inputCheck(String x){ //  Method to check valid user input which should be r, p, or s only
        boolean input = true;
        if(x.equalsIgnoreCase("r")||x.equalsIgnoreCase("p")||x.equalsIgnoreCase("s")){
            input = true;
        }
        else{
            input = false;
        }

        return input;

    }


    public static boolean inputCheck2(String y){  //  Method to check valid user input for who they want to play
        boolean input1 = true;
        if(y.equalsIgnoreCase("J")||y.equalsIgnoreCase("S")){
            input1 = true;
        }
        else{
            input1 = false;
        }

        return input1;
    }
}
