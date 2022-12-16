package com.generalPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws Exception {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		d.switchTo().frame("iframeResult");


		WebElement field1 = d.findElement(By.id("field1"));
		WebElement field2 = d.findElement(By.id("field2"));

		field1.clear();
		field1.sendKeys("Priyanaka Chavan");
		
		WebElement cp = 	d.findElement(By.xpath("//button[@ondblclick='myFunction()']"));

		Actions act = new Actions(d);
		act.doubleClick(cp).perform();

		Thread.sleep(3000);
		d.quit();


	}

}
