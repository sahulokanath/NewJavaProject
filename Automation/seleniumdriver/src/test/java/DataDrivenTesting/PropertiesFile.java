package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class PropertiesFile {

	public static void main(String[] args) throws IOException {

		// Location of properties file
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/testdata/config.properties");

		// load a file
		Properties propertiresobj = new Properties();

		propertiresobj.load(file);

		// Reading properties file

		String url = propertiresobj.getProperty("appurl");
		String email = propertiresobj.getProperty("emailid");
		String pass = propertiresobj.getProperty("password");

		System.out.println(url + " " + email + "  " + pass);

		// Read all the keys from properties file

		Set<Object> key = propertiresobj.keySet();
		System.err.println(key);

		// Read all the value from properties file

		Collection<Object> value = propertiresobj.values();

		System.out.println(value);
		file.close();
		
		//https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator
	}

}
