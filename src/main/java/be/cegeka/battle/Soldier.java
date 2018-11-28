package be.cegeka.battle;

import org.apache.commons.lang3.Validate;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

public class Soldier {
    private String name;
    private Weapon wepon;
    private String id;

    public Soldier(String name) {
        Validate.isTrue(isNotBlank(name));

        this.name = name;
        wepon = new Weapon();
    }

    public Soldier(String name, Weapon wepon) {
        Validate.isTrue(isNotBlank(name));
        this.name = name;
        this.wepon = wepon;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
