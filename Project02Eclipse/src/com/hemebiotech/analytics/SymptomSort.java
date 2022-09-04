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
        	System.out.println(theSymptom);
        		Integer i = symptomMap.get(theSymptom);
        		if(i == null) {
        			i = 1;
        		}else {	
        			 i++;
        		}
        		System.out.println("else " + i);
        		 //System.out.println(symptomMap.get(theSymptom));	
            	symptomMap.put(theSymptom, i);

        }
        System.out.println(symptomMap);
        return symptomMap;
	}

}
