package kucun;

public class KunCunTest extends KuCunFunction {
	public static void main(String[] args){
		caiDan();	
		while(true){
			int choose=chooseFunction();
			switch(choose){
			case 1:
				addShangPin(list);
				break;
			case 2:
				printStore(list);
				break;
			case 3:
				update(list);
				break;
			case 4:
				delShangPin(list);
				break;
			case 5:
				exit();
				return;
			default:
				System.out.println("你输入的数字不存在!");
				break;
			}
		}
	}

}
