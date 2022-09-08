package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

/**
 * This class generates a file from a Treemap collection
 * @author Myriam 
 *
 */
public class SymptomWriter {
	/**
	 * Variable that contains the file path sort
	 */
	private String writerFile;
	/**
	 * Variable that contains the Treemap collection
	 */
	private TreeMap<String, Integer> symptomMapList;

	/**
	 * Constructor
	 * @param symptomMapList
	 * @param writerFile
	 */
	public SymptomWriter(TreeMap<String, Integer> symptomMapList, String writerFile) {
		this.symptomMapList = symptomMapList;
		this.writerFile = writerFile;
	}

	public void generateFile() {

		try {
			FileWriter writer = new FileWriter (writerFile);

			/**
			 * Foreach which loops through the treemap collection and writes each line to the file
			 */
			for(String key : symptomMapList.keySet()) {
				writer.write(key + " : " + symptomMapList.get(key) + "\n");
			}
			writer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}