package test1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*实现用户登录：键盘输入要登录的用户名与密码，若与user.txt文件中的用户信息一致，则打印登录成功，否则打印登录失败。
 user.txt文件的内容如下(“=”左边为用户名，“=”右边为密码)：
zhangsan=123456
admin=123abc*/
public class Test1 {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new FileReader("周凌云javaSE进阶第二阶段第3卷\\src\\test1\\user.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] s = line.split("=");
            map.put(s[0], s[1]);
        }

        Set<String> keySet = map.keySet();
        System.out.println("请输入用户名:");
        String name = sc.next();
        if (keySet.contains(name)) {
            System.out.println("请输入密码:");
            String possword = sc.next();
            if (possword.equals(map.get(name))) {
                System.out.println("登录成功");
            } else {
                System.out.println("登录失败");
            }
        } else {
            System.out.println("用户名不存在!");
        }
    }
}

