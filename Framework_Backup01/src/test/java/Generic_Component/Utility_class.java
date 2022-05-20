package Generic_Component;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility_class {

	public String readProperties( String skey) throws IOException
	{
		FileInputStream fis = new FileInputStream("rediff.properties");
		Properties prop = new Properties();
		prop.load(fis);
		 return prop.getProperty(skey);
	}
	
	
	
}
