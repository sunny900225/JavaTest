package com.sunsy.day016.section2;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;



public class PropertiesTester {
	Properties properties = new Properties();
	InputStream inStream = new FileInputStream("");
	//��·���ĸ�·��
	properties.load(inStream);
	//properties.load(inStream);
	
}
