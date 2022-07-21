package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://opensource-demo.orangehrmlive.com/");
		d.navigate().refresh();
		Thread.sleep(3000);
		d.navigate().to("https://www.orangehrm.com/"); 
		System.out.println("Page title is : " + d.getTitle());
		Thread.sleep(3000);
		d.navigate().back(); 
		d.navigate().to("https://www.linkedin.com/signup/cold-join?session_redirect=https%3A%2F%2Fwww%2Elinkedin%2Ecom%2Fgroups%3Fhome%3D%26gid%3D891077&trk=login_reg_redirect"); 
		System.out.println("Page title is : " + d.getTitle());
		Thread.sleep(3000);
		d.navigate().back();  

		d.navigate().to("https://www.facebook.com/OrangeHRM"); 
		System.out.println("Page title is : " + d.getTitle());
		Thread.sleep(3000);
		d.navigate().back();  

		d.navigate().to("https://twitter.com/orangehrm"); 
		System.out.println("Page title is : " + d.getTitle());
		Thread.sleep(3000);
		d.navigate().back();  

		d.navigate().to("https://www.youtube.com/orangehrm"); 
		System.out.println("Page title is : " + d.getTitle());
		Thread.sleep(3000);
		d.navigate().back();  

		
		}
	
	}


