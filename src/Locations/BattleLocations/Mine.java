package Locations.BattleLocations;

import Entities.Player;
import Obstacle.Snake;

public class Mine extends BattleLoc{
    public Mine( Player player) {
        super(6, player, "Maden", new Snake());
    }
}
