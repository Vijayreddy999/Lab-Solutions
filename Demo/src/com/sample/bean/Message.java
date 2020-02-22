package com.sample.bean;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Message 
{
	//create a logger for Message class
	static Logger log = LogManager.getLogger(Message.class.getName());

	private String msg;

	public void setMessage(String msg) 
	{
		this.msg = msg;
		//log the messages for each priority level
		log.debug("This is a debug message");
		log.info("This is a info message");
		log.warn("warning");
		log.error("error");
		log.fatal("fatal");
	}
	public String getMessage() 
	{
		//log messages for each priority level
		log.debug("This is a debug message");
		log.info("This is a info message");
		log.warn("warning");
		log.error("error");
		log.fatal("fatal");
		return msg;
	}
	          

}
