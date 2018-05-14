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
		 * copy一个文件
		 * 读
		 * 写
		 */
		File sourceFile = new File("F:\\1.txt");
		File targetFile = new File("F:\\2.txt");
		//缓冲
		BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(targetFile));
		//死循环————》不断的读取
		while(true){
			//读取
			String line = reader.readLine();
			System.out.println(line);
			if(line == null){
				break;
			}else{
				writer.write(line);
				writer.newLine();
			}
			//跳出循环？？break
		}
		writer.close();
		reader.close();
	}

}
