package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;


public class AnalyticsCounter {
	
	
	public static void main(String args[]) throws Exception {	

		// On récupère le fichier
		ReadSymptomDataFromFile fileSymptoms = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		// On récupère la liste
		List<String> listFileSymptoms = fileSymptoms.GetSymptoms();
		
	
	}
}
