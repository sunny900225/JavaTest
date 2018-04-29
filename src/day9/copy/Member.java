/**
 * 
 */
package day9.copy;

/**
 * @author SEELE
 * @date 2018年4月18日
 * @email 345720475@qq.com
 */
public class Member {
	//1、描述这类事物的属性——》成员变量
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
	//2、描述这类事物的行为——》方法
	public void register(String mobilePhone,String pwd){
		//注册逻辑
		/**
		 * 1:从前端页面收集手机号和密码
		 * 2：发包（浏览器、Fiddler、jmeter、postman)——》发送请求——》http请求——》服务端
		 * 3：校验——》手机号11位，密码6-18位
		 * 4：如果不符合要求——》提示用户：手机号或密码格式错误
		 * 5:符合要求——》NA手机号去数据库查询是否已注册
		 * 5：如果已存在——》提示用户已注册
		 * 7：如果不存在——》注册——》插入数据库——》注册成功
		 */
		/*
		 * 如果（手机号不符合要求）{
		 * 输出手机号或密码格式错误
		 * }否则{
		 * 输出注册成功
		 * }
		 * 
		 */
		if(mobilePhone.length()!=11 || pwd.length()<6 ||pwd.length()>18){
			System.out.println("手机号或密码格式错误");
		}else{
			System.out.println("注册成功");
		}
		
	}
	public void login(String mobilePhone,String pwd){
		//登录逻辑
		/**
		 * 
		 */
	}
	public boolean recharge(double amount){
		if (amount < 100 || amount >= 500000){
			System.out.println("充值失败");
			return false;
		}else{
			System.out.println("充值成功");
			leaveAmount += amount;
			return true;
		}
	}
	public static void main(String arg[]){
//		Member sunsy = new Member();
		
		Member member = null;//局部变量，初始化了null:引用类型的默认值，缺省值
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
