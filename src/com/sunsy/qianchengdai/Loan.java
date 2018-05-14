/**
 * 
 */
package com.sunsy.qianchengdai;

import com.sunsy.qianchengdai.excp.IllegalFinancingException;

/**
 * @author SEELE
 * @date 2018��4��23��
 * @email 345720475@qq.com
 */
public class Loan {
	private int id;
	private String title;//�Ŀ����
	private double loanRate;//�껯����12.0������12%	�ܹ��ҷ��ɱ������24%
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
		//���˵���õ��껯�������24%����ô���׳��Ƿ������쳣
		if(loanRate > 24.0){
			throw new IllegalFinancingException("���棺�Ƿ���������");
		}else{
		this.loanRate = loanRate;
		}
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
