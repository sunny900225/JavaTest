/**
 * 
 */
package com.sunsy.day6.section2;

/**
 * @author SEELE
 * @date 2018��4��18��
 * @email 345720475@qq.com
 */
public class Member {
	//1������������������ԡ�������Ա����
	public int id;
	public String regName;
	public String mobilePhone;
	public String pwd;
	
	
	//2�����������������Ϊ����������
	public void register(String mobilePhone,String pwd){
		//ע���߼�
		/**
		 * 1:��ǰ��ҳ���ռ��ֻ��ź�����
		 * 2���������������Fiddler��jmeter��postman)�������������󡪡���http���󡪡��������
		 * 3��У�顪�����ֻ���11λ������6-18λ
		 * 4�����������Ҫ�󡪡�����ʾ�û����ֻ��Ż������ʽ����
		 * 5:����Ҫ�󡪡���NA�ֻ���ȥ���ݿ��ѯ�Ƿ���ע��
		 * 5������Ѵ��ڡ�������ʾ�û���ע��
		 * 7����������ڡ�����ע�ᡪ�����������ݿ⡪����ע��ɹ�
		 */
		/*
		 * ������ֻ��Ų�����Ҫ��{
		 * ����ֻ��Ż������ʽ����
		 * }����{
		 * ���ע��ɹ�
		 * }
		 * 
		 */
		if(mobilePhone.length()!=11 || pwd.length()<6 ||pwd.length()>18){
			System.out.println("�ֻ��Ż������ʽ����");
		}else{
			System.out.println("ע��ɹ�");
		}
		
	}
	public void login(String mobilePhone,String pwd){
		//��¼�߼�
		/**
		 * 
		 */
	}
	public Member(String phone,String passwd){
		mobilePhone = phone;
		pwd = passwd;
	}
	
	/**
	 * @param id
	 * @param regName
	 * @param mobilePhone
	 * @param pwd
	 */
	public Member(int id, String regName, String mobilePhone, String pwd) {
		super();//���ʸ���Ĺ��췽��
		this.id = id;
		this.regName = regName;
		this.mobilePhone = mobilePhone;
		this.pwd = pwd;
	}
	public static void main(String arg[]){
//		Member member = new Member();
		
		Member member = null;//�ֲ���������ʼ����null:�������͵�Ĭ��ֵ��ȱʡֵ
		member = new Member("13581985992", "9002299");
		
		System.out.println(member.mobilePhone);
		member.id = 1;
		member.register("13581985992", "9002299");
		
		int[] array = new int[10];
		//int[] array = new int[10];
		String str = "123";	
		
		int num = 50;
		int i;
		i = num++;
		System.out.println(num);
		}
}
