package GenericPackages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile implements FrameWorkConstant {
	public String ToReadDataFromPropertyFile(String url) throws IOException {
		FileInputStream fis = new FileInputStream(propertyfile);
		Properties p = new Properties();
		
		p.load(fis);
		String value =p.getProperty(url);
//		p.getProperty(username);
//		p.getProperty(password);
			
		return value;
		
	}

}
//,String username,String password