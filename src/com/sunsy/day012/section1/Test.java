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
	System.out.println(ages[71]);//���MԽ�箐��
	System.out.println("0�����MԽ���");	
	try{
		result = a / b;
		
		//int[] ages = new int[70];
		System.out.println(ages[71]);//���MԽ�箐��
		System.out.println("0�����MԽ���");
	}catch(ArithmeticException e){
		System.out.println("1:���F����");
	}catch(ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
		System.out.println("1�����F���MԽ�箐��");
	}finally {
		System.out.println("finally�K");
		//���YԴ�M��ጷţ��������朽ӡ�io����������
	}
	System.out.println("2:���");
	return result;
}
}
