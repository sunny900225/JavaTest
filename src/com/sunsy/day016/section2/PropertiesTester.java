package com.sunsy.day016.section2;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;



public class PropertiesTester {
	Properties properties = new Properties();
	InputStream inStream = new FileInputStream("");
	//类路径的根路径
	properties.load(inStream);
	//properties.load(inStream);
	
}
