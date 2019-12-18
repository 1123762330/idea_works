package demo.hero;

public class HeroTest {
    public static void main(String[] args) {
        Weapon weapon = new Weapon("大宝剑");
        Hero hero = new Hero("亚瑟",weapon);
        hero.attack();

    }
}
