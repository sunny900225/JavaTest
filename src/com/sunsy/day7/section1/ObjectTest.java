/**
 * 
 */
package com.sunsy.day7.section1;

import java.util.Date;

/**
 * @author SEELE
 * @date 2018年4月20日
 * @email 345720475@qq.com
 */
public class ObjectTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age1 = 20;
		Integer age = new Integer(20);
		int age2 = age.intValue();
		System.out.println(age2);
		
		String value = "12345";
		System.out.println(value.substring(1, 5));//不包括5（第六个），包括1
		int a = Integer.parseInt(value);
		System.out.println(a);
		
		
	}

}
