package com.sunsy.qianchengdai;

public class Repayment {
	private int id;//�ؿ�ƻ�id
	private int investId;//Ͷ��id
	private double interest;//��Ϣ
	private double principal;//����
	private int status;//����״̬0δ��1�ѻ�
	private int loanId;//��Ŀid
	
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
