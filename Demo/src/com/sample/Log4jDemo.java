package com.sample;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log4jDemo 
{
	static Logger log = LogManager.getLogger(Log4jDemo.class.getName());
	public static void main(String args[]) 
	{
		log.debug("Hello this is a debug message");
		log.info("Hello this is an info message");
		log.warn("Hello this is a warning message");
		log.error("Hello this is a error message");
		log.fatal("Sample fatal message");
	}
}
