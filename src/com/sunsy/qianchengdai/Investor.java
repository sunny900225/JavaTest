/**
 * 
 */
package com.sunsy.qianchengdai;

import java.util.Date;

import com.sunsy.qianchengdai.Member;

/**
 * @author SEELE
 * @date 2018��4��23��
 * @email 345720475@qq.com
 * @desc Ͷ����
 */


public class Investor extends Member{
	public int y = 1;
	public boolean recharge(double amount){
		if(super.recharge(amount)){//��ʽ�ĵ��ø��෽��
			System.out.println("��ֵ�ɹ��������ȥͶ���ˣ�");		
			return true;
		}else{
			System.out.println("Ͷ���˳�ֵʧ��");
			return false;
		}
	}
	/*
	 * �β���ʵ���൱�����һ�����ܵ�����׼��
	 * Ͷ�ʵĹ��ܣ���Ŀ��Ͷ�ʽ��
	 */
	public Invest invest(double investAmount,Loan loan){
//		if (investAmount > 0 && investAmount % 100 !=0){
		if (investAmount <= 0 || investAmount % 100 !=0){
			System.out.println("Ͷ��ʧ�ܣ�Ͷ�ʽ�����Ϊ100����������");
		}else if(investAmount > this.getLeaveAmount()){
			System.out.println("Ͷ��ʧ�ܣ����㣬��������ֵ");
		}else{
			//Ͷ��һ�ξͻ�����һ��Ͷ�ʼ�¼����������һ��Ͷ�ʶ���
			//Ͷ��ʱ��	Ͷ����	Ͷ�ʵ���Ŀ	Ͷ�ʽ������������塪������������˼ά
			Invest invest = new Invest();
			invest.setMemberId(this.getId());
			invest.setLoanId(loan.getId());
			invest.setCreateTime(new Date());
			invest.setAmount(investAmount);
			invest.setId(10086);
			
			this.setLeaveAmount(this.getLeaveAmount() - investAmount);
			System.out.println("Ͷ�ʳɹ�����ӭ����Ͷ��");
			return invest;//�������ɵ�Ͷ�ʼ�¼���������ص��ô��������ٷ���null��
		}return null;//ʲô��û������󷵻�null
	}
//	@Override
//	public void logout() {
//		// TODO Auto-generated method stub
//		System.out.println("Ͷ���˵ǳ�");
//	}

}
