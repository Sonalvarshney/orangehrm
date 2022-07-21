package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XML {
	
	WebDriver d;
	
	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
	}
	
	@Test
	@Parameters({"U","P"})
	public void  S(String User  , String Pass ) throws InterruptedException{
		
		d.findElement(By.id("txtUsername")).sendKeys(User);
		d.findElement(By.id("txtPassword")).sendKeys(Pass);
		d.findElement(By.id("btnLogin")).click();
		d.findElement(By.id("welcome")).click();
		Thread.sleep(5000);
		d.findElement(By.partialLinkText("Logout")).click();
		d.navigate().refresh();
		
		
	}
	
}
	


