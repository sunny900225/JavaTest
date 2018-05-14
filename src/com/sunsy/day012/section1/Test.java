package com.sunsy.day012.section1;

public class Test {
public static void main(String[] args) {
//	int[] ages = new int[70];
//	System.out.println(ages[70]);
	System.out.println(div(10,0));
	
}
public static int div(int a,int b){
	int result = 0;
	result = a / b;
	
	int[] ages = new int[70];
	System.out.println(ages[71]);//數組越界異常
	System.out.println("0：數組越界后");	
	try{
		result = a / b;
		
		//int[] ages = new int[70];
		System.out.println(ages[71]);//數組越界異常
		System.out.println("0：數組越界后");
	}catch(ArithmeticException e){
		System.out.println("1:出現異常");
	}catch(ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
		System.out.println("1：出現數組越界異常");
	}finally {
		System.out.println("finally塊");
		//對資源進行釋放：數據庫的鏈接、io流操作對象
	}
	System.out.println("2:外層");
	return result;
}
}
