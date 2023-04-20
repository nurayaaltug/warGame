package locations;

import obstacle.Bear;
import player.Player;

public class River extends BattleLocation{
    public River(Player player) {
        super(player, "River", new Bear(), "Water", 2, 5);
    }
}
