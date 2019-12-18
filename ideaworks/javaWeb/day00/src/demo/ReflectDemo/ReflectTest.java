package demo.ReflectDemo;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //1.加载配置文件
        //1.1创建properties类对象
        Properties prop = new Properties();
        //1.2创建类加载器
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        //1.3获取加载的文件路径
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        prop.load(is);

        //2.获取配置文件中的数据
        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");

        //3.加载该类进内存
        Class cls = Class.forName(className);

        //4.实例化对象
        Object obj = cls.newInstance();

        //5.获取对象方法
        Method method = cls.getMethod(methodName,String.class);

        //6.调用方法
        method.invoke(obj,"水果");

    }
}
