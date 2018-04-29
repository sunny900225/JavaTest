/**
 * 
 */
package day9;

/**
 * @author SEELE
 * @date 2018年4月23日
 * @email 345720475@qq.com
 * 
 */
public class Borrower extends Member{
	private String address = "ssy";

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

	/**
	 * 
	 */
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
		boolean flag = super.recharge(amount);//显式的调用父类方法
		if (flag == true){
		System.out.println("1：充值成功，你可以去还款了！");
			return true;
		}
		else{
			System.out.println("1：充值成功，你可以去还款了！");
			return false;
		}
	}
	public static void main(String[] args){
//		boolean flag;
//		if (flag = true){
//		System.out.println("1：充值成功，你可以去还款了！");
//		}
//		else{
//			System.out.println("1：充值shibai，你可以去还款了！");	
//		}
		
//		Borrower br = new Borrower();
//		br.recharge(50);
//		br.register("131", "111");
		Member member = new Member();
		//Member member = new Borrower("saaaaaaaa");
		//member.recharge(1);
		
		Borrower b=(Borrower) member;
		b.setAddress("address");
	}
}
