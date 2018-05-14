package com.sunsy.day013.section2;

import java.util.ArrayList;

public class Tester {
	/**
	 * 這個類是測試用的
	 * 
	 * --》解耦（和我不相關的業務邏輯別放這裡）——》高內聚、低耦合
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//刪除文件夾
		//FileOptTool.deleteFile("d:\\maven3.5");
		//搜索文件夾
		ArrayList<String> filePathList = FileOptTool.searchFile("E:\\安装文件",".exe");
		System.out.println(filePathList);
//		for(String filePath:filePathList){
//			System.out.println(filePath);
//		}
	}
	//我們想有一個工具，這個工具有很多很多的功能，可以幫我們來完成文件的各種操作
	//比如刪除文件夾、搜索文件、XXXX……

}
