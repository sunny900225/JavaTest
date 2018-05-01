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
			System.out.println("�֙C̖���ܴa��ʽ�e�`");
			
		}else{
			System.out.println("ע��ɹ�");
			this.phoneNumber = phoneNumber;
			this.pwd = pwd;
		}
		
	}
	public void login(String phoneNumber,String pwd){
		System.out.println("MemberExp.login()");
	}
	/*
	 * ��ֵ���Ñ�ݔ���ֵ���~�M�г�ֵ��Ȼ���N�~��Ӧ����
	 * ������ͳ�ֵ100Ԫ��������
	 */
	//��Ʋ�������Ҫ���������ܣ���Ҫ׼����Щ����������д���β���
	public void recharge(double rechargeMount){
		if(rechargeMount < 100||rechargeMount < 0||rechargeMount%100 != 0||rechargeMount >= 50000){
			System.out.println("��ֵʧ��");
		}
		else{
			this.leaveAmount += rechargeMount;
			System.out.println("��ֵ�ɹ�");
		}
	}
	/*
	 * ����
	 * �������100Ԫ���������500000
	 * ���ֲ��������
	 */
	public void withdraw(double amount){
		//this.ʵ�������м䣬��ʾ���ø÷����ĵ�ǰ����
		if (amount < 100.0 || amount > 500000){
			System.out.println("����ʧ��");
		}else if(amount > this.leaveAmount){
			System.out.println("���㣬����ʧ��");
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
