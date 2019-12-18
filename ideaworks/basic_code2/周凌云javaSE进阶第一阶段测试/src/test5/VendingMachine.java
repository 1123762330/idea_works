package test5;

import java.util.HashMap;
import java.util.Scanner;

/*定义自动售货机类(VendingMachine)
        属性:
        机器名称(machineName  String类型)
        饮料列表(drinkList  HashMap<String, Float> 类型)
        机内剩余现金总额（leftMoney float类型）

*/

public class VendingMachine {
    private String machineName;
    HashMap<String, Float> drinkList;
    private float leftMoney;
    boolean b = false;

    public VendingMachine() {
    }


    public VendingMachine(String machineName, HashMap<String, Float> drinkList, float leftMoney) {
        this.machineName = machineName;
        this.drinkList = drinkList;
        this.leftMoney = leftMoney;
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "machineName='" + machineName + '\'' +
                ", drinkList=" + drinkList +
                ", leftMoney=" + leftMoney +
                '}';
    }

    /*在VendingMachine类中定义购买饮料的方法：
        要求:传入钞票和饮料名称后，需要判断传入的钞票是否为真、面值是否足够购买此类饮料；
        若不符合购买条件给出错误提示，结束购买流程；若购买成功后需打印出找零金额和目前机内现金总额*/

    public void shop(Money money, VendingMachine vm) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 1; i++) {
            System.out.println("请输入钱币面额:");
            float v = scanner.nextFloat();

            System.out.println("请输入钱币的真假:");
            String qian = scanner.next();

            if (qian.equals("假")) {
                b = money.isFlag() == false;
                System.out.println("识别不了投入的钱币,此次购买结束");
                break;
            } else if (qian.equals("真")) {
                System.out.println("请输入要购买的商品:");
                String s = scanner.next();

                if (!vm.drinkList.containsKey(s)) {
                    System.out.println("不好意思,没有这种饮料");
                    break;
                } else if (vm.drinkList.get(s) > v) {
                    System.out.println("钱不够,请重新输入面额和商品:");
                } else {
                    Float price = vm.drinkList.get(s);
                    System.out.println("饮料售货机成功售卖一瓶:" + s + ",消费:" + drinkList.get(s) + "元," +
                            "机内剩余:" + (vm.leftMoney - price) + ",找零:" + (v - price));
                }
            } else {
                System.out.println("钱币好像不是真的,换张试试.");
            }


        }
    }

}
