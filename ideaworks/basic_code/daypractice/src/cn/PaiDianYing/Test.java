package cn.PaiDianYing;

import cn.PaiDianYing.Director;

public class Test {
	public static void main(String[] args){
		//invokeDirect(()-> print(""));
	}
    private static void invokeDirect(Director director){
    	director.makeMove();
    }
}
