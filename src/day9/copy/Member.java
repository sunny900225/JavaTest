/**
 * 
 */
package day9.copy;

/**
 * @author SEELE
 * @date 2018��4��18��
 * @email 345720475@qq.com
 */
public class Member {
	//1������������������ԡ�������Ա����
	private int id;
	public String regName;
	private String mobilePhone;
	public String pwd;
	private double leaveAmount = 2;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the regName
	 */
	public String getRegName() {
		return regName;
	}
	/**
	 * @param regName the regName to set
	 */
	public void setRegName(String regName) {
		this.regName = regName;
	}
	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}
	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setmobilePhone(String mobilePhone){
		this.mobilePhone = mobilePhone;
	}
	public String getmobilePhone(){
		return this.mobilePhone;
	}
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
	public boolean recharge(double amount){
		if (amount < 100 || amount >= 500000){
			System.out.println("��ֵʧ��");
			return false;
		}else{
			System.out.println("��ֵ�ɹ�");
			leaveAmount += amount;
			return true;
		}
	}
	public static void main(String arg[]){
//		Member sunsy = new Member();
		
		Member member = null;//�ֲ���������ʼ����null:�������͵�Ĭ��ֵ��ȱʡֵ
		member = new Member();
		
		member.id = 1;
		member.register("13581985992", "9002299");
//		boolean flag = 10%2 == 1&& 10/3 ==0 && 1/0 == 0;
//		System.out.println(flag ? "mldn" : "yootk") ; 
//		 int num = 50 ; 
//         num = num ++ * 2 ; 
//         System.out.println(num) ;

		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Member [id=" + id + ", regName=" + regName + ", mobilePhone=" + mobilePhone + ", pwd=" + pwd
				+ ", leaveAmount=" + leaveAmount + "]";
	}
	

}
