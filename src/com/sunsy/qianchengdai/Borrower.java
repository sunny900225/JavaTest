/**
 * 
 */
package com.sunsy.qianchengdai;

/**
 * @author SEELE
 * @date 2018��4��23��
 * @email 345720475@qq.com
 * @desc �����
 */
public class Borrower extends Member{
	private String address;

	/**
	 * @param address
	 */
	public Borrower(String address) {
		super();
		this.address = address;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	public Borrower() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean recharge(double amount){
		boolean flag = super.recharge(amount);//��ʽ�ĵ��ø��෽��
		if (flag /*== true*/){
		System.out.println("��ֵ�ɹ��������ȥ�����ˣ�");
			return true;
		}
		else{
			System.out.println("����˳�ֵʧ��");
			return false;
		}
	}
	public static void main(String[] args){
//		boolean flag;
//		if (flag = true){
//		System.out.println("1����ֵ�ɹ��������ȥ�����ˣ�");
//		}
//		else{
//			System.out.println("1����ֵʧ�ܣ������ȥ�����ˣ�");	
//		}
		
//		Borrower br = new Borrower();
//		br.recharge(50);
//		br.register("131", "111");
		//Member member = new Member();
		//Member member = new Borrower("saaaaaaaa");
		//member.recharge(1);
		
//		Borrower b=(Borrower) member;
//		b.setAddress("address");
	}
//	@Override
//	public void logout() {
//		// TODO Auto-generated method stub
//		System.out.println("����˵ǳ�");
//	}
}
