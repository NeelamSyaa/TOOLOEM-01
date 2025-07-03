package com.utilities.oem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
private	static Properties pf;
	public static void loadProperties() throws IOException {
		 pf = new Properties();
		try {
			FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/config\\oem");
			pf.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String key) throws IOException {
        if (pf == null) {
            loadProperties();
        }
        return pf.getProperty(key);
    }
}

