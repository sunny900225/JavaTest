/**
 * 
 */
package com.sunsy.day8.section1;

import day9.Borrower;
import day9.Member;

/**
 * @author SEELE
 * @date 2018��4��23��
 * @email 345720475@qq.com
 */
public class Tester {
	public static void main(String[] args){
		Member tom = new Member();
		tom.setmobilePhone("1388888");
		String mobilePhone = tom.getmobilePhone();
		System.out.println(mobilePhone);
		Borrower jack = new Borrower();
		jack.setId(1);
		jack.setAddress("�㶫����");
		System.out.println(jack.getId());
	}

}
