package com.sunsy.day012.section2;

import java.io.File;
import java.io.IOException;

public class FileTester {
public static void main(String[] args){
/*	File file = new File("D:\\apache");
	System.out.println(file.exists());
	if(!file.exists()){
		file.createNewFile();
	}*/
	
/*	File file = new File("D:\\a\\b\\c");
	if (!file.exists()){
		boolean createFlag = file.mkdir();//һ��Ŀ¼���ϼ��������
		boolean createFlag = file.mkdirs();//�༶Ŀ¼
		System.out.println(createFlag);
		//file.createNewFile();
		
	}*/
	
/*	File file = new File("D:\\apache\\Hello.java");
	System.out.println(file.isFile());
	System.out.println(file.isDirectory());
	1:ɾ���ļ�
	boolean delFlag = file.delete();//���Ŀ¼��Ϊ�����޷�ɾ��
	System.out.println(delFlag);*/
	
	//2:ɾ��Ŀ¼
	File file = new File("D:\\maven3.5");
	System.out.println(file.isDirectory());
	System.out.println("---------");
	boolean delFlag = file.delete();
	System.out.println(delFlag);
	
/*	File file = new File("D:"+File.separator+"maven3.6");
	System.out.println(file.getAbsolutePath());*/
	
}
}
