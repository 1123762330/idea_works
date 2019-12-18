package demo.AnnotationReflectDemo;


import java.lang.reflect.Method;

@Pro(className = "demo.AnnotationReflectDemo.Show",methodName = "eat")
public class AnnotationReflectTest {
    public static void main(String[] args) throws Exception {
        //1.获取class对象
        Class<AnnotationReflectTest> cls = AnnotationReflectTest.class;

        //2.获取注解对象
        Pro an = cls.getAnnotation(Pro.class);
        String className = an.className();
        String methodName = an.methodName();

        //3.加载该类进内存
        Class cls2 = Class.forName(className);

        //4.实例化对象
        Object obj = cls2.newInstance();

        //5.获取对象方法
        Method method = cls2.getMethod(methodName);

        //6.调用方法
        method.invoke(obj);
    }
}
