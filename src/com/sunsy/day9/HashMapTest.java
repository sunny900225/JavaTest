/**
 * 
 */
package com.sunsy.day9;

import java.util.HashMap;
import java.util.Set;

import com.sunsy.qianchengdai.Member;

/**
 * @author SEELE
 * @date 2018年4月25日
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
		tom.setRegName("tom");
		Member jack = new Member();
		jack.setRegName("jack");
		//System.out.println(tom);
		
		memberMap.put("user1", tom);
		memberMap.put("user1", jack);
		memberMap.put("user2", jack);
		memberMap.put("user3", tom);
		System.out.println(memberMap.get("user1").getRegName());
		
		//遍历
		Set<String> keys = memberMap.keySet();
		for(String key : keys){
			System.out.println("key:"+key+",value:"+memberMap.get(key));
		}
	}

}
