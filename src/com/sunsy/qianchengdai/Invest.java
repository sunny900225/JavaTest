package com.sunsy.qianchengdai;

import java.util.ArrayList;
import java.util.Date;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Invest {
	//投资时间	投资人	投资的项目	投资金额——》数据载体——》面向对象的思维
	private int id;
	private Date createTime;
	private double amount;
//	private Investor investor; //投资人
//	private Loan loan;//投资的项目
	private int memberId;
	private int loanId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	@Override
	public String toString() {
		return "Invest [createTime=" + createTime + ", amount=" + amount + ", memberId=" + memberId + ", loanId="
				+ loanId + "]";
	}
	public ArrayList<Repayment> generateRepaymentPlan(Loan loan){
		//需要知道的信息：
		//投资金额——》投资自己的实例方法，不用传
		//投资id
		//项目信息：年化收益
		//项目信息：投资项目周期
		//项目信息：投资项目类型
		
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
		 */		
		//天标
		double amount = this.getAmount();
		int id = this.getId();
		double loanRate = loan.getLoanRate();
		int loanTerm = loan.getLoanTerm();
		ArrayList<Repayment> repayments = new ArrayList<>();
		
		if(loan.getLoanDateType() == 1){
			Repayment repayment = new Repayment();
			repayment.setId(1);
			repayment.setLoanId(loan.getId());
			repayment.setPrincipal(amount);
			repayment.setInvestId(id);
			repayment.setStatus(0);//沒有回款的
			
			//利息=投资金额*年化收益/100/360*投资期限
			double interest = amount*loanRate/100/360*loanTerm;
			repayment.setInterest(interest);
			//System.out.println(repayment);
			
			repayments.add(repayment);
			return repayments;
			
		}else if(loan.getLoanDateType() == 2){
			for (int i=1;i <= loanTerm;i++){
				Repayment repayment = new Repayment();
				repayment.setId(i);
				repayment.setLoanId(loan.getId());
				repayment.setInvestId(id);
				repayment.setStatus(0);//沒有回款的
				
				//利息=投资金额*年化收益/100/12*投资期限
				double interest = amount*loanRate/100/12;
				repayment.setInterest(interest);
				if (i == loanTerm){
					repayment.setPrincipal(amount);
				}else{
					repayment.setPrincipal(0);
				}
				//System.out.println(repayment);
				repayments.add(repayment);
				
			}return repayments;
		}
		return null;

	}
}
