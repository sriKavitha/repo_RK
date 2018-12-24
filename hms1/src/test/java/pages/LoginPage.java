package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPage {
	WebDriver driver;
	
	@Test
	public void m1() throws InterruptedException
	{
		driver.findElement(By.linkText("HMS")).click();
		driver.findElement(By.name("username")).sendKeys("mahesh");
		driver.findElement(By.name("password")).sendKeys("mahesh");
		driver.findElement(By.name("submit")).click();
		//Thread.sleep(5000);
		//String ur=driver.findElement(By.xpath(".//*[contains(text(),'Welcome,')]")).getText();
		//System.out.println(ur);
		//String s="//*[contains(text(),'Welcome']";
		String actualTitle= driver.getTitle();
		String expectedTitle= "Master Page";
		Assert.assertEquals(actualTitle, expectedTitle);
		//Assert.assertTrue(ur);
	}
	
	

}
