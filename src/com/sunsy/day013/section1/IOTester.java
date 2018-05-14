package com.sunsy.day013.section1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;

public class IOTester {
	static Logger logger = Logger.getLogger(IOTester.class);
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//���һ���ļ���copy����
		FileInputStream is = null;
		FileOutputStream os = null;
		try{
		File sourceFile = new File("f:\\11.png");
		File targetFile = new File("f:\\22.png");
		is = new FileInputStream(sourceFile);
		os = new FileOutputStream(targetFile);
		while (true){
			byte[] data = new byte[1024];//�ڴ����
			int length = is.read(data);
			System.out.println(length);
			if (length == -1){
				break;
			}else{
				logger.info("���ڌ��딵��");
				os.write(data, 0, length);
			}
		}
		}catch(Exception e){
			logger.error("copy���e");
		}finally{
					os.close();
					is.close();
		}

	}

}
