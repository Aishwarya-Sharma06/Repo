package com.timetracking.actitime.automation.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	public String fetchDataFromPropertyFile(String key) throws IOException {
		
		//The physical represention of property file is converting into java  representation
		FileInputStream fis= new FileInputStream("./src/test/resources/PropertyData.properties");
		Properties property=new Properties();
		//loading the key and value pair of property file
		property.load(fis);
		//fetching the value using the key
		return property.getProperty(key);	
	}

}
