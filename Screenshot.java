package com.generalPractice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws Exception {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://www.investing.com/");
		Thread.sleep(2000);
		/*TakesScreenshot t = ((TakesScreenshot)d);
	     File src = t.getScreenshotAs(OutputType.FILE);
		File des = new File(".\\Screenshot_File\\investing_2.png");
		FileHandler.copy(src, des);*/
		//take screenshot of webelement
		WebElement element = d.findElement(By.xpath("//img[@class='investingLogo']"));
		//img[@alt='Investing.com - Financial Markets Worldwide']
		File a = element.getScreenshotAs(OutputType.FILE);
		String des2 = ".\\Screenshot_File\\logo_2.png";
		File b = new File(des2);
		FileHandler.copy(a, b);
		Thread.sleep(1000);
		d.quit();
	}
}
