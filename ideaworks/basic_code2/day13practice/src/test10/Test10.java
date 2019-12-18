package test10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*通过流的方式
        1）打印全球影片排行榜中的前三甲影片名
        2）打印华人影片排行榜中倒数5名的影片名
        3）将两个排行榜中的前5名挑出来共同存入新的集合
        4）定义电影Film类，以影片名为name创建Film对象并保存至集合*/
public class Test10 {
    public static void main(String[] args) {
        //将原始数据存入集合
        ArrayList<String> global = new ArrayList<>();
        global.add("《教父》");
        global.add("《肖申克的救赎》");
        global.add("《辛德勒的名单》");
        global.add("《公民凯恩》");
        global.add("《卡萨布兰卡》");
        global.add("《教父续集》");
        global.add("《七武士》");
        global.add("《星球大战》");
        global.add("《美国美人》");
        global.add("《飞跃疯人院》");

        ArrayList<String> china = new ArrayList<>();
        china.add("《霸王别姬》");
        china.add("《大闹天宫》");
        china.add("《鬼子来了》");
        china.add("《大话西游》");
        china.add("《活着》");
        china.add("《饮食男女》");
        china.add("《无间道》");
        china.add("《天书奇谭》");
        china.add("《哪吒脑海》");
        china.add("《春光乍泄》");

        //1）打印全球影片排行榜中的前三甲影片名
        global.stream().limit(3).forEach(System.out::println);

        //2）打印华人影片排行榜中倒数5名的影片名
        china.stream().skip(china.size()-5).forEach(System.out::println);

        //3）将两个排行榜中的前5名挑出来共同存入新的集合
        List<String> list = Stream.concat(global.stream().limit(5), china.stream().limit(5)).collect(Collectors.toList());

        //4）将所有影片以影片名为name创建Film对象并保存至集合
        List<Film> filmList = Stream.concat(global.stream(), china.stream()).map(Film::new).collect(Collectors.toList());
    }
}
