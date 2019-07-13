package SeleniumTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindUS {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Downloads\\selenium\\Chrome Driver\\chromedriver.exe");
		  
		 ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("disable-infobars");
			//options.addArguments("--incognito");
			//options.addArguments("--ignore-certificate-errors");
	        //options.addArguments("--disable-popup-blocking");
			WebDriver driver = new ChromeDriver(options);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			driver.get("https://qatestid12.wixsite.com/qaspecialist");
			 Thread.sleep(5000);
			
			//insert scrool code
			 
			 js.executeScript("window.scrollBy(0,1000)");
				
			
			// WebElement Contact;
			// Contact = driver.findElement(By.xpath("//*[@id=\"comp-ifgtula74label\"]"));
			// Contact.click();
			
			
			   WebElement Name;
			   Name = driver.findElement(By.xpath("//*[@id=\"comp-jhrgftz1input\"]"));
			   Name.clear();
			   Name.sendKeys("Tazeen");
				
				
				//driver.findElement(By.id("input-email")).sendKeys("mytc5@gmail.com");
				
				 WebElement Email;
				 Email = driver.findElement(By.xpath("//*[@id=\"comp-jhrggrufinput\"]"));
				 Email.sendKeys("tazeenahmed1@gmail.com");
				
				WebElement Subject;
				Subject = driver.findElement(By.xpath("//*[@id=\"comp-jhrgh32ainput\"]"));
				Subject.sendKeys("Selenium Automation Training");

				WebElement Message;
				Message = driver.findElement(By.xpath("//*[@id=\"comp-jhrgk2pstextarea\"]"));
				Message.sendKeys("Selenium Automation Testing Training on 13-14 july");
				
				WebElement SubmitButton;
				SubmitButton = driver.findElement(By.xpath("//*[@id=\"comp-jhrgemmllink\"]"));
				SubmitButton.click();
				
						
				Thread.sleep(3000);
					
					driver.close();
					driver.quit();
					
				
				
				
				

	}

}
