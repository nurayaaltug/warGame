package locations;

import player.Player;

public abstract class NormalLocation extends Location {
    public NormalLocation(Player player, String name, int id){
        super(player, name, id);
    }

    @Override
    public boolean onLocation() {
        return true;
    }
}
