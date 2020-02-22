package com.sample;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log4jDemo2 
{
	static Logger log = LogManager.getLogger(Log4jDemo2.class.getName());
	
	public static void main(String[] args) 
	{
		for(int i=1 ; i<50000; i++) 
		{
			System.out.println("Counter = " + i);
			log.debug("This is my debug message. Counter = " + i);
			log.info("This is my info message. Counter = " + i);
			log.error("This is my error message. Counter = " + i);
			log.warn("This is my warn message. Counter = " + i);
			log.fatal("This is my fatal message. Counter = " + i);
		}

	}
}
