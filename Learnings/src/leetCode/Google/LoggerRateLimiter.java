package leetCode.Google;

import java.util.HashMap;
import java.util.Map;

/*
 * https://leetcode.com/problems/logger-rate-limiter/
 * 
 * Problem : Given message and timestamp in the function to implement.
 * 1. Design a logging system such that the method should return true if message has not come before or message has come before 10 sec.
 * 2. If message has come earlier and within 10 seconds, then return false;
 * 
 * Time : O(1): constant.
 * Space : O(n) : n is the number of messages
 * 
 */

public class LoggerRateLimiter {
	
	Map<String,Integer> map;
	
	public LoggerRateLimiter(){
		map = new HashMap<>();
	}
	
	public boolean shouldPrintMessage(int timestamp, String message) {
		
		if(!map.containsKey(message)) {		// Means if message has not come before, then update the map with message and its timestamp and return true
			map.put(message,timestamp);
			return true;
		}
		// Code will come here when map has key means the message has come earlier.
		int previousTimeStamp = map.get(message);
		if(timestamp - previousTimeStamp >= 10) {		// Timestamp - previous as previoustimestamp will obviously be lower.
			map.put(message,timestamp);
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoggerRateLimiter logger = new LoggerRateLimiter();
		System.out.println(logger.shouldPrintMessage(1, "foo"));	// foo message at 1 sec so true and not present in map
		System.out.println(logger.shouldPrintMessage(2, "bar"));	// bar message at 2 sec so true and not present in map
		System.out.println(logger.shouldPrintMessage(3, "foo"));	// foo message at 3 sec and contains in map with timestamp diff of (3-1 = 2) which is not >= 10 so false
		System.out.println(logger.shouldPrintMessage(8, "bar"));	// bar message at 8 sec and contains in map with timestamp diff of (8-2 = 6) which is not >= 10 so false
		System.out.println(logger.shouldPrintMessage(10, "foo"));	// foo message at 10 sec and contains in map with timestamp diff of (10-1 = 9) which is not >= 10 so false
		System.out.println(logger.shouldPrintMessage(11, "foo"));	// foo message at 11 sec and contains in map with timestamp diff of (11-1 = 10) which is >= 10 so true
		
	}

}
