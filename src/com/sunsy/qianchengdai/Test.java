package com.sunsy.qianchengdai;

import com.sunsy.test.BorroweTest;
import com.sunsy.test.MemberExp;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MemberExp exp = new MemberExp();
//		exp.register("13581985992", "123456");
//		exp.setLeaveAmount(100);
//		exp.setLeaveAmount(exp.getLeaveAmount()+100);
//		//System.out.println(exp.getLeaveAmount());
//		
//		BorroweTest jack = new BorroweTest();
////		jack.setId(1);
////		jack.setAddress("�㶫����");
////		System.out.println(jack.getId());
//		jack.recharge(1000);
//		
//		Investor rose = new Investor();
//		rose.setRegName("rose");
//		rose.recharge(100.0);
//		//System.out.println(rose.getRegName());
//		
//		Borrower borrower = (Borrower) new Member();
//		borrower.setAddress("11");
		
//		Investor tom = new Investor();
//		tom.recharge(1000.0);
//		
//		//Ͷ���˿��������Ŀ�������ݿ��ѯ����Ŀ���顪�����������塪������װ����Ŀ����
//		Loan loan = new Loan();
//		loan.setId(1);
//		loan.setTitle("�ʽ���ת");
//		loan.setAmount(100000.0);
//		loan.setLoanRate(12);//12%
//		loan.setLoanTerm(6);//6����
//		loan.setLoanDateType(2);//�±�
//		
//		Invest invest = tom.invest(800.0, loan);
//		//��������Ͷ�ʼ�¼������������Ϣ���浽���ݿ��м�ȥ
//		System.out.println(invest/*.toString()*/);//������ַ����������������ԡ�����nullʱ�������ʽ����toString�Ļ��ᱨ���ײ�Ĭ�ϵ���ʱ���ᱨ������null
//		
//		System.out.println(tom.getLeaveAmount());
//		tom.invest(300.0, new Loan());
//		tom.invest(800.0, new Loan());
//		System.out.println(tom.getLeaveAmount());
		//����ˣ�Ͷ���ˣ�û��̫�����壬��֪��������ʲô�����������������ֱ��ʵ����
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
 * 
 */		
		Loan loan = new Loan();
		loan.setAmount(10000);
		//loan.setId(25);
		loan.setLoanDateType(2);
		loan.setLoanTerm(5);
		loan.setLoanRate(12);
		
		Investor tom = new Investor();
		tom.recharge(10000.0);
		Invest invest = tom.invest(10000, loan);
		System.out.println(invest.generateRepaymentPlan(loan));
		for (Repayment repayment : invest.generateRepaymentPlan(loan)){
			System.out.println(repayment);
		}
		
		
	}

}
