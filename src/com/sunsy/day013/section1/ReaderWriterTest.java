package com.sunsy.day013.section1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriterTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/**
		 * copyһ���ļ�
		 * ��
		 * д
		 */
		File sourceFile = new File("F:\\1.txt");
		File targetFile = new File("F:\\2.txt");
		//����
		BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(targetFile));
		//��ѭ���������������ϵĶ�ȡ
		while(true){
			//��ȡ
			String line = reader.readLine();
			System.out.println(line);
			if(line == null){
				break;
			}else{
				writer.write(line);
				writer.newLine();
			}
			//����ѭ������break
		}
		writer.close();
		reader.close();
	}

}
