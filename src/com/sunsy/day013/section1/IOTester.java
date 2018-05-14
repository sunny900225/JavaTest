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
		//完成一个文件的copy功能
		FileInputStream is = null;
		FileOutputStream os = null;
		try{
		File sourceFile = new File("f:\\11.png");
		File targetFile = new File("f:\\22.png");
		is = new FileInputStream(sourceFile);
		os = new FileOutputStream(targetFile);
		while (true){
			byte[] data = new byte[1024];//内存调整
			int length = is.read(data);
			System.out.println(length);
			if (length == -1){
				break;
			}else{
				logger.info("正在寫入數據");
				os.write(data, 0, length);
			}
		}
		}catch(Exception e){
			logger.error("copy出錯");
		}finally{
					os.close();
					is.close();
		}

	}

}
