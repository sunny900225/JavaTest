/**
 * 
 */
package com.sunsy.qianchengdai;

/**
 * @author SEELE
 * @date 2018��4��23��
 * @email 345720475@qq.com
 */
public class Loan {
	private int id;
	private String title;//�Ŀ����
	private double loanRate;//�껯����
	private int loanTerm;//�������
	private double amount;//���
	private int loanDateType;//��ĵ��������ͣ�1���	2�±�
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getLoanRate() {
		return loanRate;
	}
	public void setLoanRate(double loanRate) {
		this.loanRate = loanRate;
	}
	public int getLoanTerm() {
		return loanTerm;
	}
	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getLoanDateType() {
		return loanDateType;
	}
	public void setLoanDateType(int loanDateType) {
		this.loanDateType = loanDateType;
	}

	
	
}
