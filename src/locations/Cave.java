package locations;

import obstacle.Zombie;
import player.Player;

public class Cave extends BattleLocation{
    public Cave(Player player) {
        super(player, "Cave", new Zombie(), "Food", 3, 3);
    }
}
