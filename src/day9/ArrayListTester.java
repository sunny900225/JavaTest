/**
 * 
 */
package day9;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * @author SEELE
 * @date 2018��4��25��
 * @email 345720475@qq.com
 */
public class ArrayListTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//<E>:���ͣ��涨�����м��ʲô���͵����ݣ�
		//1:��������
		ArrayList<Integer> ageList = new ArrayList<Integer>();
		//2:����������м������
		ageList.add(20);
		//ageList.remove(ageList.get(4));
		//1:foreach������������
		for(Integer age:ageList){
			System.out.println(age);
		}
		//2:for����
		int size = ageList.size();//��������+1
		//������0��ʼ����size-1����
		for(int i = 0;i<size;i++){
			System.out.println(ageList.get(i));
		}
		//2-2:�������˵�3��ͬѧ�����е�ͬѧ������
		
		//���������б���
		Iterator<Integer> iterator = ageList.iterator();
		while(iterator.hasNext()){
			Integer age = iterator.next();
			
		}
		ArrayList<Member> memberList = new ArrayList<Member>();
		Borrower tom = new Borrower();
		memberList.add(tom);
		
	}

}
