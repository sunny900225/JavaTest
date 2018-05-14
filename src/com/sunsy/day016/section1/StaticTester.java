package com.sunsy.day016.section1;

public class StaticTester {
	/**
	 * 静态代码块，类初始化的时候先运行，只会运行一遍
	 */
	static {
		System.out.println("访问了静态代码块");
	}
	public static void fun(){
		System.out.println("测试");
	}
}
