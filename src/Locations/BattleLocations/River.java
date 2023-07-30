package Locations.BattleLocations;

import Entities.Player;
import Obstacle.Bear;

public class River extends BattleLoc{
    public River(Player player) {
        super(5, player, "Nehir", new Bear());
    }
}
