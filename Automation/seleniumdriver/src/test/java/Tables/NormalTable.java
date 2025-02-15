package Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// https://blazedemo.com/ --> select  the Choose your departure city: , Choose your destination city: ,choose your flight with 200$ and fill all the details and  we will get the string Thank you for your purchase today!

public class NormalTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
 
		Thread.sleep(5000);
		int rows = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();

		System.out.println("Number Of rows:" + rows);

		int coloum = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr[1]/th")).size();
		System.out.println("Number Of coloum:" + coloum);
		
		
		String read=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[7]//td[3]")).getText();

		System.out.println("Read The Data For Table:"+read);
		System.out.println("Bookname"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
		
		Thread.sleep(5000);
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=coloum;c++)
			{
				String value = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+"\t");
			}
			System.out.println("");
		}
	
		Thread.sleep(5000);
		for(int r=2;r<=rows;r++)
		{
			String aut = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//th[2]")).getText();
			if(aut.equals("Mukesh"))
			{
				String book=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[3]")).getText();
				System.out.print(book+"\t"+aut);
			}
		}
		
	}

}
