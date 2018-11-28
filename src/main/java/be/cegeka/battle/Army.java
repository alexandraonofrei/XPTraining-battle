package be.cegeka.battle;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private List<Soldier> army = new ArrayList<>();

    public void enroll(Soldier soldier) {
        Headquarters hq = new Headquarters();
        army.add(soldier);

        int soldier1Id = hq.reportEnlistment(soldier.getName());
        soldier.setId(soldier1Id + soldier.getName());
    }

    public List<Soldier> getArmy() {
        return army;
    }

    public void removeFromArmy() {
        if (army.size() > 0) {
            army.remove(0);
        }
    }

    public Soldier getFighterSoldier() {
        if (army.size() > 0) {
            return army.get(0);
        }

        return null;
    }
}
