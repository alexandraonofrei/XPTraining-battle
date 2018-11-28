package be.cegeka.battle;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SoldierTest {

    @Test
    public void construction_ASoldierMustHaveAName() {
        Soldier soldier = new Soldier("name");

        assertThat(soldier.getName()).isEqualTo("name");
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeNull() {
        new Soldier(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeEmpty() {
        new Soldier("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeBlank() {
        new Soldier("   ");
    }

    @Test
    public void construction_ASoldierMustHaveADefaultBareFitWeponType() {
        Soldier soldier = new Soldier("Bubbles");

        assertThat(soldier.getWepon().getWeaponType()).isEqualTo(WeaponType.BareFist);
    }

    @Test
    public void construction_ASoldierMustReturn_Correct_WeaponType_When_WeaponType_IsSpecified() {
        Soldier soldier = new Soldier("Bubbles");
        soldier.setWepon(new Weapon(WeaponType.Axe, 5));

        assertThat(soldier.getWepon().getWeaponType()).isEqualTo(WeaponType.Axe);
    }

    @Test
    public void construction_ASoldierMustReturn_Correct_Damage_When_Damage_IsSpecified() {
        Soldier soldier = new Soldier("Bubbles");
        soldier.setWepon(new Weapon(WeaponType.Axe, 5));

        assertThat(soldier.getWepon().getDamage()).isEqualTo(5);
    }

    @Test
    public void construction_AsAttackerKillsDefender() {
        Soldier attacker = new Soldier("Attacker");
        Soldier defender = new Soldier("Defender");

        Battle battle = new Battle(attacker, defender);

        assertThat(battle.fight()).isEqualTo("Attacker won the fight");
    }

}