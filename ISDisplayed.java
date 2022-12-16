package com.generalPractice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISDisplayed {
//verify that logo of paytm application is displaying or not on the home page
	public static void main(String[] args) throws InterruptedException {
		 //	System.setProperty("webdriver.chrome.driver", "C:\\Users\\saura\\docs\\saurabh_velocity\\setup\\chromedriver_win32\\chromedriver.exe");
		 	WebDriver d = new ChromeDriver();
		 	d.manage().deleteAllCookies();
		 	d.manage().window().maximize();
		 	d.navigate().to("https://paytm.com/recharge");
		 //	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 	 WebElement logo = d.findElement(By.xpath("//a[@class ='wpwl']"));
		 	 boolean result = logo.isDisplayed();
		 	 
		 	 if(result==true) {
		 		System.out.println("logo verified and result is " + result);
		 	 }
		 	 else {
		 		 System.out.println("logo is not verified & result is " + result);
		 	 }
		 	 Thread.sleep(2000);
		 	 d.quit();
		 	 
	}

}
