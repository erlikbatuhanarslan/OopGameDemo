package Locations.BattleLocations;

import Entities.Player;
import Obstacle.Zombie;

public class Cave extends BattleLoc{
    public Cave( Player player) {
        super(4, player, "Mağara", new Zombie());
    }
}
