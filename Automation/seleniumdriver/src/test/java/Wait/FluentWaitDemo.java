package Wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


/*
 * 
  Definition: A more flexible wait that polls (checks repeatedly) for a condition at regular intervals until a timeout occurs
 
  Use Case: Useful when elements appear after unpredictable delays (e.g., animation, network latency)
  
  Advantages: Unlike explicit wait, it checks the condition at intervals, reducing load on the system.
  
 * */
public class FluentWaitDemo {

    public static void main(String[] args) {
        // Set the path to ChromeDriver if necessary
        //System.setProperty("webdriver.chrome.driver", "path_to_your_chromedriver");

        WebDriver driver = new ChromeDriver();

        try {
            // Set up FluentWait with a timeout of 30 seconds and polling every 5 seconds
            Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
                    .withTimeout(Duration.ofSeconds(30))  // Maximum time to wait
                    .pollingEvery(Duration.ofSeconds(5))  // Interval between each poll
                    .ignoring(NoSuchElementException.class);  // Exceptions to ignore

            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            driver.manage().window().maximize();

            // Wait until the username input field is available
            WebElement text = mywait.until(new Function<WebDriver, WebElement>() {
                public WebElement apply(WebDriver driver) {
                    return driver.findElement(By.xpath("//input[@placeholder='username']"));
                }
            });

            // Enter the username into the field
            text.sendKeys("hu");
        } catch (Exception e) {
            // Catch and print any unexpected exceptions
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Ensure the driver quits after the execution
            driver.quit();
        }
    }
}
