package com.generalPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAnddrop_2 {

	public static void main(String[] args) throws Exception {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
	WebElement fr = 	d.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		
		d.switchTo().frame(fr);
		
		WebElement img1 = d.findElement(By.xpath("//li[1]"));
		WebElement img2 = d.findElement(By.xpath("//li[2]"));
		WebElement img3 = d.findElement(By.xpath("//li[3]"));
		WebElement img4 = d.findElement(By.xpath("//li[4]"));
		
		WebElement drop = d.findElement(By.id("trash"));
		
		Actions act = new Actions(d);
		act.dragAndDrop(img1, drop).perform();
		act.dragAndDrop(img2, drop).perform();
		act.dragAndDrop(img3, drop).perform();
		act.dragAndDrop(img4, drop).perform();
		
		Thread.sleep(3000);
		
		d.quit();
		
	}

}
