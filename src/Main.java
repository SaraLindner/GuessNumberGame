import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Board board = new Board();
        Player player = new Player();

        while (player.isPlayAgain()) {
            board.playGame();
            //reset wasFound for next round
            board.setWasFound(false);
            board.setFirstElement(0);
            board.setLastElement(board.binarySearch.length - 1);
            System.out.println(board.wasFound);
            System.out.println("Want to do another guess? Enter y or n");
            Scanner scanAnswer = new Scanner(System.in);
            String answer = scanAnswer.nextLine();
            player.playAgain(answer);
        }
    }
}

