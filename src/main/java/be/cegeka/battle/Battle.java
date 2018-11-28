package be.cegeka.battle;

public class Battle {
    private final static String wonMessage = " won the fight";
    private Soldier attacker;
    private Soldier defender;

    public Battle(Soldier attacker, Soldier defender) {
        this.attacker = attacker;
        this.defender = defender;
    }

    public boolean fight() {
        if (attacker.getWepon().getDamage() >= defender.getWepon().getDamage()) {
            return true;
        }
        return false;
    }
}
