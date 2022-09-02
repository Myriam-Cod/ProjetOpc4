package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
	
		
		BufferedReader reader = new BufferedReader (new FileReader("Project02Eclipse/symptoms.txt"));

		String line = reader.readLine();

		
		
		// next generate output
		FileWriter writer = new FileWriter ("result.out");
		writer.close();
	}
}
