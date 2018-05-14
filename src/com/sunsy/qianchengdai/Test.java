package com.sunsy.qianchengdai;

import com.sunsy.test.BorroweTest;
import com.sunsy.test.MemberExp;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MemberExp exp = new MemberExp();
//		exp.register("13581985992", "123456");
//		exp.setLeaveAmount(100);
//		exp.setLeaveAmount(exp.getLeaveAmount()+100);
//		//System.out.println(exp.getLeaveAmount());
//		
//		BorroweTest jack = new BorroweTest();
////		jack.setId(1);
////		jack.setAddress("广东深圳");
////		System.out.println(jack.getId());
//		jack.recharge(1000);
//		
//		Investor rose = new Investor();
//		rose.setRegName("rose");
//		rose.recharge(100.0);
//		//System.out.println(rose.getRegName());
//		
//		Borrower borrower = (Borrower) new Member();
//		borrower.setAddress("11");
		
//		Investor tom = new Investor();
//		tom.recharge(1000.0);
//		
//		//投资人看了这个项目，从数据库查询出项目详情——》数据载体——》封装到项目对象
//		Loan loan = new Loan();
//		loan.setId(1);
//		loan.setTitle("资金周转");
//		loan.setAmount(100000.0);
//		loan.setLoanRate(12);//12%
//		loan.setLoanTerm(6);//6个月
//		loan.setLoanDateType(2);//月标
//		
//		Invest invest = tom.invest(800.0, loan);
//		//有了这条投资记录——》把这信息保存到数据库中间去
//		System.out.println(invest/*.toString()*/);//对象的字符串描述——》调试。返回null时，如果显式调用toString的话会报错。底层默认调用时不会报错，返回null
//		
//		System.out.println(tom.getLeaveAmount());
//		tom.invest(300.0, new Loan());
//		tom.invest(800.0, new Loan());
//		System.out.println(tom.getLeaveAmount());
		//借款人？投资人？没有太大意义，不知道具体是什么——》不能让这个类直接实例化
/*
 * 生成回款计划（1：当前投资完成，2：投资计算器）
 * 30天项目（一次性回款），投1000，年化收益10%，30天的项目
 * 	1）生成多少条回款计划——》1条
 * 	2）总利息多少——>1000*10%/360*30
 * 	3）每月怎么回款——>到期还款
 * 
 * 2：五个月的标，（按月付息到期还本）投10000，年化收益12%
 *  1）生成多少条回款计划——》5条
 * 	2）总利息多少——>10000*12%/12*5
 * 	3）每月怎么回款——>前4个月只有利息，最后一个月连本金带最后一期利息
 * 	4）每期利息——》10000*12%/12
 * 
 */		
		Loan loan = new Loan();
		loan.setAmount(10000);
		//loan.setId(25);
		loan.setLoanDateType(2);
		loan.setLoanTerm(5);
		loan.setLoanRate(12);
		
		Investor tom = new Investor();
		tom.recharge(10000.0);
		Invest invest = tom.invest(10000, loan);
		System.out.println(invest.generateRepaymentPlan(loan));
		for (Repayment repayment : invest.generateRepaymentPlan(loan)){
			System.out.println(repayment);
		}
		
		
	}

}
