package demo.hero;

public class Hero {
    private String name;
    private Weapon weapon;

    public Hero() {
    }

    public Hero(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public void attack(){
        System.out.println(getName()+"拿着"+weapon.getName()+"在战斗");
    }
}
