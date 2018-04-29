/**
 * 
 */
package day9;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * @author SEELE
 * @date 2018年4月25日
 * @email 345720475@qq.com
 */
public class ArrayListTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//<E>:泛型（规定容器中间放什么类型的数据）
		//1:创建对象
		ArrayList<Integer> ageList = new ArrayList<Integer>();
		//2:往这个容器中间加数据
		ageList.add(20);
		//ageList.remove(ageList.get(4));
		//1:foreach遍历所有年龄
		for(Integer age:ageList){
			System.out.println(age);
		}
		//2:for遍历
		int size = ageList.size();//最大的索引+1
		//索引从0开始，到size-1结束
		for(int i = 0;i<size;i++){
			System.out.println(ageList.get(i));
		}
		//2-2:遍历除了第3个同学的所有的同学的年龄
		
		//迭代器进行遍历
		Iterator<Integer> iterator = ageList.iterator();
		while(iterator.hasNext()){
			Integer age = iterator.next();
			
		}
		ArrayList<Member> memberList = new ArrayList<Member>();
		Borrower tom = new Borrower();
		memberList.add(tom);
		
	}

}
