package cn.itheima.test3;
/*定义一个长度为4的String类型的数组，包含如下元素：	"12ab","java","45Cd","code67";
遍历数组进行判断，如果字符串是以数字开头或者结尾，就将该字符串转换成大写字符串，并在控制台打印输出*/

public class Test3 {
    public static void main(String[] args) {
    String[] str={"12ab","java","45Cd","code67"};
    //遍历数组
        String max="";
        for (int i = 0; i < str.length; i++) {//遍历字符串数组
            String st=str[i];//将数组遍历的字符串赋值给st
            char star = st.charAt(0);//将字符串的首字母索引
            char end=st.charAt(st.length()-1);
            if ((star>= '0' && star <= '9') || (end >= '0' && end <= '9')) {
                max = st.toUpperCase();//将这个转换成字符数组的字符串转换出大写
                System.out.print(max+" ");
            }
        }
        }

 }

