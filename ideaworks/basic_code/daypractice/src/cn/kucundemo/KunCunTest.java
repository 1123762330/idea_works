package cn.kucundemo;

import cn.kucundemo.KuCunFunction;

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
				System.out.println("输入的指令错误!");
				break;
			}
		}
	}

}
