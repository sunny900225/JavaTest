package com.sunsy.day012.section2;

public class FactorialTester {
public static void main(String[] args) {
	//5! = 5*4*3*2*1
	System.out.println(factorial(4));
	System.out.println(fac(2));

}
public static int factorial(int num){
	//5�Ľ׳� = 5*4�Ľ׳�
	//num�Ľ׳� = num * ��num-1���Ľ׳�
	if(num == 0){
		return 1;//���ص����ô�
	}
	return num * factorial(num - 1);

	}
public static int fac(int num){
	int fac = 1;
	for(int i = 1;i < num;i++){
		
		fac = fac*(i+1);
		
	}return fac;
}
}
