/*
tic tac toe main menu

*/
import java.util.*;

public class Main
{
    public static Queue<Player> x_players = new LinkedList<>();
    public static Queue<Player> o_players = new LinkedList<>();
    public static Stack<Player> winners = new Stack<>();
    public static Stack<Player> losers = new Stack<>();
    public static PlayerManager player_manager = new PlayerManager();

    public static void displayMenu() {
        System.out.println("--------------------------------------");
        System.out.println("1. Enter player info");
        System.out.println("2. Add players into queue");
        System.out.println("3. Start new game");
        System.out.println("4. Display last n winners");
        System.out.println("5. Display last n losers");
        System.out.println("--------------------------------------");
        System.out.print("Please enter your choice: ");
    }

    public static void showLastWinners() {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (n == 0) {
            System.out.print("Enter number of winners you want to see: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Please enter a valid number!");
            }

            int idx = 1; 
            for (int i = n; i > 0; i--) {
                System.out.println(winners.get(winners.size() - idx).getName());
                idx++;
            }
        }
    }

    public static void showLastLosers() {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (n == 0) {
            System.out.print("Enter number of losers you want to see: ");
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Please enter a valid number!");
            }

            int idx = 1; 
            for (int i = n; i > 0; i--) {
                System.out.println(losers.get(losers.size() - idx).getName());
                idx++;
            }
        } 
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            displayMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addNewPlayer();
                    break;
                case 2:
                    findAndAddPlayersToQueue();
                    break;
                case 3:
                    startNewGame();
                    break;
                case 4:
                    showLastWinners();
                    break;
                case 5:
                    showLastLosers();
                    break;
                default:
                    System.out.println("You entered an invalid option. Please try again.");
                    break;
            }
        }
    }
}