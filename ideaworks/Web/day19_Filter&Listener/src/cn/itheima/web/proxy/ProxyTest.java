package cn.itheima.web.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        //1.创建真实对象
        Lenovo lenovo = new Lenovo();
        //2.使用动态代理增强lenovo对象
        SaleComputer computer1 =(SaleComputer) Proxy.newProxyInstance(lenovo.getClass().getClassLoader(),
                lenovo.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                /*System.out.println("该方法执行了.....");
                System.out.println(method.getName());
                System.out.println(args[0]);*/
                //判断是否是sale方法
                if(method.getName().equals("sale")){
                    //1.增强参数
                    double money=(double)args[0];
                     money = money * 0.85;
                    System.out.println("专车接你....");
                    //使用真实对象调用该方法
                    String obj =(String) method.invoke(lenovo, money);
                    System.out.println("免费送货上门");
                    //2.增强返回值
                    return obj+"_鼠标";
                }else {
                    //使用真实对象调用该方法
                    Object obj = method.invoke(lenovo, args);
                    return obj;
                }
            }
        });

        //2.调用方法
        String computer = computer1.sale(8000);
        System.out.println(computer);
        computer1.show();

    }
}
