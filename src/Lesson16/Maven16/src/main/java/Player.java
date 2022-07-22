import java.util.Scanner;

public class Player {
    public Game.Elements makeMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rock, paper or scissors?");
        System.out.println("Enter 'R', 'P' or 'S'.");
        String playerInput = scanner.nextLine();
        if (playerInput.equals("R") || playerInput.equals("P") || playerInput.equals("S")
                || playerInput.equals("r")|| playerInput.equals("p") || playerInput.equals("s")) {
            switch (playerInput.toUpperCase()) {
                case "R" : return Game.Elements.ROCK;
                case "P" : return Game.Elements.PAPER;
                case "S" : return Game.Elements.SCISSORS;
            }
        }
        return makeMove();
    }
}
