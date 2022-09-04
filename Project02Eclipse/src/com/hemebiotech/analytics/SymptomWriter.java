package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;

public class SymptomWriter {
	private String writerFile;
	
	public void generateFile() {
		
		try {
			FileWriter writer = new FileWriter (writerFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
