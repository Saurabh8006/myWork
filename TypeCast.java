package com.generalPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeCast {

	public static void main(String[] args) throws InterruptedException {
	    
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.get("https://www.moneycontrol.com/");
		Thread.sleep(2000);
	//	driver.findElement(By.id("login1")).sendKeys("saurabh");
	//	Thread.sleep(3000);
		//driver.getScreenshotAs(OutputType.File);
		
	//	driver.findElement(By.name("login")).sendKeys("Priyanaka");
	//	Thread.sleep(3000);
		
	//	driver.findElement(By.linkText("Forgot Password?")).click();
	//	Thread.sleep(2000);
		
	//	driver.findElement(By.partialLinkText("Forgot")).click();
	//	Thread.sleep(2000);
	//	driver.quit();
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		j.executeScript("scroll(0,2100)");
		Thread.sleep(3000);
		
	//	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mf_sip_corner_dfp']")));
		
		int lists = driver.findElements(By.className("bx-clone")).size();
		System.out.println(lists);
		
	//	driver.switchTo().defaultContent();
		///html/body/div[1]/div[2]/div[1]/a/span[2]
		driver.quit();
	}

}
