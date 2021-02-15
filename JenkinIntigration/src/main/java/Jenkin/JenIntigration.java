package Jenkin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class JenIntigration {
WebDriver driver;
@BeforeMethod
public void setup()
{
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sandy\\\\OneDrive\\\\Desktop\\\\chromedriver.exe");

driver= new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.google.com/");

}

@AfterMethod
public void close()
{
	driver.close();
}

	
	
}
