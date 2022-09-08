package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * Class that runs the program
 * 
 * @author Myriam
 *
 */
public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {

		/**
		 * ReadSymptomDataFromFile class instantiation passing it the path of the file
		 * as a parameter
		 */
		ReadSymptomDataFromFile fileSymptoms = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");

		/**
		 * We get the list generated by the function ReadSymptomDataFromFile and we add
		 * it to a variable
		 */
		List<String> listFileSymptoms = fileSymptoms.GetSymptoms();

		/**
		 * SymptomSort class instantiation passing it the variable list listFileSymptoms
		 * as a parameter
		 */
		SymptomSort forList = new SymptomSort(listFileSymptoms);

		/**
		 * We get the treemap collection generated by the function SymptomSort and we
		 * add it to a Treemap collection
		 */
		TreeMap<String, Integer> forTreeMapList = forList.fileListMap();

		/**
		 * SymptomWriter class instantiation passing it the Treemap collection and the
		 * file path out as a parameter
		 */
		SymptomWriter forWriteFile = new SymptomWriter(forTreeMapList, "Project02Eclipse/result.out");
		forWriteFile.generateFile();

	}
}