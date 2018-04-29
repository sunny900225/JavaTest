/**
 * 
 */
package day9;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author SEELE
 * @date 2018年4月25日
 * @email 345720475@qq.com
 */
public class HashSetTester {
	public static void main (String[] args){
		basicApi();
		add(1,2,3);
		int aAge = 10;
		int bAge = 10;
		int cAge = 10;
		compare(aAge,bAge,cAge);
	}

	/**
	 * @param aAge
	 * @param bAge
	 * @param cAge
	 */
	private static void compare(int aAge, int bAge, int cAge) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @param i
	 * @param j
	 * @param k
	 */
	private static void add(int i, int j, int k) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 
	 */
	private static void basicApi() {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		String tom1 = "tom";//字符串的共享区
		String tom2 = "tom";
		set.add(tom1);
		set.add(tom2);
		set.add("tom");
		set.add("tom");
		set.add("jack");
		set.add("rose");
		set.add("lily");
		System.out.println(set.size());
		Object[] objects = set.toArray();
		for (Object object : objects){
			
		}
		
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()){
			String name = iterator.next();
			System.out.println(name);
		}
	}
}
