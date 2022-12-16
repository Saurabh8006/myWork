package com.generalPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling_5 {

	public static void main(String[] args) throws Exception {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(5000);
		String parentid = d.getWindowHandle();
		System.out.println("parent id = " + parentid);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		JavascriptExecutor js = ((JavascriptExecutor)d);
		js.executeScript("scroll(0,500)");
		Thread.sleep(3000);
		d.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		Set <String>windowids = d.getWindowHandles();
		for(String z : windowids) {
			if(!parentid.equals(z)) {
				d.switchTo().window(z);
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				js.executeScript("scroll(0,400)");
				Thread.sleep(3000);
				d.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Saurabh");
				Thread.sleep(3000);
				d.close();
			}
		}
		d.switchTo().window(parentid);
		d.findElement(By.xpath("//input[@id='name']")).sendKeys("chavan");
		Thread.sleep(3000);
		d.close();		

	}

}
