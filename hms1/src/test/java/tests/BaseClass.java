package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public WebDriver driver;
@BeforeTest
public void openBrowser()
{
	System.setProperty("webdriver.chrome.driver", "C:\\JavaH2K\\JavaAug_18\\hms1\\src\\test\\java\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://seleniumbymahesh.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
}
@AfterTest
public void closeBrowser()
{
	driver.close();
}
}