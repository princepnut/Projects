import java.util.Scanner;
public class RPS {

    public static void main(String[] args) {
        do
        {System.out.print("Player 1 enter Rock/Paper/Scissors as RPS: ");
        Scanner an = new Scanner(System.in);
        String playerA = an.nextLine();

        if(!playerA.equalsIgnoreCase("R") && !playerA.equalsIgnoreCase("S") && !playerA.equalsIgnoreCase("P")) {
            System.out.print("Player 1, please enter a valid move (R/P/S): ");
            playerA = an.nextLine();}

        System.out.print("Player 2 enter Rock/Paper/Scissors as RPS: ");
        String playerB = an.nextLine();

        if(!playerB.equalsIgnoreCase("R") && !playerB.equalsIgnoreCase("S") && !playerB.equalsIgnoreCase("P")) {
            System.out.print("Player 2, please enter a valid move (R/P/S): ");
            playerB = an.nextLine();}

        if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S")) {
            System.out.println("Player 1 wins! Rock breaks Scissors. Play again? [Y/N]: "); }
        if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("R")) {
            System.out.println("Player 1 wins! Paper covers Rock. Play again? [Y/N]: "); }
        if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("P")) {
            System.out.println("Player 1 wins! Scissors cuts Paper. Play again? [Y/N]: "); }
        if (playerB.equalsIgnoreCase("R") && playerA.equalsIgnoreCase("S")) {
                System.out.println("Player 2 wins! Rock breaks Scissors. Play again? [Y/N]: "); }
        if (playerB.equalsIgnoreCase("P") && playerA.equalsIgnoreCase("R")) {
                System.out.println("Player 2 wins! Paper covers Rock. Play again? [Y/N]: "); }
        if (playerB.equalsIgnoreCase("S") && playerA.equalsIgnoreCase("P")) {
                System.out.println("Player 2 wins! Scissors cuts Paper. Play again? [Y/N]: "); }
        if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("S") || playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("P")) {
            System.out.println("You tied! Play again? [Y/N]: "); }

            Scanner pa = new Scanner(System.in);
            String playAgain = pa.next();
            if (playAgain.equalsIgnoreCase("Y")) {
                System.out.println("Starting again!");
            }
            if (playAgain.equalsIgnoreCase("N")) {
                System.out.println("See you next time!");
                break;
            }

            }
        while(true);
        }
    }




