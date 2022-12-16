package com.generalPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver_4 {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://demo.opencart.com/");
		
		WebElement e = d.findElement(By.xpath("//a[normalize-space() = 'Desktops']"));
		WebElement ele = d.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		
		
		Actions act = new Actions(d);
		act.moveToElement(e).moveToElement(ele).click().perform();
		
		
		d.quit();
	}

}
