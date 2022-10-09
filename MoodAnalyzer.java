package com.blz.moodanalyzer;

public class MoodAnalyzer {	

	public String analyzeMood(String message) {
		if(message.contains("sad"))
			return "SAD";
		else
			return "HAPPY";
	}
}
