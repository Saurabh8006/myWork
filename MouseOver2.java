package com.generalPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver2 {

	public static void main(String[] args) throws Exception {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = d.findElement(By.xpath("//button[@class='dropbtn']"));

		Actions a = new Actions(d);
		a.moveToElement(ele).perform();
		

		List<WebElement> ele2 = d.findElements(By.xpath("//div[@class='dropdown-content']/a"));
		int count = ele2.size();
		System.out.println("total list count " + count);
		for(int i=0;i<count;i++)
		{
			WebElement f = ele2.get(i);
			String txt = f.getAttribute("innerHTML");
			System.out.println(txt);
			
			if(txt.equals("Appium"))
			{
				f.click();
			}
		}
		Thread.sleep(3000);
		d.quit();
	}
}
