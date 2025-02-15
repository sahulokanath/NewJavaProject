import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id=\"filesToUpload\"]")).sendKeys("file:///home/lokanath/SeleniumClass/NOTE_OF_SELENIUM/selenium_tutorial.pdf");
		
		if(driver.findElement(By.xpath("//ul[@id=\"fileList\"]//li")).getText().equals("selenium_tutorial.pdf"))
		{
			System.out.println("File Upload Succesfully");
		}
		else
		{
			System.out.println("Upload Failes!");
		}

	}

}
