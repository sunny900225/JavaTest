package com.sunsy.day013.section2;

import java.io.File;
import java.util.ArrayList;

public class FileOptTool {
	
	/**
	 * �����tool,manager,
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void deleteFile(String dirPath){
		File dir = new File(dirPath);
		File[] subfiles = dir.listFiles();
		//ͨ���ݹ鷽ʽ�������е����ļ�ɾ��
		for (File subFile : subfiles){
			if (subFile.isDirectory()){//�ļ���
				//���������ļ��У�����ɾ���ļ���
				deleteFile(subFile.getAbsolutePath());//��������
			}else{//���ļ�
				System.out.println("��ʼɾ���ļ�������"+subFile.getAbsolutePath());
				subFile.delete();
			}
		}
		//Ŀ¼ɾ����ǰ�������Ŀ¼�ǿ�Ŀ¼
		System.out.println("��ʼɾ��Ŀ¼������"+dir.getAbsolutePath());
		dir.delete();//ɾ�ļ���
	}
	/**
	 * �����ļ�
	 * @param dirPath�ļ��A·��
	 * @param keyWord
	 */
	private static ArrayList<String> fileList = new ArrayList<>();
	public static ArrayList<String> searchFile(String dirPath, String keyWord) {
		File dir = new File(dirPath);
		File[] subfiles = dir.listFiles();
		for (File subFile : subfiles){
			if (subFile.isDirectory()){//�ļ���
				searchFile(subFile.getAbsolutePath(),keyWord);//��������
			}else{//���ļ�
				//�����ļ�����
				//�ļ�������
				//System.out.println("��ʼ�����ļ�������"+subFile.getAbsolutePath());
				String fileName = subFile.getName();
				//����ļ��������˹ؼ���
				boolean flag = fileName.contains(keyWord);
				if(flag){
					//System.out.println(fileName);
					//System.out.println(subFile.getAbsolutePath());
					//System.out.println("�������ļ�-->"+subFile.getAbsolutePath());
					fileList.add(subFile.getAbsolutePath());
				}
			}
		}
		return fileList;
	}

}
