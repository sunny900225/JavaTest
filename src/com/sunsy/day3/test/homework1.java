package com.sunsy.day3.test;

public class homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}	
		int i=1;
		while (i<=5){
			int j=1;
			while (j<=i){
				System.out.print("*");
				j++;
			}
				System.out.println();
				i++;
		}
		int i=1;
		do{
			int j=1;
			do{
				System.out.print("*");
				j++;
			}while (j<=i);
			System.out.println();
			i++;
		}while (i<=5);	
		int sum=0,sum2=0;
		for (int i=1;i<=100;i=i+2){
				sum = sum +i;
				}
			System.out.println("0到100奇数的和为"+sum);
		for (int i=0;i<=100;i=i+2){
			sum2=sum2+i;
		}
		System.out.println("0到100偶数的和为"+sum2);
	}
}
