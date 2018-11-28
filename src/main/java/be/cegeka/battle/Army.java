package be.cegeka.battle;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private List<Soldier> army = new ArrayList<>();

    public void enroll(Soldier soldier) {
        army.add(soldier);
    }

    public List<Soldier> getArmy() {
        return army;
    }

}
