package com.sunsy.day013.section1;

import java.io.File;

public class DeleteFileTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deleteFile("D:\\maven3.5");
		
	}
	/**
	 * 我们要写一个方法：删除一个文件夹（需要先删除其子文件）
	 */
	public static void deleteFile(String dirPath){
		File dir = new File(dirPath);
		File[] subfiles = dir.listFiles();
		//通过递归方式，把所有的子文件删除
		for (File subFile : subfiles){
			if (subFile.isDirectory()){//文件夹
				//如果这个是文件夹，继续删除文件夹
				deleteFile(subFile.getAbsolutePath());//调用自身
			}else{//是文件
				System.out.println("开始删除文件——》"+subFile.getAbsolutePath());
				subFile.delete();
			}
		}
		//目录删除的前提是这个目录是空目录
		System.out.println("开始删除目录——》"+dir.getAbsolutePath());
		dir.delete();//删文件夹
	}
	private static void tryDel(){
		File dir = new File("D:\\maven3.5");
		boolean delFlag = dir.delete();
		System.out.println(delFlag);
		
		//思路：进入目录，去把子目录和子文件都删除，最后再来删除空文件夹
		if(dir.isDirectory()){
			File[] subfiles = dir.listFiles();
			for(File subfile : subfiles){
				if(subfile.isDirectory()){//文件夹
					System.out.println("文件夹:" + subfile.getName());
					subfile.delete();
					//当是目录的时候，要继续进入目录进行子文件的删除
					
				}else{//是文件
				System.out.println("文件:"+subfile.getName());
				subfile.delete();//删除文件
				}
			}
		}
	}

}
