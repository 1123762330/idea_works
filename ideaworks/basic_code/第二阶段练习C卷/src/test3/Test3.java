package test3;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        FactoryImp factoryImp = new FactoryImp();//创建实现类对象
        List<Hat> list = factoryImp.piliang(5);//调用方法,生成帽子,存在集合里
        for (int i = 0; i < list.size(); i++) {
            Hat hat=list.get(i);
            factoryImp.describe(hat);
        }
    }
}
