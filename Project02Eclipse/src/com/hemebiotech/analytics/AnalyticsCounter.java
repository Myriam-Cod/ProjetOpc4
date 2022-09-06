package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;


public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {	

		// On récupére le fichier
		ReadSymptomDataFromFile fileSymptoms = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		// On récupére la liste
		List<String> listFileSymptoms = fileSymptoms.GetSymptoms();
		
		SymptomSort forList = new SymptomSort(listFileSymptoms);
		
		//En treemap
		TreeMap<String, Integer> forTreeMapList = forList.fileListMap();
		
		SymptomWriter forWriteFile = new SymptomWriter(forTreeMapList, "Project02Eclipse/result.out");
		forWriteFile.generateFile();
		
	
	}
}