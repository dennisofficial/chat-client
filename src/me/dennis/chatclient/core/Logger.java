package me.dennis.chatclient.core;

import static java.util.Calendar.*;

import java.util.Calendar;

public class Logger {

	private Calendar cal;
	
	private String getDate() {
		cal = Calendar.getInstance();
		return "[" + String.format("%02d",cal.get(HOUR)) + ":"
				+ String.format("%02d",cal.get(MINUTE)) + ":"
				+ String.format("%02d",cal.get(SECOND)) + "]";
	}
	
	public static void info(String s) {
		Logger log = new Logger();
		System.out.println(log.getDate() + "[INFO] " + s);
		log = null;
	}
	
	public static void err(String s) {
		Logger log = new Logger();
		System.err.println(log.getDate() + "[SEVERE] " + s);
		log = null;
	}
	
}
