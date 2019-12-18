package test04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Demo {

    public static void main(String[] args) {
        //普通的学(被代理的对象)
       Student s =  new PTStudent();

       //学霸(代理对象)
        Student stu = (Student)Proxy.newProxyInstance(s.getClass().getClassLoader(), s.getClass().getInterfaces(), new InvocationHandler() {
            /*
            proxy:代理对象,很少用
            method:代码对象调用的方法,被封装成反射里面的method
            args;代理对象调用方法,传递的实际参数
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //拿到当前执行的方法进行判断
                if(method.getName().equals("study")){
                    //是study方法就增强
                    method.invoke(s,args);//执行原有方法
                    System.out.println("我变成学霸了");//增强
                    return null;
                }else{
                    //不是study方法,就原样执行
                    Object obj = method.invoke(s, args);
                    return obj;
                }
            }
        });

        test(stu);
    }

    public static void test(Student s){
        s.study();
        s.eat();
    }

}
