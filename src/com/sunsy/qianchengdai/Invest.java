package com.sunsy.qianchengdai;

import java.util.Date;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Invest {
	//Ͷ��ʱ��	Ͷ����	Ͷ�ʵ���Ŀ	Ͷ�ʽ������������塪������������˼ά
	private Date createTime;
	private double amount;
//	private Investor investor; //Ͷ����
//	private Loan loan;//Ͷ�ʵ���Ŀ
	private int memberId;
	private int loanId;
	
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
}
