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
		Investor tom = new Investor();
		tom.recharge(1000.0);
		
		//Ͷ���˿��������Ŀ�������ݿ��ѯ����Ŀ���顪�����������塪������װ����Ŀ����
		Loan loan = new Loan();
		loan.setId(1);
		loan.setTitle("�ʽ���ת");
		loan.setAmount(100000.0);
		loan.setLoanRate(12);//12%
		loan.setLoanTerm(6);//6����
		loan.setLoanDateType(2);//�±�
		
		Invest invest = tom.invest(800.0, loan);
		//��������Ͷ�ʼ�¼������������Ϣ���浽���ݿ��м�ȥ
		System.out.println(invest/*.toString()*/);//������ַ����������������ԡ�����nullʱ�������ʽ����toString�Ļ��ᱨ���ײ�Ĭ�ϵ���ʱ���ᱨ������null
		
		tom.invest(300.0, new Loan());
		tom.invest(800.0, new Loan());
		System.out.println(tom.getLeaveAmount());
		
	}

}
