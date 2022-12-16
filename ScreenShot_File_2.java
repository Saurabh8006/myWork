package com.generalPractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_File_2 {

	public static void main(String[] args) throws InterruptedException, Exception {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://kite.zerodha.com/");
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) d;
		File g = ts.getScreenshotAs(OutputType.FILE);
		 String path = ".\\Screenshot_File\\full_1.png";
		File f = new File(path);
		
		FileHandler.copy(g,f);		
		WebElement ele = d.findElement(By.xpath("//img[@alt='Kite']"));
		File v = ele.getScreenshotAs(OutputType.FILE);
		String path2 = ".\\Screenshot_File\\logo_3.png";
		File x = new File(path2);
		FileHandler.copy(v, x);
		d.quit();
	}
}
