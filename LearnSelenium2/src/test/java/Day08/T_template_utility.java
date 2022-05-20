package Day08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class T_template_utility {
	
	public String readProperties(String key) throws IOException
	{
		FileInputStream fis	= new FileInputStream("utility.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
		
	}
	

}
