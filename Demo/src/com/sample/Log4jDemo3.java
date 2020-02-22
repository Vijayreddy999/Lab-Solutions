package com.sample;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import com.sample.bean.Message;

public class Log4jDemo3 
{
	static Logger log = LogManager.getLogger(Message.class.getName());
	public static void main(String[] args) 
	{
		Message m = new Message();
		m.setMessage(null);
		m.getMessage();
		
	}
}
