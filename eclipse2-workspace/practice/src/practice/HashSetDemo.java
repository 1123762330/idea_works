package practice;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
   public static void main(String[] args){
	   
	   String[] strArr=new String[]{"aa","bb","cc","a","b","c","aa","cc","dd","ee","bb","c"};
	   //请将上列数组去重
	  HashSet<String> set=new HashSet<String>();
	  
	  for(int i=0;i<strArr.length;i++){
		  set.add(strArr[i]);
	  }
	  
	//打印出set集合里面的内容
      Iterator<String>  itr=set.iterator(); //利用迭代器遍历数组
	  while(itr.hasNext()){
		  String tmp=itr.next();
		  System.out.println(tmp);
	  }
	  
	  System.out.println("————————————————————————————————————————————————————————");
	  //第二种方法  jdk中自带一种方法，增强for循环，来遍历集合
	  for(String tmp:set){
		  System.out.println(tmp);
	  }
	  
	  //取出set集合中元素个数
	  int size=set.size();
	  System.out.println("set集合中元素个数为："+size);
	  
	  //判断set中是否包含某一个值
	  boolean con=set.contains("ff");
	  System.out.println(con);
	  
	  //清空set集合
	  set.clear();
	  System.out.println(set.size());
	  
   }
}
