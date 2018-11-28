package be.cegeka.battle;

import org.apache.commons.lang3.Validate;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

public class Soldier {
    private String name;
    private Weapon weapon;
    private String id;

    public Soldier(String name) {
        Validate.isTrue(isNotBlank(name));

        this.name = name;
        weapon = new Weapon();
    }

    public Soldier(String name, Weapon wepon) {
        Validate.isTrue(isNotBlank(name));
        this.name = name;
        this.weapon = wepon;
    }

    String getName() {
        return this.name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
