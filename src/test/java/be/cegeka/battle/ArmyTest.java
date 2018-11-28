package be.cegeka.battle;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArmyTest {

    @Test
    public void construction_Army() {
        Army army = new Army();
        Soldier soldier1 = new Soldier("Soldier1");
        Soldier soldier2 = new Soldier("Soldier2");
        army.enroll(soldier1);
        army.enroll(soldier2);

        assertThat(army.getArmy().size()).isEqualTo(2);
    }

    @Test
    public void construction_HeadquarterEnrollSoldier() {
        Army army = new Army();
        Soldier soldier1 = new Soldier("Soldier1");
        army.enroll(soldier1);

        assertThat(soldier1.getId()).isEqualTo("100Soldier1");

    }
}
