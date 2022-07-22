import java.io.IOException;
import java.util.Scanner;

public class Game {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static int countGames = 0;
    private static int playerScore = 0;
    private static int computerScore = 0;
    private static String name;

    public enum Elements {
        ROCK,
        SCISSORS,
        PAPER;
    }

    public static String elementsService(Elements playerMove, Elements computerMove) {
        if (playerMove == computerMove) {
            return "tie";
        }
        if (playerMove == Elements.ROCK) {
            if (computerMove == Elements.SCISSORS) {
                return "win";
            }
            else {
                return "lose";
            }
        }
        if (playerMove == Elements.PAPER) {
            if (computerMove == Elements.ROCK) {
                return "win";
            }
            else {
                return "lose";
            }
        }
        if (playerMove == Elements.SCISSORS) {
            if (computerMove == Elements.PAPER) {
                return "win";
            }
            else {
                return "lose";
            }
        }
        return null;
    }

    public static void start() throws IOException {
        System.out.println("Enter your name:");
        name = SCANNER.next();
        System.out.println("Hi, " + name + ".");
        System.out.println("Enter number of games:");
        int q = SCANNER.nextInt();
        int temp = q;
        do {
            if (q == temp) {
                playService();
            } else {
                System.out.println("Do you want play again? Enter 'Y' ar 'N'.");
                if (playAgain()) {
                    playService();
                } else {
                    printResult(name);
                    System.out.println("The game is over. Have a good day :)");
                    break;
                }
            }
            q--;
            Record.record(name,
                    Integer.toString(countGames),
                    Integer.toString(playerScore),
                    Integer.toString(computerScore));
        } while (q != 0);
    }

    private static void playService() {
        Player player = new Player();
        Computer computer = new Computer();
        Elements playerMove = player.makeMove();
        Elements computerMove = computer.makeMove();
        System.out.println("Your move " + playerMove + ".");
        System.out.println("Computer move " + computerMove + ".");
        String compareMoves = elementsService(playerMove, computerMove);
        switch (compareMoves) {
            case "tie" -> System.out.println("Tie");
            case "win" -> playerScore++;
            case "lose" -> computerScore++;
        }
        countGames++;
        printResult(name);
    }

    private static boolean playAgain() {
        String more = SCANNER.next();
        if (more.equals("Y") || more.equals("y")) {
            return true;
        } else if (more.equals("N") || more.equals("n")) {
            return false;
        }
        else {
            System.out.println("Enter 'Y' or 'N'");
            playAgain();
        }
        return false;
    }

    private static void printResult(String name) {
        System.out.println(name + " played " + countGames + " games. Win: " + playerScore + ". Lose: " + computerScore);
    }
}
