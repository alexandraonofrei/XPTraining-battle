package be.cegeka.battle;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WarTest {

    @Test
    public void when_sameNoOfSoldiers_But_More_Damage_In_First_Army_should_win_first_army() {
        Army army = new Army();
        Soldier soldier1 = new Soldier("Soldier1", new Weapon(WeaponType.Axe, 3));
        Soldier soldier2 = new Soldier("Soldier2", new Weapon(WeaponType.Axe, 5));
        army.enroll(soldier1);
        army.enroll(soldier2);

        Army army2 = new Army();
        Soldier soldier3 = new Soldier("Soldier1", new Weapon(WeaponType.Axe, 3));
        Soldier soldier4 = new Soldier("Soldier2", new Weapon(WeaponType.Axe, 2));
        army2.enroll(soldier3);
        army2.enroll(soldier4);

        War war = new War();
        boolean result = war.fightArmies(army, army2);
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void when_sameNoOfSoldiers_But_Same_Damage_In_Armies_should_win_first_army() {
        Army army = new Army();
        Soldier soldier1 = new Soldier("Soldier1", new Weapon(WeaponType.Axe, 3));
        Soldier soldier2 = new Soldier("Soldier2", new Weapon(WeaponType.Axe, 4));
        army.enroll(soldier1);
        army.enroll(soldier2);

        Army army2 = new Army();
        Soldier soldier3 = new Soldier("Soldier1", new Weapon(WeaponType.Axe, 3));
        Soldier soldier4 = new Soldier("Soldier2", new Weapon(WeaponType.Axe, 4));
        army2.enroll(soldier3);
        army2.enroll(soldier4);

        War war = new War();
        boolean result = war.fightArmies(army, army2);
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void when_lessNoOfSoldiers_In_First_Army_But_More_Damage_In_Army_should_win_first_army() {
        Army army = new Army();
        Soldier soldier1 = new Soldier("Soldier1", new Weapon(WeaponType.Axe, 3));
        Soldier soldier2 = new Soldier("Soldier2", new Weapon(WeaponType.Axe, 7));
        army.enroll(soldier1);
        army.enroll(soldier2);

        Army army2 = new Army();
        Soldier soldier3 = new Soldier("Soldier1", new Weapon(WeaponType.Axe, 3));
        Soldier soldier4 = new Soldier("Soldier2", new Weapon(WeaponType.Axe, 4));
        Soldier soldier5 = new Soldier("Soldier2", new Weapon(WeaponType.Axe, 5));
        Soldier soldier6 = new Soldier("Soldier2", new Weapon(WeaponType.Axe, 6));
        army2.enroll(soldier3);
        army2.enroll(soldier4);
        army2.enroll(soldier5);
        army2.enroll(soldier6);

        War war = new War();
        boolean result = war.fightArmies(army, army2);
        assertThat(result).isEqualTo(true);
    }
}
