package com.sunsy.qianchengdai;

public class Repayment {
	private int id;//回款计划id
	private int investId;//投资id
	private double interest;//利息
	private double principal;//本金
	private int status;//还款状态0未还1已还
	private int loanId;//项目id
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getInvestId() {
		return investId;
	}
	public void setInvestId(int investId) {
		this.investId = investId;
	}
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public double getPrincipal() {
		return principal;
	}
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	public int isStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Repayment [id=" + id + ", investId=" + investId + ", interest=" + interest + ", principal=" + principal
				+ ", status=" + status + ", loanId=" + loanId + "]";
	}
	
	
}
