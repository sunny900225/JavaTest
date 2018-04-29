package com.sunsy.day3.section2;

public class ForeachTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] strArray ={{"tom","jack"},{"tom1","jack1","rose1"},{"tom2","jack2"}};
		int length = strArray.length;
		for (int i =0; i < length; i++){
			//i是什么——》相当于索引
			String[] itemArray = strArray[i];
			int itemArrayLength = itemArray.length;
			//System.out.print(itemArray[i]);
			for (int j=0;j < itemArrayLength;j++){
			System.out.print(itemArray[j]);
		}
		System.out.println();
		}
	
//	int ages[];
//	ages= new int[2];
//	int[][] array = new int[3][];
//	array[0] = new int[3];
//	array[0]={1,2,3};
	//ages[0]=1;
	//ages={1,2};
	//for(int age:ages)
		int i;
		System.out.println(i);
		
		/**
		 * for (每个元素的类型  保存到的某个变量 : 要遍历的数组或其他集合){
		 * 循环体
		 * }
		 */
		
	for (String[] names:strArray){
		for (String name:names){
			System.out.print(name);
		}
		System.out.println();
	}
	}
}