/**
 * 
 */
package com.sunsy.qianchengdai;

import com.sunsy.qianchengdai.excp.IllegalFinancingException;

/**
 * @author SEELE
 * @date 2018年4月23日
 * @email 345720475@qq.com
 */
public class Loan {
	private int id;
	private String title;//項目标题
	private double loanRate;//年化收益12.0——》12%	受国家法律保护最高24%
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
		//如果说设置的年化收益高于24%，那么就抛出非法融资异常
		if(loanRate > 24.0){
			throw new IllegalFinancingException("警告：非法融资嫌疑");
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
