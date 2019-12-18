package cn.day08.demo;

//把数组按照指定格式拼接成字符串
public class StringConcatDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};//创建一个数组
        String s = arrayToString(arr);//调用拼接方法
        System.out.println("s=" + s);
    }

    public static String arrayToString(int[] arr) {
        //创建字符串
        String st = new String("[");
        //遍历字符串
        for (int i = 0; i < arr.length; i++) {
            //如果索引等于最后一个,那就遍历数组并且拼接字符"]"
            if (i == arr.length - 1) {
                st = st.concat(arr[i] + "]");
            } else {//否则遍历一个数就拼接一个字符"#"
                st = st.concat(arr[i] + "#");
            }
        }
        return st;
    }
}
