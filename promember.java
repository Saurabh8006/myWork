package com.generalPractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class promember {
	
		public static void main(String[] args) throws InterruptedException, IOException {
			
			WebDriver d = new ChromeDriver();
			
			d.manage().window().maximize();
			d.manage().window().minimize();
			d.manage().window().maximize();
			d.manage().deleteAllCookies();
			
			d.navigate().to("https://kite.zerodha.com/");
			Thread.sleep(3000);
			Dimension height = d.manage().window().getSize();
			System.out.println(height);
			
			int height2 = d.manage().window().getSize().getHeight();
			int width2 = d.manage().window().getSize().getWidth();
			System.out.println(height2);
			System.out.println(width2);
			
			Point p = new Point(700,400);
			d.manage().window().setPosition(p);
			
			
			Dimension f = new Dimension(1200,500);
			d.manage().window().setSize(f);
			
			String id = d.getWindowHandle();
			System.out.println(id);
			/*
			//take screenshot
			String path = "C:\\Users\\saura\\docs\\saurabh_velocity\\screenshot\\kite.png";
			File img = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			File n = new File(path);
			FileHandler.copy(img, n);
			
			//specificc webelement screenshot
			String path2 = "C:\\Users\\saura\\docs\\saurabh_velocity\\screenshot\\kite2.png";
			WebElement e = 	d.findElement(By.xpath("//img[@src = '/static/images/kite-logo.svg']"));
			File img2 = e.getScreenshotAs(OutputType.FILE);
			File g = new File(path2);
			FileHandler.copy(img2, g);
					
					
				*/	
			d.findElement(By.id("userid")).sendKeys("AR3484");
			Thread.sleep(3000);
			
			d.findElement(By.id("password")).sendKeys("yuroeibncj");
			Thread.sleep(3000);
		//	d.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/form/div[4]/button")).click();
		//	Thread.sleep(3000);
			
			d.findElement(By.xpath("//button[@type = 'submit']")).click();
			Thread.sleep(3000);
			
		//	d.switchTo().newWindow(WindowType.WINDOW);
		/*	d.switchTo().newWindow(WindowType.TAB);
			d.navigate().to("https://www.investing.com/");
			Thread.sleep(3000);
			
			d.navigate().to("https://kite.zerodha.com/");
			Thread.sleep(3000);
			
			String title = d.getTitle();
			System.out.println(title);
			
			String url = d.getCurrentUrl();
			System.out.println(url);
			*/
		//	String source = d.getPageSource();
		//	System.out.println(source);
			
		//	d.getClass();
			System.out.println("we succesfully end");
		//	d.findElement(By.partialLinkText(id));
			d.close();
			d.quit();
				
		}
}
