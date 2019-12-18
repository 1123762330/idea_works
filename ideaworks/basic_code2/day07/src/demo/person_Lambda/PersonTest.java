package demo.person_Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class PersonTest {
    public static void main(String[] args) {
        //创建Person对象数组并添加数组
        Person[] arr = {new Person("迪丽热巴", 23),
                new Person("古力娜扎", 19),
                new Person("马尔扎哈", 22)};

        /*//进行升序排序
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/

        // 使用lambda表达式
        Arrays.sort(arr, (Person o1, Person o2) -> {
            return o1.getAge() - o2.getAge();
        });

        //遍历输出
        for (Person name : arr) {
            System.out.println(name);
        }
    }
}
