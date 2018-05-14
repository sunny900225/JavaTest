package com.sunsy.qianchengdai;

import java.util.ArrayList;
import java.util.Date;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Invest {
	//Ͷ��ʱ��	Ͷ����	Ͷ�ʵ���Ŀ	Ͷ�ʽ������������塪������������˼ά
	private int id;
	private Date createTime;
	private double amount;
//	private Investor investor; //Ͷ����
//	private Loan loan;//Ͷ�ʵ���Ŀ
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
		//��Ҫ֪������Ϣ��
		//Ͷ�ʽ�����Ͷ���Լ���ʵ�����������ô�
		//Ͷ��id
		//��Ŀ��Ϣ���껯����
		//��Ŀ��Ϣ��Ͷ����Ŀ����
		//��Ŀ��Ϣ��Ͷ����Ŀ����
		
		/*
		 * ���ɻؿ�ƻ���1����ǰͶ����ɣ�2��Ͷ�ʼ�������
		 * 30����Ŀ��һ���Իؿ��Ͷ1000���껯����10%��30�����Ŀ
		 * 	1�����ɶ������ؿ�ƻ�������1��
		 * 	2������Ϣ���١���>1000*10%/360*30
		 * 	3��ÿ����ô�ؿ��>���ڻ���
		 * 
		 * 2������µı꣬�����¸�Ϣ���ڻ�����Ͷ10000���껯����12%
		 *  1�����ɶ������ؿ�ƻ�������5��
		 * 	2������Ϣ���١���>10000*12%/12*5
		 * 	3��ÿ����ô�ؿ��>ǰ4����ֻ����Ϣ�����һ��������������һ����Ϣ
		 * 	4��ÿ����Ϣ������10000*12%/12
		 */		
		//���
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
			repayment.setStatus(0);//�]�лؿ��
			
			//��Ϣ=Ͷ�ʽ��*�껯����/100/360*Ͷ������
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
				repayment.setStatus(0);//�]�лؿ��
				
				//��Ϣ=Ͷ�ʽ��*�껯����/100/12*Ͷ������
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
