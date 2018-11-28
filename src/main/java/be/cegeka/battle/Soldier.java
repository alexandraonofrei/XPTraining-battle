package be.cegeka.battle;

import org.apache.commons.lang3.Validate;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

public class Soldier {
    private String name;
    private Weapon wepon;

    public Soldier(String name) {
        Validate.isTrue(isNotBlank(name));

        this.name = name;
        wepon = new Weapon();
    }

    String getName() {
        return this.name;
    }

    public Weapon getWepon() {
        return wepon;
    }

    public void setWepon(Weapon wepon) {
        this.wepon = wepon;
    }
}
