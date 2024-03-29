package com.practice.methodoverloading;

public class SecondsAndMinutesChallenge {
	private final  static String INVALID_VALUE_MESSAGE = "Invalid value";
 	public static void main(String[] args) {
		
//		String duration = getDurationString(65, 45);
//		System.out.println(duration);
		
		System.out.println(getDurationString(65, 5));
		
		System.out.println(getDurationString(3699L));
		System.out.println(getDurationString(-41));
	}
	
	private static String getDurationString(long minutes, long seconds) {
		if((minutes < 0) || (seconds < 0) || (seconds > 59)) {
			return INVALID_VALUE_MESSAGE;
		}
		
		long hours = minutes / 60;
		long remainingMinutes = minutes % 60;
		
		String hoursString = hours + "h";
		if(hours < 10) {
			hoursString = "0" + hoursString;
		}
		String minutesString = remainingMinutes + "m";
		if(remainingMinutes < 10) {
			minutesString = "0" + minutesString;
		}
		String secondsString = seconds + "m";
		if(seconds < 10) {
			secondsString = "0" + secondsString;
		}
		
		return hoursString + " " + minutesString +" " + secondsString + " ";
	}
	
	private static String getDurationString(long seconds) {
		if(seconds < 0) {
			return INVALID_VALUE_MESSAGE;
		}
		long minutes = seconds / 60;
		long remainingSeconds = seconds % 60;
		return getDurationString(minutes, remainingSeconds);
	}

}
