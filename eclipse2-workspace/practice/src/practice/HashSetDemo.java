package practice;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
   public static void main(String[] args){
	   
	   String[] strArr=new String[]{"aa","bb","cc","a","b","c","aa","cc","dd","ee","bb","c"};
	   //�뽫��������ȥ��
	  HashSet<String> set=new HashSet<String>();
	  
	  for(int i=0;i<strArr.length;i++){
		  set.add(strArr[i]);
	  }
	  
	//��ӡ��set�������������
      Iterator<String>  itr=set.iterator(); //���õ�������������
	  while(itr.hasNext()){
		  String tmp=itr.next();
		  System.out.println(tmp);
	  }
	  
	  System.out.println("����������������������������������������������������������������������������������������������������������������");
	  //�ڶ��ַ���  jdk���Դ�һ�ַ�������ǿforѭ��������������
	  for(String tmp:set){
		  System.out.println(tmp);
	  }
	  
	  //ȡ��set������Ԫ�ظ���
	  int size=set.size();
	  System.out.println("set������Ԫ�ظ���Ϊ��"+size);
	  
	  //�ж�set���Ƿ����ĳһ��ֵ
	  boolean con=set.contains("ff");
	  System.out.println(con);
	  
	  //���set����
	  set.clear();
	  System.out.println(set.size());
	  
   }
}
