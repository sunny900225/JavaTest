package com.sunsy.day013.section2;

import org.apache.log4j.Logger;

public class LogTest {
	//4-->for
	//log4j-->log for java
	static Logger logger = Logger.getLogger(LogTest.class);
	public static void main(String[] args) {
		logger.error("1：这是一个错误");
		logger.warn("2：这是一个警告");
		logger.info("3：这是一个普通的消息");
		logger.debug("4：这是调试信息");//开发人员的调试信息，级别比info更低
		
	}
}
