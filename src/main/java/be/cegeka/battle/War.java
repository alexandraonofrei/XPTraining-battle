package be.cegeka.battle;

import java.util.List;

public class War {

    public boolean fightArmies(Army army1, Army army2) {
        List<Soldier> soldiersArmy1 = army1.getArmy();
        List<Soldier> soldiersArmy2 = army2.getArmy();

        int smallerArmyLen = getSmallerArmyLen(soldiersArmy1, soldiersArmy2);
        while (smallerArmyLen != 0) {

            if (Battle.fightArmies(army1, army2)) {
                army2.removeFromArmy();
            } else {
                army1.removeFromArmy();
            }

            smallerArmyLen = getSmallerArmyLen(soldiersArmy1, soldiersArmy2);
        }

        if (soldiersArmy1.size() > 0) return true;
        return false;
    }

    private int getSmallerArmyLen(List<Soldier> soldiersArmy1, List<Soldier> soldiersArmy2) {
        return soldiersArmy1.size() < soldiersArmy2.size() ? soldiersArmy1.size() : soldiersArmy2.size();
    }
}
