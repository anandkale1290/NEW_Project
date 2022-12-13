package Com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties prop;
	public ConfigDataProvider() throws Exception {
		String pathconfig="C:\\Users\\Anand\\eclipse-workspace\\New_Project\\Config\\config.Properties";
		FileInputStream file=new FileInputStream(pathconfig);
		prop=new Properties();
		prop.load(file);
	}
	
	public String getBaseValue1() {
		return prop.getProperty("BaseValue1");
	}
	public String getBaseValue2() {
		return prop.getProperty("getBaseValue2");
	}
	public String getBaseValue3() {
		return prop.getProperty("getBaseValue3");
	}
	public String getBaseValue4() {
		return prop.getProperty("getBaseValue4");
	}
}
