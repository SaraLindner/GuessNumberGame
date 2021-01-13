import java.util.Scanner;

public class Player {
    boolean playAgain = true;

    public boolean isPlayAgain() {
        return playAgain;
    }

    public Player() {
    }

    public boolean playAgain(String yesorNo) {

        if (yesorNo.equals("y")) {
            playAgain = true;
        } else if (yesorNo.equals("n")) {
            playAgain = false;
        } else {
            System.out.println("Sorry, your input is not valid");
            playAgain = false;
        }
        return playAgain;
    }
}
