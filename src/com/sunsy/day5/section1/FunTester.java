/**
 * 
 */
package com.sunsy.day5.section1;

/**
 * @author SEELE
 * @date 2018��4��16��
 * @email 345720475@qq.com
 */
public class FunTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * �﷨��
		 * ���η� ��������ֵ���� ���������������� ��������������{
		 * �����塣����
		 * }
		 * ����ֵ���ͣ������������͡��������͡�void
		 * ����������������շ巽ʽ���ɶ��Ը�
		 * �������� ������������������������Ӧ��Ҫ׼�������ݣ���������ģ�
		 */

		/**����
		 * �в�������봫�����
		 * ���ε����͡���������һ��
		 * �з���ֵ������return������������һ�䣩�����ص��ô���û�з���ֵʱĬ����return
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
		System.out.println("���");
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
