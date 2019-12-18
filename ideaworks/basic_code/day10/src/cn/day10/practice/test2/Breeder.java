package cn.day10.practice.test2;

/*饲养员类中定义一个方法,传入动物类对象(父类),
        调用吃饭方法,如果有游泳方法也需进行测试*/
public class Breeder {
    public void feed(Animal animal) {
        animal.drink();
        animal.eat();
        if (animal instanceof Swim) {//如果动物会游泳
            Swim d = (Swim) animal;//向下转型,动物转成具体动物
            d.swim();
        }
    }
}
