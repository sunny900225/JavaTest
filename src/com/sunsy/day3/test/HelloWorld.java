package com.sunsy.day3.test;

public class HelloWorld {
	public static void main (String args[]){
		System.out.println("HelloWorld!");

		String[] Array={"��","��","��","��","��"} ;
		String Array2[]={"��","��","��","��","��"} ;
		int [] num={100,200,300,400,500} ;
		int num2[]={100,200,300,400,500} ;
		for(String word:Array){
		System.out.print(word);	
		}
		System.out.println();
		for(int i=0;i<5;i++){
			System.out.print(Array2[i]);			
		}
		System.out.println();
		int length=Array.length;
		int i=0;
		for(i=0;i<length-1;i++){
			System.out.print(num[i]+",");			
		}
		System.out.print(num[i]);
		char b = %;
		long g = 3;
		float j = 2.3f;
		double n = 3.3;
		
		String[][] strArray = {{"��һ��","��ά"},{"��","��"}};
		String strArray_2[][] = {{"��һ��","��ά"},{"��","��"}};
		String[][] strArray2 = {{"��","��"},{"��","��"},{"ά","��","��"}} ;
		String strArray2_2[][] = {{"��","��"},{"��","��"},{"ά","��","��"}} ;
		int[][] intArray = {{10,20},{30,40}};
		int intArray_2[][] = {{10,20},{30,40}};
		int[][] intArray2 = {{50,60},{70,80},{90,100,110}};
		int intArray2_2[][] = {{50,60},{70,80},{90,100,110}};
	}
}
