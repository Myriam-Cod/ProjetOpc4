package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

public class SymptomWriter {
	private String writerFile;
	private TreeMap<String, Integer> symptomMapList;
	
	public SymptomWriter(TreeMap<String, Integer> symptomMapList, String writerFile) {
		this.symptomMapList = symptomMapList;
		this.writerFile = writerFile;
	}
	
	public void generateFile() {
		
		try {
			FileWriter writer = new FileWriter (writerFile);
			for(String key : symptomMapList.keySet()) {
				System.out.println(key + " : " + symptomMapList.get(key));
				writer.write(key + " : " + symptomMapList.get(key) + "\n");
			}
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}