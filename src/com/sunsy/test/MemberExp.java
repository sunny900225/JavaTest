package com.sunsy.test;

import java.util.Date;

public class MemberExp {
	private int id;
	private String regName;
	private String phoneNumber;
	private String pwd;
	private double leaveAmount;
	
	public MemberExp() {
		super();
	}
	private MemberExp(int id) {
		super();
		if(id < 0){
			this.id = 0;
		}else{
			this.id = id;
		}
	}
	public MemberExp(int id, String regName, String phoneNumber, String pwd, int leaveAmount) {
		super();
		this.id = id;
		this.regName = regName;
		this.phoneNumber = phoneNumber;
		this.pwd = pwd;
		this.leaveAmount = leaveAmount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRegName() {
		return regName;
	}
	public void setRegName(String regName) {
		this.regName = regName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
public String getPwd() {
	return pwd;
}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public double getLeaveAmount() {
		return leaveAmount;
	}
	public void setLeaveAmount(double leaveAmount) {
		this.leaveAmount = leaveAmount;
	}
	public void register(String phoneNumber,String pwd){
		if (phoneNumber == null||phoneNumber.length()!= 11||pwd.length()<6||pwd.length()>16){
			System.out.println("手機號或密碼格式錯誤");
			
		}else{
			System.out.println("注册成功");
			this.phoneNumber = phoneNumber;
			this.pwd = pwd;
		}
		
	}
	public void login(String phoneNumber,String pwd){
		System.out.println("MemberExp.login()");
	}
	/*
	 * 充值：用戶輸入充值金額進行充值，然後餘額相应增加
	 * 单笔最低充值100元，正整数
	 */
	//设计参数：我要完成这个功能，我要准备哪些参数——》写到形参上
	public void recharge(double rechargeMount){
		if(rechargeMount < 100||rechargeMount < 0||rechargeMount%100 != 0||rechargeMount >= 50000){
			System.out.println("充值失败");
		}
		else{
			this.leaveAmount += rechargeMount;
			System.out.println("充值成功");
		}
	}
	/*
	 * 提现
	 * 最低提现100元，最大提现500000
	 * 提现不大于余额
	 */
	public void withdraw(double amount){
		//this.实例方法中间，表示调用该方法的当前对象
		if (amount < 100.0 || amount > 500000){
			System.out.println("提现失败");
		}else if(amount > this.leaveAmount){
			System.out.println("余额不足，提现失败");
		}else{
			this.leaveAmount -= amount;
		}
		
	}
	
	public static void main(String[] args) {
		//MemberExp exp = new MemberExp(-100);
		//System.out.println(exp.id);
		MemberExp e = new MemberExp();
		e.recharge(500);
		System.out.println(e.leaveAmount);
		e.recharge(50);
		System.out.println(e.leaveAmount);
	}
}
