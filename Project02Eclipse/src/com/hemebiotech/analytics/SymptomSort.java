package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * This class initializes a Treemap type collection with the data from the list
 * The Treemap allows to have a key value collection sorted in alphabetical order
 * @author Myriam 
 *
 */

public class SymptomSort {
	/**
	 * Variable that contains the list
	 */
	private List<String> symptomList;

	/**
	 * Constructor
	 * @param symptomList
	 */
	public SymptomSort(List<String> symptomList) {
		// TODO Auto-generated constructor stub
		this.symptomList = symptomList;
	}

	public TreeMap<String, Integer> fileListMap() {

		TreeMap<String, Integer> symptomMap = new TreeMap<String, Integer>();

		/**
		 * Foreach to iterate through the symptoms in the list
		 */
		for(String theSymptom : symptomList) {
			/**
			 * Condition, if the row is null, I add the key and value 1 to my collection
			 * else I add the key and value++
			 */
			if(symptomMap.get(theSymptom) == null) {
				symptomMap.put(theSymptom, 1);
			}else {	
				symptomMap.put(theSymptom, symptomMap.get(theSymptom)+1);
			}
		}
		return symptomMap;
	}

}