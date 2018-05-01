/**
 * 
 */
package com.sunsy.qianchengdai;

/**
 * @author SEELE
 * @date 2018年4月23日
 * @email 345720475@qq.com
 */
public class Loan {
	private int id;
	private String title;//項目标题
	private double loanRate;//年化收益
	private int loanTerm;//借款周期
	private double amount;//金额
	private int loanDateType;//标的的日期类型：1天标	2月标
	
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
