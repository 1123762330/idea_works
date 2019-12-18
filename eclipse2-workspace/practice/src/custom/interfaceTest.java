package custom;   
 public class interfaceTest{
	  public static void main(String[] args){
			IMassage im=new IMassage();
            im.getMessage();
}
}

class IMassage implements Inter1 {
		public void getMessage(){
			System.out.println("this is a message");}
}
