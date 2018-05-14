package com.sunsy.day012.section2;

public class FactorialTester {
public static void main(String[] args) {
	//5! = 5*4*3*2*1
	System.out.println(factorial(4));
	System.out.println(fac(2));

}
public static int factorial(int num){
	//5的阶乘 = 5*4的阶乘
	//num的阶乘 = num * （num-1）的阶乘
	if(num == 0){
		return 1;//返回到调用处
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
