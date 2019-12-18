package demo.hero2;

public class HeroTest {
    public static void main(String[] args) {
        Weapon wuqi = new Weapon("大宝剑");
        Hero hero=new Hero();
        hero.setName("亚瑟");
        //使用单独定义的实现类
//        hero.setSkill(new SkillImpl());
//        hero.attack();

        /*//使用匿名内部类
        Skill skill=new Skill() {
            @Override
            public void method() {
                System.out.println("戳戳戳");
            }
        };
        hero.setSkill(skill);//设置英雄技能
        hero.attack();*/

        //使用匿名内部类和匿名对象,,对技能对象名匿名
        hero.setSkill(new Skill() {
            @Override
            public void method() {
                System.out.println("哒哒哒哒");
            }
        });
        hero.attack();
    }
}
