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

    public static void addNewPlayer() {
        player_manager.addNewPlayer();
    }

    public static void findAndAddPlayersToQueue() {
        Scanner scanner = new Scanner(System.in);
        Player playerX = null, playerO = null;
        while (playerX == null) {
            System.out.print("Enter name of the next Player X: ");
            String name = scanner.next();
            playerX = player_manager.findPlayerByName(name);
            if (playerX == null) {
                System.out.printf("Cannot find player with name '%s'. Please try again.\n", name);
            } else {
                x_players.add(playerX);
                System.out.printf("Player '%s' added to Player X queue.\n", name);
            }
        }
        while (playerO == null) {
            System.out.print("Enter name of the next Player O: ");
            String name = scanner.next();
            playerO = player_manager.findPlayerByName(name);
            if (playerO == null) {
                System.out.printf("Cannot find player with name '%s'. Please try again.\n", name);
            } else {
                o_players.add(playerO);
                System.out.printf("Player '%s' added to Player O queue.\n", name);
            }
        }
    }

    public static void startNewGame() {
        Player playerX, playerO;
        playerX = x_players.poll();
        if (playerX == null) {
            System.out.println("Could not find next player X");
        }
        playerO = o_players.poll();
        if (playerO == null) {
            System.out.println("Could not find next player O");
        }
        // Start the game and push new winner/loser into winners or losers stack
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

        //create dummy test players
        Player newPlayer = new Player("Jeff", 31);
        winners.push(newPlayer);
        Player secondNewPlayer = new Player("Ivy", 31);
        winners.push(secondNewPlayer);
        Player thirdNewPlayer = new Player("Jonathan", 29);
        winners.push(thirdNewPlayer);

        Player newLoserPlayer = new Player("Jeff", 31);
        losers.push(newLoserPlayer);
        Player secondNewLoserPlayer = new Player("Ivy", 31);
        losers.push(secondNewLoserPlayer);
        Player thirdNewLoserPlayer = new Player("Jonathan", 29);
        losers.push(thirdNewLoserPlayer);

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

    private static Player Player(String string, int i) {
        return null;
    }
}