package com.utilities.oem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	 private static Properties properties;

	    public static void loadProperties() throws IOException {
	        if (properties == null) {
	            properties = new Properties();
	            FileInputStream fis = new FileInputStream("C:\\Users\\SYAA TECH\\eclipse-workspace\\TOOLOEM-01\\data\\config.properties"); // ✅ check this path!
	            properties.load(fis);
	        }
	    }

	    public static String getProperty(String key) {
	        return properties.getProperty(key);
	    }
}

