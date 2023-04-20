package locations;

import obstacle.Vampire;
import player.Player;

public class Forest extends BattleLocation{
    public Forest(Player player) {
        super(player, "Forest", new Vampire(), "Wood", 3, 4);
    }

}
