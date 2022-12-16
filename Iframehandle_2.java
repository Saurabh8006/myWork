package com.generalPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframehandle_2 {

	public static void main(String[] args) throws InterruptedException {
			WebDriver d = new ChromeDriver();
			d.manage().window().maximize();
			d.manage().deleteAllCookies();
			d.get("https://www.rediff.com/");
			Thread.sleep(3000);
	//		WebElement e = d.findElement(By.xpath("//iframe[@id='aswift_1']"));
			d.switchTo().frame("moneyiframe");
			d.findElement(By.xpath("//span[normalize-space()='NSE']")).click();
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			d.findElement(By.xpath("//input[@id='srchword']")).sendKeys("tata motors");
		//	d.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(3000);
			d.switchTo().defaultContent();
			Thread.sleep(3000);
			
	//	JavascriptExecutor js = ((JavascriptExecutor)d);
	//	js.exe
			d.close();
			
			
			
			
			
		

	}

}
