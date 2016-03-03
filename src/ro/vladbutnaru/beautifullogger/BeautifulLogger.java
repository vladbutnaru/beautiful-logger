package ro.vladbutnaru.beautifullogger;

import java.util.Date;
/*	Created by Vlad Butnaru
 * 	Version 1.0.1
 * 	
 * 	Beautiful Logger - Logging.Simplified
 */
public class BeautifulLogger {
	public static void logStandard(String text, Class o){
		System.out.println("[STANDARD] - [" + new Date().toString() +"] - "+o.getClass().getSimpleName() +" - " +  text);
		
	}
	public static void logInfo(String text, Class o){
		System.out.println("[INFO] - [" + new Date().toString() +"] - "+o.getClass().getSimpleName() +" - " + text);
		
	}
	public static void logAttention(String text, Class o){
		System.out.println("[ATTENTION] - [" + new Date().toString() +"] - "+o.getClass().getSimpleName() +" - " +  text);
		
	}
	public static void logWarning(String text, Class o){
		System.out.println("[WARNING] - [" + new Date().toString()+"] - "+o.getClass().getSimpleName() +" - " +  text);
		
	}
	public static void logError(String text, Class o){
		System.out.println("[ERROR] - [" + new Date().toString() +"] - "+o.getClass().getSimpleName() +" - " +  text);
		
	}
	public static void logAction(String text, Class o){
		System.out.println("[ACTION] - [" + new Date().toString() +"] - "+o.getClass().getSimpleName() +" - " +  text);
		
	}
}
