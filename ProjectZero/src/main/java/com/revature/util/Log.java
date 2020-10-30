package com.revature.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {
	static Logger logger= LogManager.getLogger();

	public static void LogIt(String level, String message) {
		switch(level) {
		case "debug":
			logger.debug(message);
			break;
		case "warn":
			logger.warn(message);
			break;
		case "error":
			logger.warn(message);
			break;
		case "fatal":
			logger.warn(message);
			break;
		case "info":
			logger.warn(message);
			break;
		case "trace":
			logger.warn(message);
			break;
		default:
			System.err.println("logger dumb");
		}
	}
	


}
