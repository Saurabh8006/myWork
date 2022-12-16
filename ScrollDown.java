package com.generalPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://www.naukri.com/");
		 
		JavascriptExecutor j = ((JavascriptExecutor)d);
		j.executeScript("scroll(0,2100)");
		Thread.sleep(3000);
		d.close();
	   d.quit();
	}
}
