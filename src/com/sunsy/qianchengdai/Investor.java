/**
 * 
 */
package com.sunsy.qianchengdai;

import java.util.Date;

import com.sunsy.qianchengdai.Member;

/**
 * @author SEELE
 * @date 2018年4月23日
 * @email 345720475@qq.com
 * @desc 投资人
 */


public class Investor extends Member{
	public int y = 1;
	public boolean recharge(double amount){
		if(super.recharge(amount)){//显式的调用父类方法
			System.out.println("充值成功，你可以去投资了！");		
			return true;
		}else{
			System.out.println("投资人充值失败");
			return false;
		}
	}
	/*
	 * 形参其实就相当于完成一个功能的数据准备
	 * 投资的功能：项目、投资金额
	 */
	public Invest invest(double investAmount,Loan loan){
//		if (investAmount > 0 && investAmount % 100 !=0){
		if (investAmount <= 0 || investAmount % 100 !=0){
			System.out.println("投资失败：投资金额必须为100的正整数被");
		}else if(investAmount > this.getLeaveAmount()){
			System.out.println("投资失败：余额不足，请立即充值");
		}else{
			//投资一次就会生成一条投资记录——》创建一个投资对象
			//投资时间	投资人	投资的项目	投资金额——》数据载体——》面向对象的思维
			Invest invest = new Invest();
			invest.setMemberId(this.getId());
			invest.setLoanId(loan.getId());
			invest.setCreateTime(new Date());
			invest.setAmount(investAmount);
			invest.setId(10086);
			
			this.setLeaveAmount(this.getLeaveAmount() - investAmount);
			System.out.println("投资成功，欢迎再来投资");
			return invest;//返回生成的投资记录——》返回调用处，不会再返回null了
		}return null;//什么都没返回最后返回null
	}
//	@Override
//	public void logout() {
//		// TODO Auto-generated method stub
//		System.out.println("投资人登出");
//	}

}
