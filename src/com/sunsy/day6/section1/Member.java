/**
 * 
 */
package com.sunsy.day6.section1;

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
	public static void main(String arg[]){
//		Member sunsy = new Member();
		
		Member member = null;//�ֲ���������ʼ����null:�������͵�Ĭ��ֵ��ȱʡֵ
		member = new Member();
		
		member.id = 1;
		member.register("13581985992", "9002299");
		boolean flag = 10%2 == 1&& 10/3 ==0 && 1/0 == 0;
		System.out.println(flag ? "mldn" : "yootk") ; 
//		 int num = 50 ; 
//         num = num ++ * 2 ; 
//         System.out.println(num) ;
         char c = 'A' ; 
         int num = 10 ; 
         switch(c) { 
             case 'B' : 
                 num ++ ; 
             case 'A' : 
                 num ++ ; 
             case 'Y' : 
                 num ++ ; 
                 break ; 
             default : 
                 num -- ;
         }
         System.out.println(num);
		
	}
	public static void test(){
		boolean flag = 1/0 == 0;
	}

}
