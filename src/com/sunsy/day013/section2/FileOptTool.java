package com.sunsy.day013.section2;

import java.io.File;
import java.util.ArrayList;

public class FileOptTool {
	
	/**
	 * 工具類：tool,manager,
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
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
	/**
	 * 搜索文件
	 * @param dirPath文件夾路徑
	 * @param keyWord
	 */
	private static ArrayList<String> fileList = new ArrayList<>();
	public static ArrayList<String> searchFile(String dirPath, String keyWord) {
		File dir = new File(dirPath);
		File[] subfiles = dir.listFiles();
		for (File subFile : subfiles){
			if (subFile.isDirectory()){//文件夹
				searchFile(subFile.getAbsolutePath(),keyWord);//调用自身
			}else{//是文件
				//进行文件搜索
				//文件的名称
				//System.out.println("开始搜索文件——》"+subFile.getAbsolutePath());
				String fileName = subFile.getName();
				//如果文件名包含了关键字
				boolean flag = fileName.contains(keyWord);
				if(flag){
					//System.out.println(fileName);
					//System.out.println(subFile.getAbsolutePath());
					//System.out.println("搜索到文件-->"+subFile.getAbsolutePath());
					fileList.add(subFile.getAbsolutePath());
				}
			}
		}
		return fileList;
	}

}
