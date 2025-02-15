package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver; 
	public Properties p;
	public Logger logger; // Log4j Logger

	@BeforeClass(groups = { "Sanity", "Regression", "Master", "DataDriven" })
	@Parameters({ "os", "browser" })
	public void setup(String os, String br) throws IOException {
		logger = LogManager.getLogger(this.getClass());

		
		
		
		// Load Configurations
		try {
			FileReader file = new FileReader("./src/test/resources/config.properties");
			p = new Properties();
			p.load(file);
		} catch (IOException e) {
			logger.error("Error loading config file", e);
			throw new RuntimeException("Configuration file missing or incorrect.");
		}

		// Close any existing WebDriver session
		if (driver != null) {
			driver.quit();
		}

		
		// for remote 
		if(p.getProperty("execution_env").equalsIgnoreCase("remote"))
		{
			DesiredCapabilities capabilites =new DesiredCapabilities();
			
			//os
			if(os.equalsIgnoreCase("Linux"))
			{
				capabilites.setPlatform(Platform.LINUX);
			}
			else if(os.equalsIgnoreCase("Linux"))
			{
				capabilites.setPlatform(Platform.MAC);
			}
			else
			{
			 System.out.print("No matching os");
			 return;
			}
			
			//browser
			switch(br.toLowerCase())
			{
			case "chrome": capabilites.setBrowserName("chrome");break;
			case "edge":capabilites.setBrowserName("edge");break;
			default :System.out.print("Invalid Browser name");
			return;
			}
			
			driver=new RemoteWebDriver( new URL("http://localhost:4444/wd/hb"),capabilites);
		}
		
		//for local Execution
		
		if(p.getProperty("execution_env").equalsIgnoreCase("local"))
		{
			switch(br.toLowerCase())
			{
			case "chrome":driver=new ChromeDriver();break;
			case "edge":driver=new EdgeDriver();break;
			default:System.out.print("Invalid Browser name");
			return;
			}
		}
		
		// Browser Initialization
		switch (br.toLowerCase()) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			default:
				System.out.println("Invalid Browser name");
				return;
		}

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		// Load URL from properties file
		driver.get(p.getProperty("appUrl"));

		driver.manage().window().maximize();
	}

	@AfterClass(groups = { "Sanity", "Regression", "Master" })
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

	// Generate Random Number
	public String randomNumber() {
		return RandomStringUtils.randomNumeric(10);
	}

	// Generate Random String
	public String randString() {
		return RandomStringUtils.randomAlphabetic(5);
	}

	// Generate Random Alphanumeric String
	public String randAlphaNumeric() {
		return RandomStringUtils.randomAlphabetic(5) + "@" + RandomStringUtils.randomNumeric(10);
	}

	// Capture Screenshot
	public String captureScreen(String tname) throws IOException {
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

		String folderPath = System.getProperty("user.dir") + "\\screenshots";
		File folder = new File(folderPath);
		if (!folder.exists()) {
			folder.mkdirs(); // Create folder if not exists
		}

		String targetFilePath = folderPath + "\\" + tname + "_" + timeStamp + ".png";
		File targetFile = new File(targetFilePath);
		FileUtils.copyFile(sourceFile, targetFile);

		return targetFilePath;
	}
}
