/**
 * 
 */
package com.sunsy.day5.section1;

/**
 * @author SEELE
 * @date 2018Äê4ÔÂ16ÈÕ
 * @email 345720475@qq.com
 */
public class Fun2Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(parrotThing(10));
		int[] money = {1,15,20,10,5};
		System.out.println(parrotSum(money));
	}
	public static boolean validate(int money){
		if (money <= 5){
			return false;
		}else{
			return true;
		}
	}
	public static int parrotThing(int money){
		boolean flag = validate (money);
		if (flag){
			return money;
		}else{
			return 0;
		}
	}
	public static int parrotSum(int... money){
		int sum = 0;
		for (int i: money){
			
			sum = sum +parrotThing(i);
		}
		return sum;
	}

}
