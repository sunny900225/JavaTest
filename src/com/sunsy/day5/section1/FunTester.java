/**
 * 
 */
package com.sunsy.day5.section1;

/**
 * @author SEELE
 * @date 2018年4月16日
 * @email 345720475@qq.com
 */
public class FunTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 语法：
		 * 修饰符 函数返回值类型 函数名（参数类型 参数名。。。）{
		 * 函数体。。。
		 * }
		 * 返回值类型：基本数据类型、引用类型、void
		 * 函数名：动宾短语，驼峰方式，可读性高
		 * 参数类型 参数名、、、：完成这个功能应该要准备的数据（变量保存的）
		 */

		/**传参
		 * 有参数则必须传入参数
		 * 传参的类型、个数必须一致
		 * 有返回值必须用return（方法体的最后一句），返回调用处；没有返回值时默认有return
		 */
		
		int result = add(3,2);
		System.out.println(result);
		sayHello();
		//int[] integers = new int[3];
		int[] integers = {1,2,4,5,6};
		System.out.println(add3(integers));
		add4(integers);
	}
	public static int add(int a ,int b){
		int result = a + b;
		return result;
	
	}
	public static void sayHello(){
		System.out.println("你好");
	}
	public static int add3(int[] args){
		int sum = 0;
		for (int i : args){
			
			sum = sum + i;
		}
		return sum;
	}
	public static void add4(int...is){
		for (int i : is){
			System.out.println(i);
			
		}
		
		
		
	}
}
