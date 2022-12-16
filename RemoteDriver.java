package com.generalPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RemoteDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    //	WebDriverManager.ChromeDriver().setup();
    	//	RemoteWebDriver = new ChromeDriver();
		//WebDriver d = new ChromeDriver();
		WebDriver f = new EdgeDriver();
		f.manage().window().maximize();
		f.get("https://www.rediff.com/");
		String actTitle = f.getTitle();
		System.out.println(actTitle);
		String urlName = f.getCurrentUrl();
		System.out.println(urlName);
		Thread.sleep(3000);
		f.navigate().to("https://www.investing.com/");
		f.navigate().refresh();
		f.navigate().back();
		f.navigate().forward();
		Thread.sleep(2000);
		f.quit();
		

	}
}
