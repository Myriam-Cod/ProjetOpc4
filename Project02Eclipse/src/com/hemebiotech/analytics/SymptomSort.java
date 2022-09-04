package com.hemebiotech.analytics;

import java.util.Map;
import java.util.List;
import java.util.TreeMap;


public class SymptomSort {
	
	private List<String> symptomList;
	

	public SymptomSort(List<String> symptomList) {
		// TODO Auto-generated constructor stub
		this.symptomList = symptomList;
	}

	
	public TreeMap<String, Integer> fileListMap() {

        // Create TreeMap
		TreeMap<String, Integer> symptomMap = new TreeMap<String, Integer>();
		
		//For each pour parcourir la list
        for(String theSymptom : symptomList) {
        		if(symptomMap.get(theSymptom) == null) {
        			symptomMap.put(theSymptom, 1);
        		}else {	
        			symptomMap.put(theSymptom, symptomMap.get(theSymptom)+1);
        		}
        }
        System.out.println(symptomMap);
        return symptomMap;
	}

}
