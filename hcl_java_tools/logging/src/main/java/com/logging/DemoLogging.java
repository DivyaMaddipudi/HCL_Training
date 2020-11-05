package com.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoLogging {
	
//	private static Logger logger = Logger.getLogger(DemoLogging.class);

	private static Logger logger = LoggerFactory.getLogger(DemoLogging.class);

	
	public static void main(String[] args) {
		
		//HTML layout, xml layout, simple layout, pattern layout
//		Layout layout = new SimpleLayout();
//		Layout layout2 = new PatternLayout("%p %d{dd-MMMM-yy hh:mm:ss SSS} %c %M %m %l %n");
//		
//		Appender appender = new ConsoleAppender(layout2);
//		Appender appender = new FileAppender(layout2, "demo.log");
//		logger.addAppender(appender);
		
		logger.info("this is info msg");
		logger.error("this is error msg");
		logger.debug("this is debug msg");
//		logger.fatal("this is fatal msg");
		
		
		
	
		
	}

}
