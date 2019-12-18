package practice;

public class StringDemo {
	public static void main(String[] args){
		//×Ö·û´®´´½¨·½·¨
		String str1=new String("zhangsan,lisi,Wangwu,DEMO");
		String str2=("zhangsan,lisi,Wangwu,DEMO");
		
		//×Ö·û´®ÇÐ¸î
	    String[] spl=str1.split(",");
		for(int i=0;i<spl.length;i++){
		System.out.println(spl[i]);
		}
		
		//×Ö·û´®µÄ³¤¶È
		System.out.println(str1.length());
		
		//ÅÐ¶ÏÁ½¸ö×Ö·û´´ÊÇ·ñÏàµÈ
		boolean equal=str1.equals(str2);
		System.out.println(equal);
		System.out.println(str1.equals("abc"));
		
		//½«×Ö·û´®´óÐ¡Ð´×ª»»
		String upper=str1.toUpperCase();
		String upper2=str1.toLowerCase();
		System.out.println(upper);
		System.out.println(upper2);
		
		//ÅÐ¶Ï×Ö·û´®ÆðÊ¼×Ö·û
		boolean star=str1.startsWith("z");
		System.out.println(star);
		
		//ÅÐ¶Ï×Ö·û´®ÖÕÖ¹×Ö·û
		boolean end=str1.endsWith("dd");
		System.out.println(end);
		
		//×Ö·û´®½ØÈ¡  ÆðÊ¼½Å±êºÍÖÕÖ¹½Å±ê
		String aa=str1.substring(0,6);
		System.out.println(aa);
		
		
	} 

}
