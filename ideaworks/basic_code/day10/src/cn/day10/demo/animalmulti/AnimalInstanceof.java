package cn.day10.demo.animalmulti;
//instanceof  关键字是判断是否属于同一类型,返回的是boolean类型
public class AnimalInstanceof {
    public static void main(String[] args) {
        Animal cat=new Cat();//向上转换,将猫转换成动物
        cat.eat();
    }

    //定义向下转换
    public static void giveMeAPet(Animal animal){
        if(animal instanceof Dog){
         Dog dog=(Dog) animal;
         dog.watchHouse();
        }

        if(animal instanceof Cat){
            Cat cat=(Cat) animal;
            cat.catchMouse();
        }
    }
}
