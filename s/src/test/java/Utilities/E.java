package Utilities;


import  org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class E {
	
	WebDriver d;
	public class Orangehrm {
	
		String baseURL="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		
		@AfterTest
		public void shutdown() {
			d.close();
		}
		
		@BeforeTest
		public void setup() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
			d=new ChromeDriver();
			d.manage().window().maximize();
			d.get(baseURL);
			Thread.sleep(5000);
		}
		
		@Test(dataProvider="DP")
		public void u1(String Username, String Password) throws InterruptedException
		{
			d.findElement(By.id("txtUsername")).sendKeys(Username);
			d.findElement(By.id("txtPassword")).sendKeys(Password);
			d.findElement(By.id("btnLogin")).click();
			String currentURL = d.getCurrentUrl();
			Assert.assertEquals(currentURL,baseURL,"Invalid credentials .... no login");
			d.findElement(By.id("welcome")).click();
			Thread.sleep(5000);
			d.findElement(By.partialLinkText("Logout")).click();
			d.navigate().refresh();	
		}
		@DataProvider(name="DP")
		public Object[][] dataObject(){
			return new Object[][] {
				{"Admin" ,"admin123"},{"sonal", "sonal123" }, {"kajal", "kajal234"}, {"Ruchita","ruch123"}
			};
		
		
		}
	}

}


