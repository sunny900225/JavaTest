/**
 * 
 */
package day9.copy;

import java.util.HashMap;
import java.util.Set;

/**
 * @author SEELE
 * @date 2018Äê4ÔÂ25ÈÕ
 * @email 345720475@qq.com
 */
public class HashMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Member> memberMap = new HashMap<>();
		Member tom = new Member();
		System.out.println(tom);
		memberMap.put("test1", tom);
		Set<String> keys = memberMap.keySet();
		for(String key : keys){
			System.out.println("key:"+key+",value:"+memberMap.get(key));
		}
	}

}
