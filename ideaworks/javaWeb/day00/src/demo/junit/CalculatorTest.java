package demo.junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    @Before
    public void inti(){
        System.out.println("我先执行");
    }

    @Test
    public void testAdd(){
        //创建对象
        Calculator c = new Calculator();
        //调用方法
        int result = c.add(1, 2);
        //断言
        Assert.assertEquals(3,result);
    }

    @Test
    public void testSub(){
        //创建对象
        Calculator c = new Calculator();
        //调用方法
        int result = c.sub(4, 2);
        //断言
        Assert.assertEquals(2,result);
    }

    @After
    public void close(){
        System.out.println("我最后执行");
    }

}
