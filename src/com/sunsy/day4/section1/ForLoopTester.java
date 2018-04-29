package com.sunsy.day4.section1;

public class ForLoopTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0;i<=100;i++){
			if (i%2 == 1){
				continue;//跳过本次循环
			}
			System.out.println(i);	
			if (i == 50){
				break;
			}
			
		}
	}

}
