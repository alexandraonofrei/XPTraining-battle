package be.cegeka.battle;

public class Battle {
    public static boolean fight(Soldier attacker, Soldier defender) {
        if (attacker == null && defender != null) {
            return false;
        }

        if (attacker != null && defender == null) {
            return true;
        }

        if (attacker == null && defender == null) {
            return true;
        }

        if (attacker.getWeapon().getDamage() >= defender.getWeapon().getDamage()) {
            return true;
        }
        return false;
    }

    public static boolean fightArmies(Army attackerArmy, Army defenderArmy) {
        Soldier attacker = attackerArmy.getFighterSoldier();
        Soldier defender = defenderArmy.getFighterSoldier();

        return fight(attacker, defender);
    }
}
