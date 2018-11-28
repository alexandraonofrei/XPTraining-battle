package be.cegeka.battle;

public class Weapon {
    public WeaponType weaponType;
    public int damage;

    public Weapon() {
        this.weaponType = WeaponType.BareFist;
    }

    public Weapon(WeaponType weaponType, int damage) {
        this.weaponType = weaponType;
        this.damage = damage;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
