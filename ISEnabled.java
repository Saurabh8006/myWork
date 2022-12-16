package com.generalPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISEnabled {

	public static void main(String[] args) throws InterruptedException {
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\saura\\docs\\saurabh_velocity\\setup\\chromedriver_win32\\chromedriver.exe");
	 	WebDriver d = new ChromeDriver();
	 	d.manage().deleteAllCookies();
	 	d.manage().window().maximize();
	 	d.navigate().to("https://www.facebook.com/signup");
	 //	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 	 WebElement fn = d.findElement(By.xpath("//input[@type = 'text']"));
	 	 boolean result = fn.isEnabled();
	 	  if(result == true) {
	 		  System.out.println("First name verified and result is =" + result);
	 		  fn.sendKeys("Priyanka");
	 	  }
	 	  else {
	 		  System.out.println("First name not verified and result is =" + result);
	 	  }
	 	 WebElement sn = d.findElement(By.xpath("//input[@name = 'lastname']"));
	 	  sn.sendKeys("Chavan");
	 	 Thread.sleep(2000);
	 	 d.quit();

	}

}
