/**
 * 
 */
package com.sunsy.day008.section1;

import com.sunsy.qianchengdai.Member;

/**
 * @author SEELE
 * @date 2018��4��23��
 * @email 345720475@qq.com
 * @desc Ͷ����
 */
public class Investor extends Member{
	public boolean recharge(double amount){
		super.recharge(amount);//��ʽ�ĵ��ø��෽��
		System.out.println("2����ֵ�ɹ��������ȥͶ���ˣ�");
		return true;
	}

}
