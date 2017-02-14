import java.util.Scanner;

public class Main {

    // Method below determines if the user or their opponent wins
    public static String winnerChoice(String Human, String Computer){
        String str = "";
        if(Human.equalsIgnoreCase("Rock")&& Computer.equalsIgnoreCase("Rock")){
            str = "Draw!";
        }
        if(Human.equalsIgnoreCase("Rock")&&Computer.equalsIgnoreCase("Scissors")){
            str = "Opwins";
        }
        if(Human.equalsIgnoreCase("Rock")&&Computer.equalsIgnoreCase("Paper")){
            str = "computerwins";
        }
        if(Human.equalsIgnoreCase("Paper")&& Computer.equalsIgnoreCase("Paper")){
            str = "Draw!";
        }
        if(Human.equalsIgnoreCase("Paper")&& Computer.equalsIgnoreCase("Scissors")){
            str = "computerwins";
        }
        if(Human.equalsIgnoreCase("Paper")&& Computer.equalsIgnoreCase("Rock")){
            str = "Opwins";
        }
        if(Human.equalsIgnoreCase("Scissors")&& Computer.equalsIgnoreCase("Scissors")){
            str = "Draw!";
        }
        if(Human.equalsIgnoreCase("Scissors")&& Computer.equalsIgnoreCase("Rock")){
            str = "computerwins";
        }
        if(Human.equalsIgnoreCase("Scissors")&& Computer.equalsIgnoreCase("Paper")){
            str = "Opwins";
        }

        return str;

    }
    //Method below to print who won to the console
    public static void whoWon(String whoWon, String name1, String comp){
        if(whoWon.equalsIgnoreCase("Draw!")){
            System.out.println("Draw!");
        }
        if(whoWon.equalsIgnoreCase("computerwins")){
            System.out.println(comp + " wins!");
        }
        if(whoWon.equalsIgnoreCase("Opwins")){
            System.out.println(name1 + " wins!");
        }
    }
    //Simple method to print the names of the players and what they chose (either rock, paper or scissors)
    public static void gameOutput(String humanName, String humanChoice, String comChoice, String com){
        System.out.println(humanName + ": " + humanChoice);
        System.out.println(com + ": " + comChoice);

    }



    public static void main(String[] args) {



        String userInput1 = "yes";

        Scanner scan1 = new Scanner(System.in);
        Opponent opponent = new Opponent();
        Player1 player1 = new Player1();
        Player2 player2 = new Player2();
        RoshamboApp rosh = new RoshamboApp();
        String str = "";


            System.out.println("Welcome to Rock Paper Scissors!");
            String oppName = opponent.playerName();
            //  Gets name of the user and assigns to variable oppName;




        do{

            String computer = rosh.playAgainst();
            // Determines who the user wants to play

            if(computer.equalsIgnoreCase("TheSharks")) {
                str = player1.randChoice();
            }
            if(computer.equalsIgnoreCase("TheJets")){
                str = player2.rock();
            }

            String userChoice = opponent.userChoice();
            //  Returns Rock, Paper, or Scissors based on what the user selected, sets equal to
            // variable userChoice.




            String winChoice = winnerChoice(userChoice, str);

            gameOutput(oppName, userChoice, str, computer);
            whoWon(winChoice, oppName, computer);

            System.out.println();
            System.out.println("Play again?(yes/no)");

            userInput1 = scan1.nextLine();
        }


        while(userInput1.equalsIgnoreCase("yes"));

        System.out.println("Goodbye!");




    }


}
