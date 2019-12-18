package demo.hero2;

public class Hero {
    private String name;
    private Weapon weapon;
    private Skill skill;

    public Hero() {
    }

    public Hero(String name, Weapon weapon,Skill skill) {
        this.name = name;
        this.weapon = weapon;
        this.skill = skill;
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

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public void attack(){
        System.out.println(name+"正在施放技能");
        skill.method(); // 调用接口中的抽象方法
        System.out.println("施放技能完成。");
    }
}
