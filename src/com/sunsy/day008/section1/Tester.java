/**
 * 
 */
package com.sunsy.day008.section1;

import com.sunsy.qianchengdai.Member;
import com.sunsy.qianchengdai.Borrower;

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
