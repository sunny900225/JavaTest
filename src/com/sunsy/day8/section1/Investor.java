/**
 * 
 */
package com.sunsy.day8.section1;

import day9.Member;

/**
 * @author SEELE
 * @date 2018年4月23日
 * @email 345720475@qq.com
 * @desc 投资人
 */
public class Investor extends Member{
	public boolean recharge(double amount){
		super.recharge(amount);//显式的调用父类方法
		System.out.println("2：充值成功，你可以去投资了！");
	}

}
