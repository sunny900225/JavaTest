package com.sunsy.test;

import com.sunsy.qianchengdai.Member;

public class BorroweTest extends Member{
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public boolean recharge(double amount) {
		//System.out.println("1");// TODO Auto-generated method stub
		if( super.recharge(amount)){
			System.out.println("��ֵ�ɹ��������ȥ�����");
			return true;
		}else{
			System.out.println("��ֵʧ��");
			return false;
		}
	}
}
