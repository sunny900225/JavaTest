package com.sunsy.day013.section2;

import java.util.ArrayList;

public class Tester {
	/**
	 * �@����ǜyԇ�õ�
	 * 
	 * --��������Ҳ����P�ĘI��߉݋�e���@�e���������߃Ⱦۡ������
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�h���ļ��A
		//FileOptTool.deleteFile("d:\\maven3.5");
		//�����ļ��A
		ArrayList<String> filePathList = FileOptTool.searchFile("E:\\��װ�ļ�",".exe");
		System.out.println(filePathList);
//		for(String filePath:filePathList){
//			System.out.println(filePath);
//		}
	}
	//�҂�����һ�����ߣ��@�������кܶ�ܶ�Ĺ��ܣ����Ԏ��҂�������ļ��ĸ��N����
	//����h���ļ��A�������ļ���XXXX����

}
