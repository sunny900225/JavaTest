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
		boolean createFlag = file.mkdir();//一级目录，上级必须存在
		boolean createFlag = file.mkdirs();//多级目录
		System.out.println(createFlag);
		//file.createNewFile();
		
	}*/
	
/*	File file = new File("D:\\apache\\Hello.java");
	System.out.println(file.isFile());
	System.out.println(file.isDirectory());
	1:删除文件
	boolean delFlag = file.delete();//如果目录不为空是无法删除
	System.out.println(delFlag);*/
	
	//2:删除目录
	File file = new File("D:\\maven3.5");
	System.out.println(file.isDirectory());
	System.out.println("---------");
	boolean delFlag = file.delete();
	System.out.println(delFlag);
	
/*	File file = new File("D:"+File.separator+"maven3.6");
	System.out.println(file.getAbsolutePath());*/
	
}
}
