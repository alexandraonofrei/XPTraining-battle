package be.cegeka.battle;

import java.util.List;

public class War {

    public boolean fightArmies(Army army1, Army army2) {
        List<Soldier> soldiersArmy1 = army1.getArmy();
        List<Soldier> soldiersArmy2 = army2.getArmy();

        int smallerArmyLen = soldiersArmy1.size() < soldiersArmy2.size() ? soldiersArmy1.size() : soldiersArmy2.size();
        while (smallerArmyLen != 0) {
            Battle battle = new Battle(soldiersArmy1.get(0), soldiersArmy2.get(0));
            if (battle.fight()) {
                army2.removeFromArmy();
            } else {
                army1.removeFromArmy();
            }

            smallerArmyLen = soldiersArmy1.size() < soldiersArmy2.size() ? soldiersArmy1.size() : soldiersArmy2.size();
        }

        if (soldiersArmy1.size() > 0) return true;
        return false;
    }
}
