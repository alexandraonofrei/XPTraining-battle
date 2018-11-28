package be.cegeka.battle;

public class Battle {
    private Soldier attacker;
    private Soldier defender;
    private final static String wonMessage = " won the fight";

    public Battle(Soldier attacker, Soldier defender) {
        this.attacker = attacker;
        this.defender = defender;
    }

    public String fight() {
        if (attacker.getWepon().getDamage() >= defender.getWepon().getDamage()) {
            return attacker.getName() + wonMessage;
        }

        return defender.getName() + wonMessage;
    }
}
