import java.util.Scanner;

public class Board {
    public Board() {
    }

    protected static int[] binarySearch = {1, 3, 5, 7, 11, 22, 33, 44, 55, 66, 77, 128, 77, 123, 234, 777};
    protected static int firstElement = 0;
    protected static int lastElement = binarySearch.length - 1;
    protected boolean wasFound = false;

    public static void setFirstElement(int firstElement) {
        Board.firstElement = firstElement;
    }

    public static void setLastElement(int lastElement) {
        Board.lastElement = lastElement;
    }

    public void setWasFound(boolean wasFound) {
        this.wasFound = wasFound;
    }

    public void playGame() {
        System.out.println("Guess a number:");
        Scanner scan = new Scanner(System.in);
        int findNumber = scan.nextInt();

        while (!wasFound && firstElement <= lastElement) {
            int halve = (firstElement + lastElement) / 2;
            if (binarySearch[halve] == findNumber) {
                wasFound = true;
                System.out.println("Good guess! :) Number was found at index " + halve);
                return;
            } else {
                if (findNumber < binarySearch[halve]) {
                    lastElement = halve - 1;
                } else {
                    firstElement = halve + 1;
                }
            }
        }
        System.out.println("Not correct! This was the wrong number! :(");
    }
}
