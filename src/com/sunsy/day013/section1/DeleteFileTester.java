package com.sunsy.day013.section1;

import java.io.File;

public class DeleteFileTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deleteFile("D:\\maven3.5");
		
	}
	/**
	 * ����Ҫдһ��������ɾ��һ���ļ��У���Ҫ��ɾ�������ļ���
	 */
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
	private static void tryDel(){
		File dir = new File("D:\\maven3.5");
		boolean delFlag = dir.delete();
		System.out.println(delFlag);
		
		//˼·������Ŀ¼��ȥ����Ŀ¼�����ļ���ɾ�����������ɾ�����ļ���
		if(dir.isDirectory()){
			File[] subfiles = dir.listFiles();
			for(File subfile : subfiles){
				if(subfile.isDirectory()){//�ļ���
					System.out.println("�ļ���:" + subfile.getName());
					subfile.delete();
					//����Ŀ¼��ʱ��Ҫ��������Ŀ¼�������ļ���ɾ��
					
				}else{//���ļ�
				System.out.println("�ļ�:"+subfile.getName());
				subfile.delete();//ɾ���ļ�
				}
			}
		}
	}

}
