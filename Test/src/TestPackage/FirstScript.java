package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
	
	public static void main (String [] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\19137\\Desktop\\Selenium\\ChromeDriver\\");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("FirstScript");
		
	}

}
