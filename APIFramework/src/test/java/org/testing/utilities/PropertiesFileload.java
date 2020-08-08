package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileload {
      //it will return object of properties class
	public static Properties propertiesfile() throws IOException
	{
		File f=new File("../APIFramework/Environment.properties");
		FileInputStream fi=new FileInputStream(f);
		Properties pr=new Properties();
		pr.load(fi);
		return pr;
	}
}
