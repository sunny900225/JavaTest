package com.sunsy.day3.section2;

public class DoWhileTester {
	public static void main(String args[]){
		int i = 1000;
		do {
			System.out.println(i);
			i=i+1;
		}while (i<=100);
		/*
		 * while：先判断后执行
		 * do……while：先执行后判断
		 * 
		 * while:判断次数=执行循环的次数+1（使之不成立来判断,能执行次数一样，不能执行多1）
		 * do..while:判断次数=执行循环的次数
		 * 
		 */
	}
}
