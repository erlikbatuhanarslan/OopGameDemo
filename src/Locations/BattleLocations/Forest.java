package Locations.BattleLocations;

import Entities.Player;
import Obstacle.Vampire;

public class Forest extends BattleLoc{
    public Forest(Player player) {
        super(3, player, "Orman", new Vampire());
    }
}
