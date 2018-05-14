package com.sunsy.day003.test;

public class homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 输出图案
		 * 
		 **
		 ***
		 ****
		 *****
		 */
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/**
		 * 输出图案
		 * 
		 **
		 ***
		 ****
		 *****
		 */
		int i = 1;
		while (i <= 5) {
			int j = 1;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		/**
		 * 输出图案
		 * 
		 **
		 ***
		 ****
		 *****
		 */
		int i2 = 1;
		do {
			int j = 1;
			do {
				System.out.print("*");
				j++;
			} while (j <= i2);
			System.out.println();
			i2++;
		} while (i2 <= 5);
		
		//0到100奇数和偶数的和
		int sum = 0, sum2 = 0;
		for (int i3 = 1; i3 <= 100; i3 = i3 + 2) {
			sum = sum + i3;
		}
		System.out.println("0到100奇数的和为" + sum);
		
		for (int i3 = 0; i3 <= 100; i3 = i3 + 2) {
			sum2 = sum2 + i3;
		}
		System.out.println("0到100偶数的和为" + sum2);
		
	}
}
