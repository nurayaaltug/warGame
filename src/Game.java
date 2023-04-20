import java.util.Scanner;
import player.Player;

public class Game {
    private  Player player;
    private Scanner scan = new Scanner(System.in);
    public void start(){
        System.out.println("Welcome Warrior");
        String playerName = scan.nextLine();
        player = new Player(playerName);
        System.out.println("Hi" + player.getPlayerName() +", If you're ready, let's start");
        System.out.println("Kill more, collect more food and water. You'll be the winner");

        player.pickChar();
        player.pickLocation();

    }
}
