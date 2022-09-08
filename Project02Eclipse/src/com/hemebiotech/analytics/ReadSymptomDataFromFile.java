package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This class reads and retrieves lines from file 
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader{

	/**
	 * Variable that contains the file path
	 */
	private String filepath;

	/**
	 * Constructor
	 * @param filepath
	 */
	public ReadSymptomDataFromFile(String filepath){
		this.filepath = filepath;
	}

	/**
	 * Method that retrieves the lines of the file and adds them to a list
	 */
	public List<String> GetSymptoms(){
		ArrayList<String> result = new ArrayList<String>();
		if(filepath != null){
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();
				while(line != null){
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch(IOException e){
				e.printStackTrace();
			}
		}
		return result;
	}

}