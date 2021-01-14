import java.util.Scanner;

public class Player {
    boolean playAgain = true;

    public boolean isPlayAgain() {
        return playAgain;
    }

    public Player() {
    }

    public boolean playAgain(String yesOrNo) {

        if (yesOrNo.equals("y")) {
            playAgain = true;
        } else if (yesOrNo.equals("n")) {
            playAgain = false;
        } else {
            System.out.println("Sorry, your input was not valid!");
            playAgain = false;
        }
        return playAgain;
    }
}
