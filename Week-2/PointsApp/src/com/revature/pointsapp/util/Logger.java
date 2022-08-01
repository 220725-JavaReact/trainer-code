package com.revature.pointsapp.util;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

// utility that keeps track of activities that are happening to your program by logging/ noting them down to a file/sink
public class Logger {
	// creating logger with Singleton DP
	// Singleton is a creational DP, that ensures at most one instance of a class is generated per runtime
	// 2 kinds of singletons: eagerly loaded, lazy loaded
	
	// eagerly loading the logger instance
	private static Logger logger = new Logger();
	
	// key to a singleton DP is a private constructor
	private Logger() {
		
	}
	
	public static Logger getLogger() {
		// returns instance of logger
		return logger;
	}
	
	private void writeToFile(String log)
	{
		String filePath = LocalDate.now().toString() + ".log";
		try (FileWriter writer = new FileWriter(filePath, true)){
			writer.append(log + "\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void log(LogLevel level, String message) {
		Log log = new Log(level, LocalDateTime.now(), message);
		writeToFile(log.toString());
		
	}
	public void log(LogLevel level, Exception ex) {
		Log log = new Log(level, LocalDateTime.now(), ex.toString());
		writeToFile(log.toString());
		
	}
	private class Log{
		LogLevel level;
		LocalDateTime timeStamp;
		String message;
		
		
		private Log(LogLevel level, LocalDateTime timeStamp, String message)
		{
			this.level = level;
			this.message = message;
			this.timeStamp = timeStamp;
		}


		@Override
		public String toString() {
			return level + "\t" + timeStamp + "\t" + message;
		}
		
		
	}
	
	public enum LogLevel{
		info, debug, verbose, warning, error, fatal
	}
}
